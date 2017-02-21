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
	
	//构造方法，接收DrawingFrame对象
	public MyMouseAdapter(DrawingFrame df){
		this.df = df; 				   
		//创建画布,得到DrawingFrame的Graphics对象
	}
	
	
				
	/**
	 * 1.鼠标按下
	 */
	public void mousePressed(MouseEvent e){			
		//得到鼠标按下时的坐标
		x1 = e.getX();
		y1 = e.getY();
	}
		
	/**
	 * 2.鼠标释放
	 */
	public void mouseReleased(MouseEvent e) {
		//获取按钮值
		x2 = e.getX();
		y2 = e.getY();
	 		//直线
	 		if("Line".equals(command_tools)){
	 			shape = new Line(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();
			}
	 		
	    	//矩形
			else if("Rect".equals(command_tools)){		
	 			shape = new Rect(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();											
			} 	
	 		
			//椭圆
			else if("Circle".equals(command_tools)){			
	 			shape = new Circle(x1, y1, x2, y2, df.getCommand_Color());
	 			df.getShapesAction().addShapes(shape);
	 			df.getShapesAction().ShapesDraw();										
			}
	}	
	
		
	/**
	 * 3.鼠标点击（释放后执行）
	 */
	public void mouseClicked(MouseEvent e){
		//获取按钮值
		this.command_tools = df.getCommand_tools();	
		this.command_color = df.getCommand_Color();
		x1 = e.getX();
		y1 = e.getY();
		
	
	}
		
	
    /**
     * 4.鼠标拖拽（鼠标按下并移动时，不断触发，直到鼠标释放）
     */
    public void mouseDragged(MouseEvent e){
		//获取按钮值
		this.command_tools = df.getCommand_tools();
		x2 = e.getX();
		y2 = e.getY();
		

	}	
    
	/**
     * 鼠标移动
     */
    public void mouseMoved(MouseEvent e){	
		String x = e.getX()+"";
		String y = e.getY()+"";
		String info =" " + x + "," + y;
		DownPanel.setMouseInfo(info);
    }


}
