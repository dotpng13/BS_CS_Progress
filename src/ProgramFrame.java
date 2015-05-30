import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class ProgramFrame extends JFrame {
	
	public ProgramFrame(String title) {
		JPanel progressPanel = new ProgressPanel();
		JPanel schedulePanel = new SchedulePanel();
		
		this.setTitle(title);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.addTab("Progress", progressPanel);
		tabbedPane.addTab("Schedule", schedulePanel);
		
		this.add(tabbedPane);
	}
}