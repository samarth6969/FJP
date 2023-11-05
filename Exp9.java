package exp9;

class Operation {
	int result, result1;
	int a[] = new int[2];

	Operation(int x, int y) {
		a[0] = x;
		a[1] = y;
	}

	void operation() {
		try {
			result = a[0] / a[2];
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		} catch (NumberFormatException e) {
			System.out.println("Exception: " + e);
		} finally {
			result = a[0] + a[1];
			System.out.println("result: " + result);
		}
		result1 = a[0] / a[1];
	}
}

public class Exp9 {

	public static void main(String[] args) {
		System.out.print("Name: Om Shinde\nRoll no: 32358\nBatch: M7\n\n");
		Operation o = new Operation(10, 7);
		o.operation();
	}

}
