import java.util.concurrent.TimeUnit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PushUp {
	public static void main(String [] args) throws InterruptedException{
		int c;
		String message = "TIME TO DO PUSHUPS!";
		String label = "PUSHUPS";
		Icon icon = new ImageIcon("www.kandykandy.com/wp-content/uploads/2016/03/arm_ios.png");

		for (int i = 0; i <= 10; i++){
			TimeUnit.SECONDS.sleep(5);
			System.out.println("TIME FOR PUSHUPS!");
			JOptionPane.showMessageDialog(new JFrame(), message, label, 
					JOptionPane.INFORMATION_MESSAGE, icon);
		}
			
	}
}
