import java.util.Scanner;

public class BLJCond4 {
    public static void exercicio4() {
        System.out.println("Insira o primeiro número:");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        double n2 = sc.nextInt();
        sc.close();
        if (n1 ==n2) {
            System.out.println("Multiplicação: " + (int)(n1*n2));
        } else if (n1 > n2) {
            System.out.println("Subtração: " + (int)(n1-n2));
        } else {
            System.out.println("Soma: " + (int)(n1+n2));
        }
    }

    public static void main(String[] args) {
        exercicio4();
    }
}
