package devoir5;

public class Devision2_1 {
	public static void main(String[] args) {
		try {
			division();
			overflow();
		} catch (ArithmeticException e) {
			System.out.println("Division par 0 !");
			System.out.println(e);
		}
	}
	
	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {
			i--; j = 1 / i;
			} while (true);
	}
	public static void overflow() throws ArithmeticException {
		double b =1;
		do {
			b =2;
			System.out.println(b);
		}while (true);
		}
		




}
