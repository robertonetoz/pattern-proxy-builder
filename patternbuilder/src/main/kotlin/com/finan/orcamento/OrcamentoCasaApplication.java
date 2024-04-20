package com.finan.orcamento;

import com.finan.orcamento.interfaces.IBuilderCasa;
import com.finan.orcamento.model.Casa2Quartos;
import com.finan.orcamento.model.Casa2Quartos2BanheirosChurrasqueira;
import com.finan.orcamento.model.CasaModel;
import com.finan.orcamento.proxy.orcamento;
import com.finan.orcamento.proxy.orcamentoproxy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class OrcamentoCasaApplication {

        public static void main (String[]args){
            orcamento orcamento = new orcamento(new BigDecimal("100"), new BigDecimal("100"));
            System.out.println ("Valor do orcamento = " + orcamento.getValorOrcamento());
            System.out.println ("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());

            orcamentoproxy proxy = new orcamentoproxy(orcamento);
            System.out.println ("Valor com proxy = " + proxy.getvalororcamento());
            System.out.println ("Valor com proxy = " + proxy.getvalororcamento());

            System.out.println("-------------------------------------");

            IBuilderCasa builderCasa1 = new Casa2Quartos();
            builderCasa1.buildQuartos();
            builderCasa1.buildBanheiros();
            builderCasa1.buildChurrasqueira();
            CasaModel casa1 = builderCasa1.getCasa();

            System.out.println("Casa 1");
            System.out.println("Quartos: " + casa1.getQuartos());
            System.out.println("Banheiros: " + casa1.getBanheiros());
            System.out.println("Churrasqueira: " + casa1.getChurrasqueira());

            System.out.println("-------------------------------------");

            IBuilderCasa builderCasa2 = new Casa2Quartos2BanheirosChurrasqueira();
            builderCasa2.buildQuartos();
            builderCasa2.buildBanheiros();
            builderCasa2.buildChurrasqueira();
            CasaModel casa2 = builderCasa2.getCasa();

            System.out.println("Casa 2");
            System.out.println("Quartos: " + casa2.getQuartos());
            System.out.println("Banheiros: " + casa2.getBanheiros());
            System.out.println("Churrasqueira: " + casa2.getChurrasqueira());
        }
    }









