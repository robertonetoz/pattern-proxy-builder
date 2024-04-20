package com.finan.orcamento.model;

import com.finan.orcamento.interfaces.IBuilderCasa;

public class Casa2Quartos2BanheirosChurrasqueira implements IBuilderCasa {

        CasaModel casa = new CasaModel();


    public Casa2Quartos2BanheirosChurrasqueira() {

        casa = new CasaModel(2, 2, true);

    }

    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("2 Banheiro 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Com churrasqueira");
    }

    @Override
    public CasaModel getCasa() {
        return casa;
    }
}
