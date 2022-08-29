import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                // media(double notaUm, double notaDois, double notaTres)
                System.out.println("Calculando média");
                double res1 = media(8, 7, 9);
                System.out.println(" O valor da média é " +res1);
               
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                // area(double ladoUm, double ladoDois)
                System.out.println("Calculando a área");
                double res2 = area(8,8);
                System.out.println("O valor da área é "+res2);
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                // volume(double largura, double altura, double profundidade)
                System.out.println("Calculando o volume");
                double res3 = volume(5,5,5);
                System.out.println("O valor do volume é "+res3);
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                // valorMaiorQueDobro(double base, double verificar)
                System.out.println("Verificar se um valor é maior que o dobro de outro valor");
                boolean res4 = valorMaiorQueDobro(2,8);
                if(res4==true){
                    System.out.println("O valor é maior que o dobro do outro valor");
                } else {
                    System.out.println("O valor é menor que o dobro do outro valor");
                }
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // bhaskara(int a, int b, int c);
                System.out.println("Calculando bhaskara");
                double[] res5 = bhaskara(2,6,-5);
                System.out.println("O valor de x' é " 
                +res5[0] 
                + " e x'' é " 
                + res5[1]);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                // mediaViagem(double distancia, double tempo)
                System.out.println("Calculando velocidade média");
                double res6 = mediaViagem(5,5);
                System.out.println("O valor da velocidade média é " + res6);
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)
                System.out.println("Verificando se o valor é par ou impar");
                boolean res7 = parOuImpar(31);
                if(res7 == true) {
                    System.out.println("O valor é par");
                } else {
                    System.out.println("O valor é impar");
                }
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {

        double median = (notaUm + notaDois + notaTres)/3;
        return median;
    }

    public static double area(double ladoUm, double ladoDois) {

        double areal = ladoUm * ladoDois;
        return areal;
    }

    public static double volume(double largura, double altura, double profundidade) {

        
        double vol = largura * altura * profundidade;
        return vol;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {

        if((base*2) > verificar){
            return true;
        } else {
            return false;
        }
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b*b)-(4*a*c);
        double bhaskarar[] = new double []{0,1};
        bhaskarar[0] = ((-b)+Math.sqrt(delta))/2*a;
        bhaskarar[1] = ((-b)-Math.sqrt(delta))/2*a;
        
        return bhaskarar;
    }

    public static double mediaViagem(double distancia, double tempo) {
        double mediaV= distancia * tempo;
        return mediaV;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)

        return 0;
    }

    public static boolean parOuImpar(int valor) {
        // 8) Crie um programa que teste se um valor é par ou ímpar
        if(valor%2==0) {
            return true;
        } else {
            return false;
        }  
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
        if(salario<=1903.98){
            return 1;
        } else if (salario>1903.98 && salario<=2826.65) {
            return 2;
        } else if (salario>2826.65 && salario<=3751.05) {
            return 3;
        } else if (salario>3751.05 && salario<=4664.68) {
            return 4;
        } else if (salario>4664.68){
            return 5;
        } 
        return 0;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}