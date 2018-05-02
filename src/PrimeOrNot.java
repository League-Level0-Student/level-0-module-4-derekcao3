import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String Jacob = JOptionPane.showInputDialog("Prime or not?");
		int yes = Integer.parseInt(Jacob);
		boolean isprime = true;
		for (int i = 2; i < yes; i++) {
			if (yes % i == 0) {

				isprime = false;
			}
		}

		if (isprime == true) {
			JOptionPane.showMessageDialog(null, "You have a prime number");
		} else {
			JOptionPane.showMessageDialog(null, "You have a composite number");
		}
	}
}