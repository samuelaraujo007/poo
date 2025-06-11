package aula01;

import javax.swing.plaf.basic.BasicArrowButton;

public class Aula01 {
    public static void main(String[] args) {
        Carro car1=new Carro();
        car1.marca = "Toyta";
        car1.modelo = "Corola";
        car1.cor = "Preto";
        car1.ano = 2008;
        car1.potencia = 140;

        System.out.println("Marca:" + car1.marca);
        car1.ligar();
        car1.desligar();

    }
}
