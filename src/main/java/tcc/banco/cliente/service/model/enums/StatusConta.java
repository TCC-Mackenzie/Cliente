package tcc.banco.cliente.service.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusConta {
    ANALISE(0, "Análise"),
    CRIACAO(1, "Criação"),
    ATIVA(2, "Ativa"),
    INATIVA(3, "Inativa");

    @JsonValue
    int codigo;
    String descricao;

    private StatusConta(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
