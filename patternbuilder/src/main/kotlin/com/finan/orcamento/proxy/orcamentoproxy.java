package com.finan.orcamento.proxy;

import java.math.BigDecimal;

public class orcamentoproxy {

    public orcamentoproxy(orcamento orcamento) {

    }

    public String getvalororcamento() {
        return null;
    }

    public class Orcamento {
        private BigDecimal valorOrcamento;
        private int qtdItens;
        private BigDecimal descontoOrcamento;
        public Orcamento() {
        }

        public Orcamento(BigDecimal bigDecimal, BigDecimal bigDecimal1) {
        }

        public BigDecimal getDescontoOrcamento() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return descontoOrcamento;
        }
        public void setDescontoOrcamento (BigDecimal descontoOrcamento){
            this.descontoOrcamento = descontoOrcamento;

        }

        public static void main(String[] args) {
            com.finan.orcamento.proxy.orcamento orcamento = new com.finan.orcamento.proxy.orcamento
                    (new BigDecimal("200"), new BigDecimal("0"));
        }

        public String getValorOrcamento() {
            return null;
        }
    }

}
