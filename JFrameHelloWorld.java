import javax.swing.*;//���ڿ�
public class JFrameHelloWorld{
    public static void main(String[] args){
	    JFrame frame = new JFrame("JFrame��ʾ,����һ�����ڿ�");
		JPanel pane = new JPanel();//���
		JLabel label = new JLabel("Hello World �������");//���ֱ�ǩ
		pane.add(label);
		frame.setContentPane(pane);
		frame.setSize(500,300);
		frame.setVisible(true);
		
	}
}