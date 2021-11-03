package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {

	public static void main(String[] args) {
		int start = 10;
		int batons = 0;
		int tour = 0;
		String joueur = new String();
		 
		System.out.println("Le nombre de bâtons est de "+ start);
		System.out.println("Enlevez 1 à 3 bâtons par tour");
		System.out.println("Si vous prenez le dernier bâton vous perdez\n");
		Scanner scanner = new Scanner(System.in);
		int choix;
		
		do{
			if(tour % 2 == 0 || tour == 0) {joueur = "Ordinateur";}
			else {joueur = "Joueur";}
			tour++;
		 
			
			if(joueur.equalsIgnoreCase("Ordinateur")) {
				Random random = new Random();
				choix = random.nextInt(4);
				if((choix<=3) && (choix>=1)) {System.out.println("L'ordinateur retire "+choix+" bâtons");}
			}
			else {
				System.out.println("Combien de bâtons retirer ?");
				choix = scanner.nextInt();
			}
		 
			while(choix > 3 || choix < 1){
				if(joueur.equalsIgnoreCase("Ordinateur")) {			
					Random random = new Random();
					choix = random.nextInt(4);
					if((choix<=3) && (choix>=1)) {System.out.println("L'ordinateur retire "+choix+" bâtons");}
				}
				else {
					System.out.println("Combien de bâtons retirer ?");
					choix = scanner.nextInt();
				}
			}
			
			if(tour==1){batons = start - choix;}
			if(tour>1){batons = batons - choix;}
			if(batons>=1) {System.out.println("Il reste "+batons+" bâtons\n");}
		 
		}while(batons>0);
		
		
		if(joueur.equalsIgnoreCase("Ordinateur")) {joueur = "Joueur";}
		else {joueur = "Ordinateur";}
		System.out.println(joueur+" a gagné\n");
		scanner.close();
		}

}
