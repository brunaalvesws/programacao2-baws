import java.util.Scanner;

public class BLJCond5 {
    public static void exercicio5() {
        System.out.println("Digite 1 para somar;\n" + //
                            "Digite 2 para subtrair;\n" + //
                            "Digite 3 para multiplicar;\n" + //
                            "Digite 4 para dividir;");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        System.out.println("Insira o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int n2 = sc.nextInt();
        sc.close();
        if (op == 1) {
             System.out.println("Soma: " + (n1+n2));
        } else if (op == 2) {
            System.out.println("Subtração: " + (n1-n2));
        } else if (op == 3) {
            System.out.println("Multiplicação: " + (n1*n2));
        } else if (op == 4) {
           if (n2 == 0) {
            System.out.println("Divisão por zero.");
           } else {
            System.out.println("Divisão: " + (n1/n2));
           }
        }
    }

    public static void main(String[] args) {
        exercicio5();
    }
}
