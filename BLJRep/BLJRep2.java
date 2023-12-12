package BLJRep;

import java.util.Scanner;

public class BLJRep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        int A = sc.nextInt();
        System.out.println("Insira o valor de B:");
        int B = sc.nextInt();
        sc.close();
        System.out.println("Série numérica:");
        for (int i = A+1; i < B; i++) {
            System.out.print(i + " ");
        }
    }
}
