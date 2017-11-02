import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame mainmenu = new JFrame("The Baseball Trajectory Calculator - by Carter Weiss");
		JPanel panel = new JPanel();
		JLabel exitvelocityindicator = new JLabel("Exit Velocity:");
		JTextField exitvelocity = new JTextField(3);
		JLabel launchangleindicator = new JLabel("Launch Angle:");
		JTextField launchangle = new JTextField(3);
		panel.add(exitvelocityindicator);
		panel.add(exitvelocity);
		panel.add(launchangleindicator);
		panel.add(launchangle);
		mainmenu.add(panel);
		mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainmenu.pack();
		mainmenu.setVisible(true);
	}

}