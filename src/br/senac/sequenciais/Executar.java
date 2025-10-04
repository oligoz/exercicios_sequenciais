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
    
    static void Ex11(){
        Scanner scanner = new Scanner(System.in);
        float valor;
        float percentual;
        System.out.println("Informe o valor:");
        valor = scanner.nextFloat();
        System.out.println("Informe o acrescimo percentual (%):");
        percentual = scanner.nextFloat();
        System.out.println("O valor sera: R$" + valor*(1+percentual/100));
    }
    
    static void Ex12(){
        Scanner scanner = new Scanner(System.in);
        float valor;
        float percentual;
        System.out.println("Informe o valor de fabrica:");
        valor = scanner.nextFloat();
        System.out.println("O valor sera: R$" + (valor+(valor*0.45)+(valor*0.55*0.28)));
    }
    
    static void Ex13(){
        Scanner scanner = new Scanner(System.in);
        float lado;
        System.out.println("Informe o lado do quadrado:");
        lado = scanner.nextFloat();
        System.out.println("O perimetro sera: " + lado*4 + "\nA area sera: " + Math.pow(lado, 2));
    }
    
    static void Ex14(){
        Scanner scanner = new Scanner(System.in);
        float salario;
        System.out.println("Informe o salario:");
        salario = scanner.nextFloat();
        System.out.println("O novo salario sera: R$" + salario*1.37);
    }
    
    static void Ex15(){
        Scanner scanner = new Scanner(System.in);
        int segundos;
        int horas;
        int minutos;
        System.out.println("Informe o tempo em segundos:");
        segundos = scanner.nextInt();
        minutos = (int)Math.floor(segundos/60);
        segundos = segundos%60;
        horas = (int)Math.floor(minutos/60);
        minutos = minutos%60;
        System.out.println("O tempo ser: " + horas + "h " + minutos + "m " + segundos + "s");
    }
    
    static void Ex16(){
        Scanner scanner = new Scanner(System.in);
        int anoNascimento;
        int anoAtual;
        System.out.println("Informe o ano de nascimento:");
        anoNascimento = scanner.nextInt();
        System.out.println("Informe o ano atual:");
        anoAtual = scanner.nextInt();
        System.out.println("Idade atual: " + (anoAtual-anoNascimento) + "\nIdade em 2028: " + (2028-anoNascimento));
    }
    
    static void Ex17(){
        Scanner scanner = new Scanner(System.in);
        float aplicacao;
        float juros;
        System.out.println("Informe a aplicacao:");
        aplicacao = scanner.nextFloat();
        System.out.println("Informe o juros (%):");
        juros = scanner.nextFloat();
        System.out.println("Rendimento: " + (aplicacao*juros/100) + "\nValor final: " + (aplicacao*(1+juros/100)));
    }
    
    static void Ex18(){
        Scanner scanner = new Scanner(System.in);
        float alturaDegrau;
        float alturaObj;
        System.out.println("Informe a altura do degrau (cm):");
        alturaDegrau = scanner.nextFloat();
        System.out.println("Informe a altura que deseja alcancar (m):");
        alturaObj = scanner.nextFloat();
        System.out.println("Quantidade de degraus: " + (alturaObj*100/alturaDegrau));
    }
    
    static void Ex19(){
        Scanner scanner = new Scanner(System.in);
        float peso;
        float altura;
        System.out.println("Informe o peso (Kg):");
        peso = scanner.nextFloat();
        System.out.println("Informe a altura (m):");
        altura = scanner.nextFloat();
        System.out.println("imc: " + (peso/Math.pow(altura, 2)));
    }
    
    static void Ex20(){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Informe o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = scanner.nextInt();
        System.out.println("Potencia: " + Math.pow(num1, num2));
    }
    
    static void Ex21(){
        Scanner scanner = new Scanner(System.in);
        int numApt;
        float valorDiaria;
        float valorProm;
        System.out.println("Informe o numero de apartamentos:");
        numApt = scanner.nextInt();
        System.out.println("Informe o valor da diaria:");
        valorDiaria = scanner.nextFloat();
        valorProm = valorDiaria*0.75f;
        System.out.println("Valor promocional: R$" + valorProm);
        System.out.println("Valor total arrecadado com 100% de ocupacao: R$" + (valorProm*2*numApt));
        System.out.println("Valor total arrecadado com 70% de ocupacao: R$" + (valorProm*2*Math.floor(numApt*0.7)));
        System.out.println("Valor que deixara de ser arrecadado com 100% de ocupacao: R$" + ((valorDiaria*0.25)*2*numApt));
    }
    
    static void Ex22(){
        Scanner scanner = new Scanner(System.in);
        float salario;
        float consumo;
        float valorKw;
        System.out.println("Informe o salario minimo:");
        salario = scanner.nextFloat();
        System.out.println("Informe o consumo de Kw:");
        consumo = scanner.nextFloat();
        valorKw = salario*0.2f;
        System.out.println("Valor do Kw: R$" + valorKw);
        System.out.println("Valor a ser pago: R$" + valorKw*consumo);
        System.out.println("Valor a ser pago com 15% de desconto: R$" + valorKw*consumo*0.85);
    }
    
    static void Ex23(){
        Scanner scanner = new Scanner(System.in);
        float gasto;
        float ingresso;
        System.out.println("Informe o custo do espetaculo:");
        gasto = scanner.nextFloat();
        System.out.println("Informe o valor do ingresso:");
        ingresso = scanner.nextFloat();
        System.out.println("Precisa vender " + (int)Math.ceil(gasto/ingresso) + " ingressos para alcancar o custo.");
        System.out.println("Precisa vender " + (int)Math.ceil((gasto*1.23)/ingresso) + " ingressos para ter 23% de lucro.");
    }
    
    static void Ex24(){
        Scanner scanner = new Scanner(System.in);
        float tempo;
        float velocidade;
        System.out.println("Informe o tempo gasto (h):");
        tempo = scanner.nextFloat();
        System.out.println("Informe o velocidade media (Km/h):");
        velocidade = scanner.nextFloat();
        System.out.println("Gasolina gasta: " + (tempo*velocidade/12) + " litros.");
    }
    
    static void Ex25(){
        Scanner scanner = new Scanner(System.in);
        int totalEleitores;
        int votos1;
        int votos2;
        float percentual1;
        float percentual2;
        float percentualNulos;
        System.out.println("Informe o total de eleitores:");
        totalEleitores = scanner.nextInt();
        System.out.println("Informe o numero de votos do primeiro candidato:");
        votos1 = scanner.nextInt();
        System.out.println("Informe o numero de votos do segundo candidato:");
        votos2 = scanner.nextInt();
        percentual1 = (float)votos1/totalEleitores*100;
        percentual2 = (float)votos2/totalEleitores*100;
        percentualNulos = (float)(totalEleitores-(votos1+votos2))/totalEleitores*100;
        System.out.println("Percentual de votos do primeiro candidato: " + (int)percentual1 + "%");
        System.out.println("Percentual de votos do segundo candidato: " + (int)percentual2 + "%");
        System.out.println("Percentual de votos nulos: " + (int)percentualNulos + "%");
    }

    public static void main(String[] args) {
        int exercicio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual exercicio?");
        exercicio = scanner.nextInt();
        switch (exercicio){
            case 1:
                Ex1();
                break;
            case 2:
                Ex2();
                break;
            case 3:
                Ex3();
                break;
            case 4:
                Ex4();
                break;
            case 5:
                Ex5();
                break;
            case 6:
                Ex6();
                break;
            case 7:
                Ex7();
                break;
            case 8:
                Ex8();
                break;
            case 9:
                Ex9();
                break;
            case 10:
                Ex10();
                break;
            case 11:
                Ex11();
                break;
            case 12:
                Ex12();
                break;
            case 13:
                Ex13();
                break;
            case 14:
                Ex14();
                break;
            case 15:
                Ex15();
                break;
            case 16:
                Ex16();
                break;
            case 17:
                Ex17();
                break;
            case 18:
                Ex18();
                break;
            case 19:
                Ex19();
                break;
            case 20:
                Ex20();
                break;
            case 21:
                Ex21();
                break;
            case 22:
                Ex22();
                break;
            case 23:
                Ex23();
                break;
            case 24:
                Ex24();
                break;
            case 25:
                Ex25();
                break;
            default:
                System.out.println("Exercicio nao existe.");
                break;
        }
    }

}
