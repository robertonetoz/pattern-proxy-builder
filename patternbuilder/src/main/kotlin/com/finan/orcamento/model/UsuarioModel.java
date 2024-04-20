package com.finan.orcamento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuario")

public class UsuarioModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Column(name="nome_usuario")
    private String nomeUsuario;

    @JsonIgnore
    @OneToMany(mappedBy = "id")
    private List<OrcamentoModel> orcamentos = new ArrayList<>();

    public static Object getNomeUsuario() {
        return null;
    }

    public void setNomeUsuario(Object nomeUsuario) {
    }
}
