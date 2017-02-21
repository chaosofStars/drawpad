package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ToolPanel extends JPanel {
	/**
	 * �Ҳ๤����
	 */
	private static final long serialVersionUID = 1L;

	public ToolPanel(DrawingFrame DFrame){
		
    	this.setBackground(new Color(240,240,240));
    	this.setPreferredSize(new Dimension(100, 530));
    	this.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 1));

        //����һ���߿�
        this.setBorder(BorderFactory.createEtchedBorder());

		//��ť����
        String icons[] = {"Line","Circle","Rect","Font","Save","Help"};
        
        //�������ù�������еİ�ť
    	for(int i=0; i<icons.length; i++) {
    		
	    	JButton jbutton = new JButton();
	    	//���ð�ťͼ��
	    	jbutton.setIcon(new ImageIcon("images/" + icons[i] + ".jpg"));
	    	//���ð�ť��С
	    	Icon icon = jbutton.getIcon();
	    	jbutton.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
	    	//��Ӱ�ť���������	    	
	    	this.add(jbutton);
	    	
	    	//����command
	    	jbutton.setActionCommand(icons[i]);
	    	
	    	//��Ӱ�ť����(�ڲ���)
	    	ActionListener al = new ActionListener(){
	    		public void actionPerformed(ActionEvent e){
	    			//����������õ�e.getActionCommand()������DrawingFrame����
	    			DFrame.setCommand_tools(e.getActionCommand());
	    		}
	    	};
	    	
	    	jbutton.addActionListener(al);
        }
	}
}

