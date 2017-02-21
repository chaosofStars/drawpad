package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ColorPanel extends JPanel {
	/**
	 * ��ɫ��
	 */
	private static final long serialVersionUID = 1L;

	public ColorPanel(final DrawingFrame DFrame){
		
		//���ñ���ɫ�ʹ�С
		this.setBackground(new Color(240,240,240));
		this.setPreferredSize(new Dimension(100, 210));
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 4));
        
		//��ɫ����
	    Color colors[] = {
	    	new Color(0,0,0), new Color(128,0,255), 
	    	new Color(128,64,0), new Color(255,255,255), 
	    	new Color(255,0,0), new Color(255,255,0),
	    	new Color(0,255,0), new Color(0,255,255), 
	    	new Color(0,0,255),	new Color(255,0,255), 
	    	new Color(255,255,128), new Color(128,255,255)};

		//������ť
		for(int i=0; i<colors.length; i++){
	    	JButton jbutton = new JButton();
	    	
	    	//���ð�ť��ɫ
	    	jbutton.setBackground(colors[i]);
	    	
	    	//���ð�ť��С
	    	jbutton.setPreferredSize(new Dimension(30, 30));
	    	
	    	//�����߿�
	    	jbutton.setBorder(BorderFactory.createLoweredBevelBorder());
	    	
	    	//��Ӱ�ť����ɫ���
	    	this.add(jbutton);	    	
	    	//��Ӱ�ť����(�ڲ���)
	    	ActionListener al = new ActionListener(){
	    		public void actionPerformed(ActionEvent e){
	    			//��ȡ��ť����ɫ�������û���Ϊ����ɫ
	    			DFrame. setCommand_colors(((JButton)e.getSource()).getBackground());	
	    		}
	    	};
	    	jbutton.addActionListener(al);
		}
	}
}