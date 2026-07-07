package modelos;

import interfaces.VeiculoTerrestre;

public class Moto implements VeiculoTerrestre {

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando no asfalto.");
    }
}