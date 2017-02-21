package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;



public class DrawPanel extends JPanel {

	/**
	 * 左边画板
	 */
	private static final long serialVersionUID = 1L;
	
	DrawingFrame df;
	
	public DrawPanel(DrawingFrame DFrame){		
		//设置背景色和大小
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(0,0));
        
    	//创建一个具有凹入斜面边缘的边框
    	this.setBorder(BorderFactory.createLoweredBevelBorder());
        
        this.df = DFrame;
		
	}
	
	
	

}
