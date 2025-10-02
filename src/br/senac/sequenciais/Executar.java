package br.senac.sequenciais;

import java.util.Scanner;

/**
 *
 * @author vieira.felipe
 */
public class Executar {

    // Funcao auxiliar do Exercicio 1
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

    // Funcao auxiliar do Exercicio 2
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
    
    // Funcao auxiliar do Exercicio 4
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
        System.out.println("As raizes sao: " + results[0] + " e " + results[1]);
    }
    
    // Funcao auxiliar do Exercicio 5
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
        System.out.println("Seu rendimento sera: " + (calculaRendimento(aplicacaoConstante, taxa, numMeses)-numMeses*aplicacaoConstante));
    }
    
    static void Ex6(){
        Scanner scanner = new Scanner(System.in);
        float cofre;
        float cotacao;
        System.out.println("Quantidade de dolares no cofre:");
        cofre = scanner.nextFloat();
        System.out.println("Cotacao do dolar do dia:");
        cotacao = scanner.nextFloat();
        System.out.println("Voce possui R$" + cofre*cotacao + " em dolar.");
    }
    
    static void Ex7(){
        Scanner scanner = new Scanner(System.in);
        float distancia;
        float velocidade;
        int tempoH;
        int tempoM;
        float tempoAux;
        System.out.println("Distancia entre os pontos (em Km):");
        distancia = scanner.nextFloat();
        System.out.println("Velocidade em Km/h:");
        velocidade = scanner.nextFloat();
        tempoAux = distancia/velocidade;
        tempoH = (int)Math.floor(tempoAux);
        tempoM = (int)(tempoAux-tempoH)*60;
        System.out.println("Voce levara " + tempoH + " horas e "+ tempoM +" minutos para chegar.");
        System.out.println("Sua velocidade em m/s: " + velocidade/3.6);
    }
    
    static void Ex8(){
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float x;
        float y;
        System.out.println("valor de a da primeira reta:");
        a = scanner.nextFloat();
        System.out.println("valor de b da primeira reta:");
        b = scanner.nextFloat();
        System.out.println("valor de c da primeira reta:");
        c = scanner.nextFloat();
        System.out.println("valor de a da segunda reta:");
        d = scanner.nextFloat();
        System.out.println("valor de b da segunda reta:");
        e = scanner.nextFloat();
        System.out.println("valor de c da segunda reta:");
        f = scanner.nextFloat();
        x = (a*f - c*d)/(a*e - b*d);
        y = (c*e - b*f)/(a*e - b*d);
        System.out.println("Valor de X: " + x + "\nValor de Y: " + y);
    }
    
    static void Ex9(){
        Scanner scanner = new Scanner(System.in);
        float celsius;
        System.out.println("Temperatura em Celsius:");
        celsius = scanner.nextFloat();
        System.out.println("Temperatura em Fahrenheit:" + (9*celsius+160)/5);
    }
    
    static void Ex10(){
        Scanner scanner = new Scanner(System.in);
        float valor;
        System.out.println("Informe o valor:");
        valor = scanner.nextFloat();
        System.out.println("Valor das prestacoes: R$" + valor/5);
    }

    public static void main(String[] args) {
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5();
//        Ex6();
//        Ex7();
//        Ex8();
//        Ex9();
        Ex10();
    }

}
