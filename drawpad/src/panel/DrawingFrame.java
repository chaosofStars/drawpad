package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import action.MyMouseAdapter;
import action.ShapesAction;




public class DrawingFrame extends JFrame {
	/**
	 * 画板框架
	 */
	private static final long serialVersionUID = 1L;
	
	//设置默认值
	private String command_tools = "Line";
	private Color command_colors = Color.BLACK;
	
	//把DrawPanel作为参数传出给ShapesAction，用于重绘
	private DrawPanel draw_panel;
	//鼠标动作
	private MyMouseAdapter ma; 
	private ShapesAction shapesaction;
	
	// 显示主窗口
	public void initUI(){	
		//外观设置
		//设置主窗口
		setMainFrame();
		
	    //右侧面板  
		JPanel right_panel = new JPanel();
		this.add(right_panel, BorderLayout.LINE_END);
		right_panel.setPreferredSize(new Dimension(100,0));
			//右上工具面板
			JPanel tool_panel = new ToolPanel(this);
			right_panel.add(BorderLayout.NORTH,tool_panel);
			//右下颜色选择面板
			JPanel color_panel = new ColorPanel(this);
			right_panel.add(BorderLayout.SOUTH,color_panel);
	        
		//左侧绘图面板  
		draw_panel = new DrawPanel(this);
		this.add(draw_panel, BorderLayout.CENTER);
	    //下侧状态面板  
		JPanel down_panel = new DownPanel();
	    this.add(down_panel,BorderLayout.PAGE_END);
	
		//设置主窗口可见
		this.setVisible(true);

		//鼠标动作）
		ma = new MyMouseAdapter(this);
		shapesaction = new ShapesAction(draw_panel);
		
		//对绘画面板添加侦听
		draw_panel.addMouseListener(ma);
		draw_panel.addMouseMotionListener(ma);
	}

	//设置主窗口的方法
	private void setMainFrame() {
		
		//设置主窗口
		this.setSize(700, 740);		
		this.setMinimumSize(new Dimension(700,740));
		this.setTitle("画图板");	
		
		//设置主窗口图标
		this.setIconImage(new ImageIcon("images/icon.png").getImage());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//将主窗口设置为BorderLayout
		this.setLayout(new BorderLayout());
;
	}
	
	//得到工具栏按钮
	public String getCommand_tools() {
		return command_tools;
	}
	
	//设置工具栏按钮
	public void setCommand_tools(String actionCommand) {
		command_tools = actionCommand;
	}
	
	//得到色彩栏按钮
	public Color getCommand_Color() {
		return command_colors;
	}
	
	//设置色彩栏按钮
	public void setCommand_colors(Color background) {
		command_colors = background;
	}
	
	public DrawPanel getDrawPanel() {
		return draw_panel;
	}
	
	public ShapesAction getShapesAction() {
		return shapesaction;
	}
}