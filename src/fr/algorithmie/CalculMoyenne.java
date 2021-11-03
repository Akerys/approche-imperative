package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		moy(tab);
	}
	
	public static void moy(int[] tab) {
		float somme = 0;
		for(int i=0;i<tab.length;i++) {
				somme += tab[i];
		}
		System.out.println(somme/tab.length);
	}

}
