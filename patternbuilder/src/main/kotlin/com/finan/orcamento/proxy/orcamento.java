package com.finan.orcamento.proxy;

import java.math.BigDecimal;

    public class orcamento {
        private BigDecimal valorOrcamento;
        private int qtdItens;
        private BigDecimal descontoOrcamento;

        public orcamento() {
        }

        public orcamento(BigDecimal bigDecimal, BigDecimal bigDecimal1) {
        }

        public BigDecimal getDescontoOrcamento() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return descontoOrcamento;
        }

        public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
            this.descontoOrcamento = descontoOrcamento;

        }

        public static void main(String[] args) {
            orcamento orcamento = new orcamento
                    (new BigDecimal("200"), new BigDecimal("0"));
        }

        public String getValorOrcamento() {
            return null;
        }
    }