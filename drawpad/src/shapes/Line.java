package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {
		
	public Line(int x1,int y1,int x2,int y2,Color color){
		super(x1,y1,x2,y2,color);
		
	}
	
	//Ö±Ïß»æÍ¼
	public void draw(Graphics g){
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);	
	}

	@Override
	public Boolean isContains(int x, int y) {
		if((x-x1)*(y1-x2) == (x1-x2)*(y-y1)) {
			return true;
		} else {
			return false;
		}
	}
		
}
