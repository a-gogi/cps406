import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class MemberPracticesFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MemberPracticesFrame() {
		setTitle("Practices");
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		createPanelScheduled();
		
		createAllPanels();
	}
	private void createPanelScheduled()
	{
		JPanel panelScheduled = new JPanel();
		getContentPane().add(panelScheduled);
		panelScheduled.setLayout(new BorderLayout(0, 0));
		
		JLabel lblScheduledPractices = new JLabel("Scheduled Practices");
		panelScheduled.add(lblScheduledPractices, BorderLayout.NORTH);
		
		JTextArea txtScheduledList = new JTextArea();
		panelScheduled.add(txtScheduledList, BorderLayout.CENTER);
		
		JPanel panelControls = new JPanel();
		panelScheduled.add(panelControls, BorderLayout.SOUTH);
		panelControls.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnAdd = new JButton("Add");
		panelControls.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		panelControls.add(btnRemove);
		
		JButton btnExit = new JButton("Exit");
		panelControls.add(btnExit);
	}
	private void createAllPanels()
	{
		JPanel panelAllPractices = new JPanel();
		getContentPane().add(panelAllPractices);
		panelAllPractices.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAvailablePractices = new JLabel("Available Practices");
		panelAllPractices.add(lblAvailablePractices, BorderLayout.NORTH);
		
		JPanel panelRadioButtons = new JPanel();
		panelAllPractices.add(panelRadioButtons, BorderLayout.CENTER);
		panelRadioButtons.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtpracticeOne = new JRadioButton("Practice 1\r\n");
		panelRadioButtons.add(rdbtpracticeOne);
		
		JRadioButton rdbtnPracticeTwo = new JRadioButton("Practice 2");
		panelRadioButtons.add(rdbtnPracticeTwo);
	}
}
