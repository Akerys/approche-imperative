package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		endroit(tab);
		envers(tab);
		copie(tab);

	}
	
	public static void endroit(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
	}
	
	public static void envers(int[] tab) {
		for(int i=tab.length-1;i>=0;i--) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
	}
	
	public static void copie(int[] tab) {
		int[] tabcopie = new int[tab.length];
		for(int i=0;i<tab.length;i++) {
			tabcopie[i] = tab[i];
		}
		for(int i=0;i<tabcopie.length;i++) {
			System.out.print("["+tabcopie[i]+"]");
		}
		System.out.print("\n");
	}

}
