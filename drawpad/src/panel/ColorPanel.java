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
	 * 颜色板
	 */
	private static final long serialVersionUID = 1L;

	public ColorPanel(final DrawingFrame DFrame){
		
		//设置背景色和大小
		this.setBackground(new Color(240,240,240));
		this.setPreferredSize(new Dimension(100, 210));
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 4));
        
		//颜色数组
	    Color colors[] = {
	    	new Color(0,0,0), new Color(128,0,255), 
	    	new Color(128,64,0), new Color(255,255,255), 
	    	new Color(255,0,0), new Color(255,255,0),
	    	new Color(0,255,0), new Color(0,255,255), 
	    	new Color(0,0,255),	new Color(255,0,255), 
	    	new Color(255,255,128), new Color(128,255,255)};

		//创建按钮
		for(int i=0; i<colors.length; i++){
	    	JButton jbutton = new JButton();
	    	
	    	//设置按钮颜色
	    	jbutton.setBackground(colors[i]);
	    	
	    	//设置按钮大小
	    	jbutton.setPreferredSize(new Dimension(30, 30));
	    	
	    	//创建边框
	    	jbutton.setBorder(BorderFactory.createLoweredBevelBorder());
	    	
	    	//添加按钮到颜色面板
	    	this.add(jbutton);	    	
	    	//添加按钮侦听(内部类)
	    	ActionListener al = new ActionListener(){
	    		public void actionPerformed(ActionEvent e){
	    			//获取按钮背景色，并设置画笔为此颜色
	    			DFrame. setCommand_colors(((JButton)e.getSource()).getBackground());	
	    		}
	    	};
	    	jbutton.addActionListener(al);
		}
	}
}