package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		premier(tab);
		longueur(tab);
		dernier(tab);
		modif4to8(tab);
	}

	public static void premier(int[] tab) {
		System.out.println(tab[0]);
	}
	
	public static void longueur(int[] tab) {
		System.out.println(tab.length);
	}
	
	public static void dernier(int[] tab) {
		System.out.println(tab[tab.length-1]);
	}
	
	public static void modif4to8(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
		tab[4]=8;
		for(int i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
	}
}
