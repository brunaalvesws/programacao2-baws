package BLJRep;

import java.util.Scanner;

public class BLJRep3 {
    public static void main(String[] args) {
        System.out.println("Insira um número:");
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int contador = 0;
        while (entrada != 0) {
            if (entrada > 0) {
                contador += 1;
            }
            System.out.println("Insira um número:");
            entrada = sc.nextInt();
        }
        sc.close();
        System.out.println("Quantidade de positivos: " + contador);
    }
}
