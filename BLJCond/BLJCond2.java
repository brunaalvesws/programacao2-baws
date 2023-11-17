package BLJCond;
import java.util.Scanner;

public class BLJCond2 {
    public static void exercicio2() {
        System.out.println("Insira o primeiro número:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int n2 = sc.nextInt();
        System.out.println("Insira o terceiro número:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        exercicio2();
    }
}
