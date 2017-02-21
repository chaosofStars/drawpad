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
	 * 右侧工具栏
	 */
	private static final long serialVersionUID = 1L;

	public ToolPanel(DrawingFrame DFrame){
		
    	this.setBackground(new Color(240,240,240));
    	this.setPreferredSize(new Dimension(100, 530));
    	this.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 1));

        //创建一个边框
        this.setBorder(BorderFactory.createEtchedBorder());

		//按钮数组
        String icons[] = {"Line","Circle","Rect","Font","Save","Help"};
        
        //遍历设置工具面板中的按钮
    	for(int i=0; i<icons.length; i++) {
    		
	    	JButton jbutton = new JButton();
	    	//设置按钮图标
	    	jbutton.setIcon(new ImageIcon("images/" + icons[i] + ".jpg"));
	    	//设置按钮大小
	    	Icon icon = jbutton.getIcon();
	    	jbutton.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
	    	//添加按钮到工具面板	    	
	    	this.add(jbutton);
	    	
	    	//设置command
	    	jbutton.setActionCommand(icons[i]);
	    	
	    	//添加按钮侦听(内部类)
	    	ActionListener al = new ActionListener(){
	    		public void actionPerformed(ActionEvent e){
	    			//将侦听所获得的e.getActionCommand()，传给DrawingFrame对象
	    			DFrame.setCommand_tools(e.getActionCommand());
	    		}
	    	};
	    	
	    	jbutton.addActionListener(al);
        }
	}
}

