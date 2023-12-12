package BLJRep;

import java.util.Scanner;

public class BLJRep4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        int A = sc.nextInt();
        System.out.println("Insira o valor de B:");
        int B = sc.nextInt();
        sc.close();
        for (int i = A; i <= B; i++) {
            if (i % 2 == 1) {
                System.out.println("É ímpar: " + i);
            }
        }
    }
}
