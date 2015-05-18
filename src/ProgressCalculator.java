public class ProgressCalculator {

	public static void main(String[] args) {
		ProgramFrame frame = new ProgramFrame("BS & CS Progress");
		ProgramPanel panel = new ProgramPanel();
		frame.add(panel);
		frame.setSize(800,450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(ProgramFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}