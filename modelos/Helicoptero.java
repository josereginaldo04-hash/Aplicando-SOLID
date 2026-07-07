package modelos;

import interfaces.VeiculoVoador;

public class Helicoptero implements VeiculoVoador {

    @Override
    public void decolar() {
        System.out.println("O helicóptero decolou.");
    }
}