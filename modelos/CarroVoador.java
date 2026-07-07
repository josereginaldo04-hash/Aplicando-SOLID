package modelos;

import interfaces.VeiculoTerrestre;
import interfaces.VeiculoVoador;

public class CarroVoador implements VeiculoTerrestre, VeiculoVoador {

    @Override
    public void acelerar() {
        System.out.println("O carro voador está acelerando na estrada.");
    }

    @Override
    public void decolar() {
        System.out.println("O carro voador abriu as asas e decolou.");
    }
}