package tcc.banco.cliente.service.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoDocumento {
    RG(0, "RG"),
    CNH(1, "CNH"),
    RNM(2, "RNM");

    @JsonValue
    int codigo;
    String descricao;
    
    private TipoDocumento(int codigo, String descricao) {
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
