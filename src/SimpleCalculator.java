
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 1; i > 0; i++) {
			
		
		String Jacob = JOptionPane.showInputDialog("gimme numba");
		String Jacob2 = JOptionPane.showInputDialog("gimme another numba");
		int number1 = Integer.parseInt(Jacob);
		int number2 = Integer.parseInt(Jacob2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Operation", "u read this", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" }, null);
		System.out.println(operation);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		if (operation == 0) {
			add(number1, number2);
		}
		if (operation == 1) {
			subtract(number1, number2);
		}
		if (operation == 2) {
			multiply(number1, number2);
		}
		if (operation == 3) {
			divide(number1, number2);
		}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	public static void add(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 + number2);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	public static void subtract(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 - number2);
	}

	public static void multiply(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 * number2);
	}

	public static void divide(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 / number2);
	}
}