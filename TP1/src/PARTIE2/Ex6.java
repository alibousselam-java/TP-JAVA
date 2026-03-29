package PARTIE2;
import java.util.Scanner;

public class Ex6 {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Entrer les 10 nombre : ");

	        int[] tab = new int[10];

	       
	        for (int i = 0; i < 10; i++) {
	            System.out.print("tab[" + i + "] = ");
	            tab[i] = sc.nextInt();
	        }

	        System.out.print("Entrer le nombre a chercher : ");
	        int x = sc.nextInt();

	        boolean trouve = false;

	        for (int i = 0; i < 10; i++) {
	            if (tab[i] == x) {
	                System.out.println("Trouve a la position : " + i);
	                trouve = true;
	                break;
	            }
	        }

	        if (!trouve) {
	            System.out.println("Nombre non trouve");
	        }

	        sc.close();
	    }
	}

