import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame mainmenu = new JFrame("The Baseball Trajectory Calculator - by Carter Weiss");
		JPanel panel = new JPanel();
		JLabel exitvelocityindicator = new JLabel("Exit Velocity:");
		JTextField exitvelocity = new JTextField();
		JLabel launchangleindicator = new JLabel("Launch Angle:");
		JTextField launchangle = new JTextField();
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