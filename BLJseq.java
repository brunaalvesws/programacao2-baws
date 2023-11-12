import java.util.*;
 import java.lang.Math;

public class BLJseq {

    public static void exercicio1() {
        System.out.println("Informe quatro números, em sequência");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;
        System.out.println("Resultado da soma: " + soma);
        sc.close();
    }

    public static void exercicio2() {
        System.out.println("Informe três notas, em sequência:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;
        int media = soma / 3;
        System.out.println("Média aritmética: " + media);
        sc.close();
    }

    public static void exercicio3() {
        System.out.println("Insira o salário:");
        Scanner sc = new Scanner(System.in);
        int salario = sc.nextInt();
        double novoSalario =  1.25 * (double) salario;
        System.out.println("Novo salário: " + (int) novoSalario);
        sc.close();
    }

    public static void exercicio4() {
        System.out.println("Insira a base:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Insira a altura:");
        int altura = sc.nextInt();
        int area =  (base * altura) / 2;
        System.out.println("Area do triangulo: " + area);
        sc.close();
    }

    public static void exercicio5() {
        System.out.println("Insira o primeiro número:");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        double n2 = sc.nextInt();
        sc.close();
        if (n1 > 0 && n2 > 0) {
            double potencia = Math.pow(n1, n2);
            System.out.println("Resultado: " + (int) potencia);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }
}
