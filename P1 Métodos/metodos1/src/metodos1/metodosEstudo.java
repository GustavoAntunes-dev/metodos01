package metodos1;

import java.util.Scanner;

public class metodosEstudo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int numberI = sc.nextInt();
			int numberJ = sc.nextInt();

			int min = min(numberI, numberJ);
			int max = max(numberI, numberJ);
			int maxCycleSize = maxCycleSize(min, max);

			System.out.printf("%d %d %d\n", min, max, maxCycleSize);

		}
		sc.close();
	}

	public static int maxCycleSize(int min, int max) {
		int maxCycleSize = 1;
		for (int i = min; i < max; i++) {
			int cycleSize = cycleSize(i);
			if (cycleSize > maxCycleSize) {
				maxCycleSize = cycleSize;
			}
		}
		return maxCycleSize;
	}

	public static int cycleSize(int i) {
		int cycleSize = 1;
		int value = i;
		while (value != 1) {
			cycleSize++;
			value = nextValue(value);
		}
		return cycleSize;
	}

	public static int nextValue(int value) {
		boolean isEven = value % 2 == 0;
		if (isEven) {
			value = value / 2;
		} else {
			value = 3 * value  + 1;
		}
		return value;
	}

	public static int min(int numberI, int numberJ) {
		if (numberI < numberJ) {
			return numberI;
		} else {
			return numberJ;
		}
	}

	public static int max(int numberI, int numberJ) {
		if (numberI < numberJ) {
			return numberJ;
		} else {
			return numberI;
		}
	}
}