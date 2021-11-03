package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tab2 = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
		somme(tab1,tab2);
	}

	public static void somme(int[] tab1, int[] tab2) {
		int[] somme = new int[tab1.length];
		for(int i=0;i<tab1.length;i++) {
			somme[i]=tab1[i]+tab2[i];
		}
		for(int i=0;i<somme.length;i++) {
			System.out.print("["+somme[i]+"]");
		}
		System.out.print("\n");
	}
}
