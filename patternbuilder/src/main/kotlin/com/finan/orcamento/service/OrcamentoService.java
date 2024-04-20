package com.finan.orcamento.service;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.UsuarioModel;
import com.finan.orcamento.repositories.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {
    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public List<OrcamentoModel> buscarCadastro() {
        return orcamentoRepository.findAll();
    }

    public OrcamentoModel buscaId(Long id) {
        Optional<OrcamentoModel> obj = orcamentoRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new RuntimeException("Orçamento não encontrado");
        }
    }

    public OrcamentoModel cadastrarOrcamento(OrcamentoModel orcamentoModel) {
        //calcula ICMS
        //calculoICMS(orcamentoModel)
        orcamentoModel.calcularIcms();
        return orcamentoRepository.save(orcamentoModel);
    }

    public OrcamentoModel atualizaCadastro(OrcamentoModel orcamentoModel, Long id) {
        OrcamentoModel newOrcamentoModel = buscaId(id);
        //calcula ICMS
        //calculoICMS(orcamentoModel);
        newOrcamentoModel.setValorOrcamento(orcamentoModel.getValorOrcamento());
        newOrcamentoModel.setValorICMS(orcamentoModel.getValorICMS());
        return orcamentoRepository.save(newOrcamentoModel);
    }

    public void deletaOrcamento(Long id) {
        orcamentoRepository.deleteById(id);
    }
}