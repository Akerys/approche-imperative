package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tab2 = {-1,12,17,14,5,-9,0,18};
		somme(tab1,tab2);
	}

	public static void somme(int[] tab1, int[] tab2) {
		int[] somme = new int[max(tab1.length,tab2.length)];
		if(tab1.length<max(tab1.length,tab2.length)){
			tab1 = Arrays.copyOf(tab1,max(tab1.length,tab2.length));
		}
		else {
			tab2 = Arrays.copyOf(tab2,max(tab1.length,tab2.length));
		}
		for(int i=0;i<somme.length;i++) {
			somme[i]=tab1[i]+tab2[i];
		}
		for(int i=0;i<somme.length;i++) {
			System.out.print("["+somme[i]+"]");
		}
		System.out.print("\n");
	}
	public static int max(int i, int j) {
		if(i>=j) {return i;}
		else {return j;}
	}

}
