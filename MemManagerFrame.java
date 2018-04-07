import java.io.FileNotFoundException;
import javax.swing.JFrame;

public class MemManagerFrame {
	public static void main (String args[]) throws FileNotFoundException
	{
		JFrame frame = new LoginScreenFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
