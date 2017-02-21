package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape{

	public Rect(int x1,int y1,int x2,int y2,Color color){
		super(x1,y1,x2,y2,color);
	}
	
	//矩形绘图
	public void draw(Graphics g){
		//获取x坐标和y坐标的较小值	
		int x = Math.min(x1, x2);
		int y = Math.min(y1, y2);
		g.setColor(color);
		g.drawRect(x, y, Math.abs(x2-x1), Math.abs(y2-y1));	
	}

	@Override
	public Boolean isContains(int x, int y) {
		if(x>Math.min(x1, x2)&&x<Math.max(x1, x2)
				&&y>Math.min(y1, y2)&&y<Math.max(y1, y2)) {
			return true;
		} else {
			return false;
		}
	}

}
