package com.builder.casa.patternsBuilder;

import com.builder.casa.modelo.Casa;

public interface IBuilderCasa {

    void buildQuartos();

    void buildBanheiros();

    void buildChurrasqueira();

    Casa getCasa();
}
