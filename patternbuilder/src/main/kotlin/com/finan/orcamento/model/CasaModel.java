package com.finan.orcamento.model;

public class CasaModel {

    private int quartos;

    private int banheiros;

    private boolean churrasqueira;


    public CasaModel(){};

    public CasaModel(int quartos, int banheiros, boolean churrasqueira){

        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;
    }

    public int getQuartos() { return quartos; }
    public int getBanheiros() { return banheiros; }
    public boolean getChurrasqueira() { return churrasqueira; }
}
