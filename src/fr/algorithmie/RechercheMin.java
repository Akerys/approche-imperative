package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		min(tab);
	}
	
	public static void min(int[] tab) {
		int min = 0;
		for(int i=0;i<tab.length;i++) {
			if(i==0 || tab[i]<=min) {
				min = tab[i];
			}
		}
		System.out.println(min);
	}

}
