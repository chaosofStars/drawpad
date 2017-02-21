package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DownPanel  extends JPanel{

	/**
	 * 下方状态栏
	 * 显示文本和坐标
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel  mouse_info1;
	private static JLabel  mouse_info2;

	public DownPanel() {
		//设置背景色和大小
        this.setBackground(new Color(240,240,240));
        this.setPreferredSize(new Dimension(0,25));
        this.setLayout(null);
        
        //创建一个边框
        this.setBorder(BorderFactory.createEtchedBorder());

		JLabel label_help = new JLabel("要获得帮助  , 请点击帮助菜单。");
		
		//移动组件并调整其大小
		label_help.setBounds(3, 1, 500, 22);
	
		mouse_info1 = new JLabel();
		mouse_info2 = new JLabel();
		//移动组件并调整其大小
		mouse_info1.setBounds(550, 1, 100, 22);
		mouse_info2.setBounds(650, 1, 500, 22);
        //创建一个边框
		mouse_info1.setBorder(BorderFactory.createLineBorder(new Color(215,215,215)));
		mouse_info2.setBorder(BorderFactory.createLineBorder(new Color(215,215,215)));
		
		this.add(label_help);
		this.add(mouse_info1);
		this.add(mouse_info2);
		
	}
	
	/**
	 * 设置鼠标信息
	 */
	public static void setMouseInfo(String info){
		mouse_info1.setText(info);
	}

}
