package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;



public class DrawPanel extends JPanel {

	/**
	 * ��߻���
	 */
	private static final long serialVersionUID = 1L;
	
	DrawingFrame df;
	
	public DrawPanel(DrawingFrame DFrame){		
		//���ñ���ɫ�ʹ�С
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(0,0));
        
    	//����һ�����а���б���Ե�ı߿�
    	this.setBorder(BorderFactory.createLoweredBevelBorder());
        
        this.df = DFrame;
		
	}
	
	
	

}
