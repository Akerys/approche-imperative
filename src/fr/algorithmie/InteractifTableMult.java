package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		tantquemultiplie(nb,scanner);
		scanner.close();
	}

	public static void tantquemultiplie(int nb, Scanner scanner) {
		if(nb>10 || nb<1) {
			while(nb>10 || nb<1) {
				nb = scanner.nextInt();
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(nb+"*"+(i+1)+"="+nb*(i+1));
		}
	}
}
