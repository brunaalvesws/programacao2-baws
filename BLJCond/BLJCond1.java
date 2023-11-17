package BLJCond;
import java.util.Scanner;

public class BLJCond1 {

    public static void exercicio1() {
        System.out.println("Insira o primeiro número:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int n2 = sc.nextInt();
        if (n1 < n2) {
        System.out.println("O maior é: " + n2);
        } else if (n1 > n2) {
            System.out.println("O maior é: " + n1);
        } else {
            System.out.println("Os números são iguais");
        }
        sc.close();
    }

    public static void main(String[] args) {
        exercicio1();
    }
}
