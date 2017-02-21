package action;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import panel.DownPanel;
import panel.DrawingFrame;
import shapes.Circle;
import shapes.Line;
import shapes.Rect;
import shapes.Shape;


public class MyMouseAdapter extends MouseAdapter{
	private String command_tools;
	private Color command_color;
	private int x1,x2,y1,y2;
	private DrawingFrame df;	
	private Shape shape;
	
	//���췽��������DrawingFrame����
	public MyMouseAdapter(DrawingFrame df){
		this.df = df; 				   
		//��������,�õ�DrawingFrame��Graphics����
	}
	
	
				
	/**
	 * 1.��갴��
	 */
	public void mousePressed(MouseEvent e){			
		//�õ���갴��ʱ������
		x1 = e.getX();
		y1 = e.getY();
	}
		
	/**
	 * 2.����ͷ�
	 */
	public void mouseReleased(MouseEvent e) {
		//��ȡ��ťֵ
		x2 = e.getX();
		y2 = e.getY();
	 		//ֱ��
	 		if("Line".equals(command_tools)){
	 			shape = new Line(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();
			}
	 		
	    	//����
			else if("Rect".equals(command_tools)){		
	 			shape = new Rect(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();											
			} 	
	 		
			//��Բ
			else if("Circle".equals(command_tools)){			
	 			shape = new Circle(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();										
			}
	}	
	
		
	/**
	 * 3.��������ͷź�ִ�У�
	 */
	public void mouseClicked(MouseEvent e){
		//��ȡ��ťֵ
		this.command_tools = df.getCommand_tools();	
		this.command_color = df.getCommand_Color();
		x1 = e.getX();
		y1 = e.getY();
		
	
	}
		
	
    /**
     * 4.�����ק����갴�²��ƶ�ʱ�����ϴ�����ֱ������ͷţ�
     */
    public void mouseDragged(MouseEvent e){
		//��ȡ��ťֵ
		this.command_tools = df.getCommand_tools();
		x2 = e.getX();
		y2 = e.getY();
		

	}	
    
	/**
     * ����ƶ�
     */
    public void mouseMoved(MouseEvent e){	
		String x = e.getX()+"";
		String y = e.getY()+"";
		String info =" " + x + "," + y;
		DownPanel.setMouseInfo(info);
    }


}
