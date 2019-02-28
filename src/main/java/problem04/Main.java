package problem04;

import java.util.Random;

public class Main {	
	public static void main(String[] args) {
		for (int x = 1; x <= 9; x++) {
			int nRan1 = new Random().nextInt(9) + 1;
			int nRan2 = new Random().nextInt(9) + 1;
			
			while (nRan1 == nRan2) {
				nRan2 = new Random().nextInt(9) + 1;
			}			
			System.out.printf("%d * %d \t", x, nRan1);
			System.out.printf("%d * %d \t", x, nRan2);
			System.out.println();
		}
	}
}