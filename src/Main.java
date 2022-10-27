import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        iniciar();
    }
    public static void iniciar() {
        try {
            Scanner sc = new Scanner(System.in);

            double[] n;
            int qtdN;
            double media = 0;

            System.out.println("Insira a quantidade de numeros a ser digitados:");
            qtdN = sc.nextInt();
            sc.nextLine();
            n = numeros1(sc, qtdN);

            boolean opc1 = false;
            String opc2;
            do {
                System.out.println("Digite a média: HARMONICA ou ARITIMETICA");
                opc2 = sc.nextLine();
                if (opc2.equalsIgnoreCase("ARITIMETICA")) {
                    media = aritimetica(n);
                    opc1 = true;
                } else if (opc2.equalsIgnoreCase("HARMONICA")) {
                    media = harmonica(n);
                    opc1 = true;
                } else {
                    System.out.println("inválido.");
                }
            } while (opc1 == false);

            System.out.println("Números digitados:");
            for (double numero : n) {
                System.out.println(numero);
            }
            System.out.println("A media escolhida é: " + opc2.toUpperCase());
            System.out.println("Média " + opc2.toUpperCase() + " é " + media);
        } catch (Exception e) {
            iniciar();
        }
    }

    public static double[] numeros1(Scanner sc, int qtd){
        double[] numero = new double[qtd];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero: ");
            numero[i] = sc.nextDouble();
            sc.nextLine();
        }
        return numero;
    }

    public static double harmonica(double[] numeros){
        double mediaHarmonica;
        double soma = 0;
        int quantidade = numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            soma += 1/numeros[i];
        }
        mediaHarmonica = quantidade/soma;
        return mediaHarmonica;
    }
    public static double aritimetica(double[] numeros){
        double aritimetica;
        double soma = 0;
        int qtd = numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        aritimetica = soma/qtd;
        return aritimetica;
    }
}

