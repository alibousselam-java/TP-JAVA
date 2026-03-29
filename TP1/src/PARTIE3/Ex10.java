package PARTIE3;
import java.util.Scanner;

public class Ex10 {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[][] mat = new int[3][3];
	        int[][] trans = new int[3][3];

	        // remplissage
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("mat[" + i + "][" + j + "] = ");
	                mat[i][j] = sc.nextInt();
	            }
	        }

	        // transpose
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                trans[j][i] = mat[i][j];
	            }
	        }

	        // affichage
	        System.out.println("Matrice transposee :");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(trans[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

