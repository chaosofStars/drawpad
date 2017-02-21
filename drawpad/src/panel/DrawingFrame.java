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
	 * ������
	 */
	private static final long serialVersionUID = 1L;
	
	//����Ĭ��ֵ
	private String command_tools = "Line";
	private Color command_colors = Color.BLACK;
	
	//��DrawPanel��Ϊ����������ShapesAction�������ػ�
	private DrawPanel draw_panel;
	//��궯��
	private MyMouseAdapter ma; 
	private ShapesAction shapesaction;
	
	// ��ʾ������
	public void initUI(){	
		//�������
		//����������
		setMainFrame();
		
	    //�Ҳ����  
		JPanel right_panel = new JPanel();
		this.add(right_panel, BorderLayout.LINE_END);
		right_panel.setPreferredSize(new Dimension(100,0));
			//���Ϲ������
			JPanel tool_panel = new ToolPanel(this);
			right_panel.add(BorderLayout.NORTH,tool_panel);
			//������ɫѡ�����
			JPanel color_panel = new ColorPanel(this);
			right_panel.add(BorderLayout.SOUTH,color_panel);
	        
		//����ͼ���  
		draw_panel = new DrawPanel(this);
		this.add(draw_panel, BorderLayout.CENTER);
	    //�²�״̬���  
		JPanel down_panel = new DownPanel();
	    this.add(down_panel,BorderLayout.PAGE_END);
	
		//���������ڿɼ�
		this.setVisible(true);

		//��궯����
		ma = new MyMouseAdapter(this);
		shapesaction = new ShapesAction(draw_panel);
		
		//�Ի滭����������
		draw_panel.addMouseListener(ma);
		draw_panel.addMouseMotionListener(ma);
	}

	//���������ڵķ���
	private void setMainFrame() {
		
		//����������
		this.setSize(700, 740);		
		this.setMinimumSize(new Dimension(700,740));
		this.setTitle("��ͼ��");	
		
		//����������ͼ��
		this.setIconImage(new ImageIcon("images/icon.png").getImage());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//������������ΪBorderLayout
		this.setLayout(new BorderLayout());
;
	}
	
	//�õ���������ť
	public String getCommand_tools() {
		return command_tools;
	}
	
	//���ù�������ť
	public void setCommand_tools(String actionCommand) {
		command_tools = actionCommand;
	}
	
	//�õ�ɫ������ť
	public Color getCommand_Color() {
		return command_colors;
	}
	
	//����ɫ������ť
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