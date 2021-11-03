package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		grand(10,scanner);
		scanner.close();
	}

	public static void grand(int nb, Scanner scanner) {
		int[] saisies = new int[nb];
		for(int i=0;i<10;i++) {
				saisies[i] = scanner.nextInt();
		}
		Arrays.sort(saisies);
		System.out.println(saisies[saisies.length-1]);
	}
}
