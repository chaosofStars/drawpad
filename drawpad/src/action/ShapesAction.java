package action;
import java.awt.Color;
import java.util.HashSet;

import panel.DrawPanel;
import shapes.Shape;

public class ShapesAction { 
	HashSet<Shape>  shapes = new HashSet<Shape>();
	private DrawPanel drawpanel;
	
	public void addShapes(Shape shape) {
		shapes.add(shape);
	}
	
	public ShapesAction(DrawPanel drawpanel) {
		this.drawpanel = drawpanel;
	}
	
	public void ShapesDraw() {
		
		for (Shape s : shapes) {
			s.draw(drawpanel.getGraphics());
		}
	}

	public void whichShape(int x1, int y1,Color color) {
		for(Shape s : shapes) {
			if(s.isContains(x1, y1)) {
				s.setColor(color);
			}
		}
		ShapesDraw();
	}
	
	public Boolean isContents(int x1, int y1) {
		Boolean isContents = false;
		for(Shape s : shapes) {
			if(s.isContains(x1, y1)) {
				isContents =  true;
			}
		}
		return isContents;
	}
	
	
}
