package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		tantque(nb,scanner);
		scanner.close();
	}

	public static void tantque(int nb, Scanner scanner) {
		if(nb>10 || nb<1) {
			while(nb>10 || nb<1) {
				nb = scanner.nextInt();
			}
		}
		System.out.println(nb);
	}
}
