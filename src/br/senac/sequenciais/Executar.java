package br.senac.sequenciais;

import java.util.Scanner;

/**
 *
 * @author vieira.felipe
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    static float mediaPonderada(float num1, float num2,
            float num3, float num4) {
        return (num1 + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 10;
    }

    static void Ex1() {
        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        System.out.println("Informe o primeiro numero da media ponderada:");
        num1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero da media ponderada:");
        num2 = scanner.nextFloat();
        System.out.println("Informe o terceiro numero da media ponderada:");
        num3 = scanner.nextFloat();
        System.out.println("Informe o quarto numero da media ponderada:");
        num4 = scanner.nextFloat();
        System.out.println("A media ponderada eh " + mediaPonderada(num1, num2, num3, num4));
    }

    static double calculaHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    static void Ex2() {
        Scanner scanner = new Scanner(System.in);
        double cateto1;
        double cateto2;
        System.out.println("Informe o primeiro cateto:");
        cateto1 = scanner.nextDouble();
        System.out.println("Informe o primeiro cateto:");
        cateto2 = scanner.nextDouble();
        System.out.println("A hipotenusa eh: " + calculaHipotenusa(cateto1, cateto2));
    }
    
    static void Ex3(){
        Scanner scanner = new Scanner(System.in);
        double valor;
        System.out.println("Informe o valor:");
        valor = scanner.nextDouble();
        System.out.println("O novo valor eh: " + valor*0.91);
    }
    
    static double[] calculaRaizes(double a, double b, double c){
        double delta = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        double[] results = {(-b+delta)/(2*a), (-b-delta)/(2*a)};
        return results;
    }
    
    static void Ex4(){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double[] results;
        System.out.println("Informe o o valor de a:");
        a = scanner.nextDouble();
        System.out.println("Informe o o valor de b:");
        b = scanner.nextDouble();
        System.out.println("Informe o o valor de c:");
        c = scanner.nextDouble();
        results = calculaRaizes(a, b, c);
        System.out.printf("As raizes sao: %f e %f%n", results[0], results[1]);
    }
    
    static double calculaRendimento(double aplicacao, double taxa, int numMeses){
        double potencia = Math.pow((1+taxa),numMeses);
        double result = aplicacao*(potencia-1)/taxa;
        return result;
    }
    
    static void Ex5(){
        Scanner scanner = new Scanner(System.in);
        double aplicacaoConstante;
        double taxa;
        int numMeses;
        System.out.println("Informe o valor da aplicacao constante:");
        aplicacaoConstante = scanner.nextDouble();
        System.out.println("Informe a taxa:");
        taxa = scanner.nextDouble();
        System.out.println("Informe o numero de meses:");
        numMeses = scanner.nextInt();
        System.out.printf("Seu rendimento sera: %.2f%n", calculaRendimento(aplicacaoConstante, taxa, numMeses)-numMeses*aplicacaoConstante);
    }

    public static void main(String[] args) {
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
        Ex5();
    }

}
