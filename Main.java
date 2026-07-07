import java.util.Scanner;

import modelos.CarroVoador;
import modelos.Helicoptero;
import modelos.Moto;
import sistema.CentralControle;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CentralControle central = new CentralControle();

        Moto moto = new Moto();
        Helicoptero helicoptero = new Helicoptero();
        CarroVoador carroVoador = new CarroVoador();

        System.out.println("=================================");
        System.out.println("      GTA - Central de Controle");
        System.out.println("=================================");
        System.out.println("1 - Moto");
        System.out.println("2 - Helicóptero");
        System.out.println("3 - Carro Voador");
        System.out.print("Escolha um veículo: ");

        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                central.controlarTerrestre(moto);
                break;

            case 2:
                central.controlarVoador(helicoptero);
                break;

            case 3:

                System.out.println("\nO Carro Voador possui duas funções:");
                System.out.println("1 - Acelerar");
                System.out.println("2 - Decolar");
                System.out.print("Escolha uma ação: ");

                int acao = scanner.nextInt();

                if (acao == 1) {
                    central.controlarTerrestre(carroVoador);
                } else if (acao == 2) {
                    central.controlarVoador(carroVoador);
                } else {
                    System.out.println("Ação inválida.");
                }

                break;

            default:
                System.out.println("Veículo inválido.");
        }

        scanner.close();
    }
}