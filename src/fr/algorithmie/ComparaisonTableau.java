package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {1,15,-3,8,7,4,-2,28,-1,17,2,3,0,14,-4};
		int[] tab2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		communs(tab1,tab2);
	}

	public static void communs(int[] tab1, int[] tab2) {
		int nb=0;
		if(tab1.length<=tab2.length) {
			for(int i=0;i<tab2.length;i++) {
				for(int j=0;j<tab1.length;j++) {
					if(tab1[i]==tab2[j]) {
						nb++;
					}
				}
			}
			System.out.print(nb);
		}
		else {
			for(int i=0;i<tab1.length;i++) {
				for(int j=0;j<tab2.length;j++) {
					if(tab1[i]==tab2[j]) {
						nb++;
					}
				}
			}
			System.out.print(nb);
		}
	}

}
