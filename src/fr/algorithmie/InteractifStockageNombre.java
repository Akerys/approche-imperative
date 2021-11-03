package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		stockage(scanner);
		scanner.close();
	}
	
	public static void stockage(Scanner scanner) {
		int[]tab = new int[0];
		int i = 0;
		while(true) {
			System.out.println("1. Ajouter un nombre\n2. Afficher les nombres existants");
			int saisie = scanner.nextInt();
			if(saisie==1) {
				tab = Arrays.copyOf(tab,tab.length+1);
				tab[i] = scanner.nextInt();
				i++;
			}
			if(saisie==2) {
				for(i=0;i<tab.length;i++) {
					System.out.print("["+tab[i]+"]");
				}
				System.out.print("\n");
				break;
			}			
		}

		
	}

}
