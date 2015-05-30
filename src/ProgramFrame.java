
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class ProgramFrame extends JFrame {
	
	public ProgramFrame(String title) {
		this.setLayout(new GridBagLayout());
		
		this.setTitle(title);
		addTabbedPane(this);
		addExitButton(this);
	}
	
	/**
	 * Adds a Tabbed Pane to the middle of the JFrame
	 * 
	 */
	private void addTabbedPane(JFrame frame) {
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel progressPanel = new ProgressPanel();
		JPanel schedulePanel = new SchedulePanel();
		
		tabbedPane.addTab("Progress", progressPanel);
		tabbedPane.addTab("Schedule", schedulePanel);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.ipady = 300;
		c.weightx = 1.0;
		//c.anchor = GridBagConstraints.CENTER;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 1;
		
		frame.add(tabbedPane, c);
	}
	
	/**
	 * Add Exit Button to the bottom-right of the JFrame
	 */
	private void addExitButton(JFrame frame)
	{
		JButton exitButton = new JButton("Exit");
		
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}	
		});
		
		JPanel exitPanel = new JPanel();
		exitPanel.add(exitButton);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;

		c.ipady = 0;
		c.weightx = 1.0;
		c.anchor = GridBagConstraints.LAST_LINE_END; 
		c.insets = new Insets(5,710,0,0); 
		c.gridwidth = 0; 
		c.gridy = 2;       //third row
		
		this.add(exitPanel, c);	
	}
}