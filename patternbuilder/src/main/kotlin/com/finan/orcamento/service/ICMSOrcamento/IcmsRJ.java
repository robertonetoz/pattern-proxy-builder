package com.finan.orcamento.service.ICMSOrcamento;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class IcmsRJ implements IcmsStrategy{
    @Override
    public BigDecimal calcular(@NotNull BigDecimal valorOrcamento) {
        return valorOrcamento.multiply(new BigDecimal("0.15"));
    }
}
