package com.finan.orcamento.interfaces;

import com.finan.orcamento.model.CasaModel;

public interface IBuilderCasa {

    void buildQuartos();

    void buildBanheiros();

    void buildChurrasqueira();

    CasaModel getCasa();
}
