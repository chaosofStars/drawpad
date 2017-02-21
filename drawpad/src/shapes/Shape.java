 package shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	public int x1,y1,x2,y2;
	public Color color;
	
	public Shape(int x1,int y1,int x2,int y2,Color color){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}
	public abstract void draw(Graphics g);	
	public abstract Boolean isContains(int x,int y);
	public void setColor(Color color) {
		this.color = color;
	}
	public void moveShape() {
		
	}
	
}
