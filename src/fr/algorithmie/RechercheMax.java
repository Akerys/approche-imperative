package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		max(tab);
	}
	
	public static void max(int[] tab) {
		int max = 0;
		for(int i=0;i<tab.length;i++) {
			if(i==0 || tab[i]>=max) {
				max = tab[i];
			}
		}
		System.out.println(max);
	}

}
