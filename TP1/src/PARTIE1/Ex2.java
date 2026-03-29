package PARTIE1;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : ");
        int a = sc.nextInt();

        System.out.print("Entrer le deuxième nombre : ");
        int b = sc.nextInt();

        System.out.print("Entrer le troisième nombre : ");
        int c = sc.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Le plus grand est : " + max);

        sc.close();
    }
}

