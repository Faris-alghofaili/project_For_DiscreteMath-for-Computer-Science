
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PrimitiveRootFinder obj = new PrimitiveRootFinder();
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
		while (true) {
			System.out.print("PLease Enter Prime Number: ");
			n = sc.nextInt();
			if (isPrime(n)) {
				break;
			}
			else System.out.println("Not A Prime Enter.");
		}

		List<Integer> primitiveRoots = obj.findPrimitiveRoots(n);
		System.out.println("Primitive roots modulo " + n + ": " + primitiveRoots);
	}}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}