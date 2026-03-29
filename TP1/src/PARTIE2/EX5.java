package PARTIE2;
import java.util.Scanner;

public class EX5 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Entrer la taille du tableau : ");
	        int n = sc.nextInt();

	        int[] tab = new int[n];

	        // remplissage
	        for (int i = 0; i < n; i++) {
	            System.out.print("tab[" + i + "] = ");
	            tab[i] = sc.nextInt();
	        }

	        // affichage
	        System.out.println("Les elements du tableau : ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(tab[i] + " ");
	        }

	        sc.close();
	    }
	}

