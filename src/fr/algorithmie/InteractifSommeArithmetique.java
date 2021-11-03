package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		somme(nb);
		scanner.close();
	}

	public static void somme(int nb) {
		int total = 0;
		for(int i=0;i<=nb;i++) {
			total += i;
		}
		System.out.println(total);
	}
}
