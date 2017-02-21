package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	private int radius;
	
	public Circle (int x1,int y1,int x2,int y2,Color color){
		super(x1,y1,x2,y2,color);
		radius = Math.abs((int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawOval(x1-radius, y1-radius, radius*2, radius*2);

	}
	
	@Override
	public Boolean isContains(int x, int y) {
		if((x>=x1-radius||x<=x1+radius)&&(y>=y1-radius||y<=y1+radius)) {
			return true;
		}else {
			return false;
		}
	}
}
