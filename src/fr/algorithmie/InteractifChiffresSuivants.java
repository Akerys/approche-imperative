package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		suivants10(nb);
		scanner.close();
	}

	public static void suivants10(int nb) {
		for(int i=0;i<=10;i++) {
			System.out.println(nb++);
		}
	}
}
