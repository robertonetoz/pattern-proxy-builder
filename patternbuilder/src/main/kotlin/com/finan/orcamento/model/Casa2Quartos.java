package com.finan.orcamento.model;

import com.finan.orcamento.interfaces.IBuilderCasa;

public class Casa2Quartos implements IBuilderCasa {

    CasaModel casa = new CasaModel();

    public Casa2Quartos() {
        casa = new CasaModel(2, 1, false);
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
    public CasaModel getCasa() {
        return casa;
    }
}
