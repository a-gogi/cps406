import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MembershipStatusFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MembershipStatusFrame() {
		setTitle("Membership Status");
		createPanelButton();
		createPanelInfo();	
		}
	private void createPanelButton()
	{
		JPanel panelButton = new JPanel();
		getContentPane().add(panelButton, BorderLayout.SOUTH);
		panelButton.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnPayCurrentMonth = new JButton("Pay Current Month");
		panelButton.add(btnPayCurrentMonth);
		
		JButton btnPayNextMonth = new JButton("Pay Next Month");
		panelButton.add(btnPayNextMonth);
		
		JButton btnExit = new JButton("Exit");
		panelButton.add(btnExit);
	}
	private void createPanelInfo()
	{
		JPanel panelInfo = new JPanel();
		getContentPane().add(panelInfo, BorderLayout.CENTER);
		panelInfo.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblCurrentMonthStatus = new JLabel("Current Month Status:");
		panelInfo.add(lblCurrentMonthStatus);
		
		JLabel lblCurrentMonthValue = new JLabel("Not paid");
		panelInfo.add(lblCurrentMonthValue);
		
		JLabel lblNextMonthStatus = new JLabel("Next Month Status:");
		panelInfo.add(lblNextMonthStatus);
		
		JLabel lblNextMonthValue = new JLabel("Not Paid");
		panelInfo.add(lblNextMonthValue);
	}
}
