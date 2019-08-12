import javax.swing.*;//窗口框
public class JFrameHelloWorld{
    public static void main(String[] args){
	    JFrame frame = new JFrame("JFrame演示,这是一个窗口框");
		JPanel pane = new JPanel();//面板
		JLabel label = new JLabel("Hello World 你好世界");//文字标签
		pane.add(label);
		frame.setContentPane(pane);
		frame.setSize(500,300);
		frame.setVisible(true);
		
	}
}