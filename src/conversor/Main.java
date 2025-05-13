package conversor;

import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas();

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda!");
            System.out.println();
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("*****************************************************");
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }
            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Digite o valor que deseja converter: ");
                double valor = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        conversor.conversaoDolarParaPesoArgentino(valor);
                        break;
                    case 2:
                        conversor.conversaoPesoArgentinoParaDolar(valor);
                        break;
                    case 3:
                        conversor.conversaoDolarParaReal(valor);
                        break;
                    case 4:
                        conversor.conversaoRealParaDolar(valor);
                        break;
                    case 5:
                        conversor.conversaoDolarParaPesoColombiano(valor);
                        break;
                    case 6:
                        conversor.conversaoPesoColombianoParaDolar(valor);
                        break;
                }
            } else {
                System.out.println("Opção Inválida! Tente novamente");
            }
        }
    }
}