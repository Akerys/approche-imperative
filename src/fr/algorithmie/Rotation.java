package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {0,1,2,3};
		for(int i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
		tab = rotation(tab);
		for(int i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
	}
	public static int[] rotation(int[] tab) {
		int[] copie = Arrays.copyOf(tab,tab.length);
		for(int i=0;i<tab.length;i++) {
			if(i==0) {tab[i]=tab[tab.length-1];}
			else {tab[i]=copie[i-1];}
		}
		return tab;
	}
}
