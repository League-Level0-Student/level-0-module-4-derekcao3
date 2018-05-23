import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class PracticeTest {
	public static void main(String[] args) {
		Robot JacobPerez = new Robot();
		JacobPerez.setSpeed(10);
		JacobPerez.penDown();
		for (int i = 0; i < 4; i++) {
			JacobPerez.turn(90);
			JacobPerez.move(100);
		}
		String shape = JOptionPane.showInputDialog("How many squares do you do you want?");
		int squares = Integer.parseInt(shape);
		for (int j = 0; j < squares; j++) {
			JacobPerez.penDown();
			for (int i = 0; i < 4; i++) {
				
				JacobPerez.move(100);
				JacobPerez.turn(90);
			}
			JacobPerez.penUp();
			JacobPerez.move(100);
		}
	}
}
