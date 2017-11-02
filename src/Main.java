import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String args[]) {
		JFrame mainmenu = new JFrame("The Baseball Trajectory Calculator - by Carter Weiss");
		JPanel panel = new JPanel();
		JLabel exitvelocityindicator = new JLabel("Exit Velocity:");
		JTextField exitvelocityfield = new JTextField(3);
		JLabel launchangleindicator = new JLabel("Launch Angle:");
		JTextField launchanglefield = new JTextField(3);
		JButton calculate = new JButton("Begin Calculations");
		panel.add(exitvelocityindicator);
		panel.add(exitvelocityfield);
		panel.add(launchangleindicator);
		panel.add(launchanglefield);
		panel.add(calculate);
		calculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int exitvelocity = Integer.parseInt(exitvelocityfield.getText());
				int launchangle = Integer.parseInt(launchanglefield.getText());
				int x = (int) (exitvelocity * Math.cos(launchangle));
				int y = (int) (exitvelocity * Math.sin(launchangle));
			}
		});
		mainmenu.add(panel);
		mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainmenu.pack();
		mainmenu.setVisible(true);
	}

}