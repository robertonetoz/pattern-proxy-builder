package com.builder.casa.modelo;

import com.builder.casa.patternsBuilder.IBuilderCasa;

public class Casa2Quartos implements IBuilderCasa {

    Casa casa = new Casa();

    public Casa2Quartos() {
        casa = new Casa(2, 1, false);
    }


    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Banheiro 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
