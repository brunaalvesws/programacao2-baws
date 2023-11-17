package BLJCond;
import java.util.Scanner;

public class BLJCond3 {
    public static void exercicio3() {
        System.out.println("Insira um número:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        
        if (n1 % 2 == 0) {
            System.out.println(n1 + " é par");
        } else {
            System.out.println(n1 + " é ímpar");
        }
        sc.close();
    }

    public static void main(String[] args) {
        exercicio3();
    }
}
