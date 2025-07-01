import java.util.ArrayList;
import java.util.List;

public class PrimitiveRootFinder {

	public List<Integer> findPrimitiveRoots(int n) {
		List<Integer> primitiveRoots = new ArrayList<>();
		for (int g = 1; g < n; g++) {
			if (isPrimitiveRoot(g, n)) {
				primitiveRoots.add(g);
			}
		}
		return primitiveRoots;
	}

	private boolean isPrimitiveRoot(int g, int n) {
		List<Integer> powersModN = new ArrayList<>();
		for (int i = 1; i <= n-1; i++) {
			int powerModN = calculatePowerModN(g, i, n);
			if (powersModN.contains(powerModN) || powerModN == 0) {
				return false;
			}
			powersModN.add(powerModN);
		}
		return !powersModN.isEmpty();
	}

	private int calculatePowerModN(int base, int exponent, int n) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result = (result * base) % n;
		}
		return result;
	}

}