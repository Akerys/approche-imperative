package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		fibonnaci(scanner.nextInt());
		scanner.close();
	}
	
	public static void fibonnaci(int n) {
        int nbr1=0;
        int nbr2=1;
        int nbr3=nbr1 + nbr2; 
        if(n==0) {System.out.print(nbr1);}   
        if(n==1 || n==2) {System.out.print(nbr2);}
        else {
        	for(int i=2; i<n+1; ++i){    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;         
        	}
        	System.out.print(nbr3);
        }
	}

}
