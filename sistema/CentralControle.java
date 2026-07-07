package sistema;

import interfaces.VeiculoTerrestre;
import interfaces.VeiculoVoador;

public class CentralControle {

    public void controlarTerrestre(VeiculoTerrestre veiculo) {
        System.out.println("\n=== Controle Terrestre ===");
        veiculo.acelerar();
    }

    public void controlarVoador(VeiculoVoador veiculo) {
        System.out.println("\n=== Controle Aéreo ===");
        veiculo.decolar();
    }

}