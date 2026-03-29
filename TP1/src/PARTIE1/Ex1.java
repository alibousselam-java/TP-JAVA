package PARTIE1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Le nombre est Positif");
        } 
        else if (n < 0) {
            System.out.println("Le nombre est Negatif");
        } 
        else {
            System.out.println("Le nombre est Nul");
        }

        sc.close();
    }
}
