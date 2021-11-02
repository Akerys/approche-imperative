package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		endroit(tab);
		envers(tab);
		sup3(tab);
		pair(tab);
		indexpair(tab);
		impair(tab);
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
	
	public static void sup3(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>3) {
				System.out.print("["+tab[i]+"]");
			}
		}
		System.out.print("\n");
	}
	
	public static void pair(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			if(tab[i]%2==0) {
				System.out.print("["+tab[i]+"]");
			}
		}
		System.out.print("\n");
	}
	
	public static void indexpair(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			if(i%2==0) {
				System.out.print("["+tab[i]+"]");
			}
		}
		System.out.print("\n");
	}
	
	public static void impair(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			if(tab[i]%2!=0) {
				System.out.print("["+tab[i]+"]");
			}
		}
		System.out.print("\n");
	}
}
