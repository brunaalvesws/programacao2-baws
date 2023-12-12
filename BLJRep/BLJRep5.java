package BLJRep;

import java.util.Scanner;

public class BLJRep5 {
    public static void main(String[] args) {
        boolean primo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int n = sc.nextInt();
        sc.close();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }
}
