package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			// System.out.println(Double.parseDouble(args[0]) /
			// Double.parseDouble(args[1]));
			double ex = Double.parseDouble(args[0]) / Double.parseDouble(args[1]);
			System.out.println(10 / 0);
		} catch (NumberFormatException nf) {
			System.out.println("Value should be Integer");
		} catch (ArithmeticException ae) {
			System.out.println("Value should not be divided by zero ");
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aib) {
			System.out.println("No value or values more than 2");
		} finally {
			System.out.println("Bye!");
		}

	}
}
