package tcc.banco.cliente.service.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Faturamento {
    MICROEMPRESA(0, "Microempresa – Menor ou igual R$ 360 mil"),
    PEQUENA_EMPRESA(1, "Pequena Empresa – Maior que R$ 360 mil e menor ou igual a R$ 4,8 milhões"),
    MEDIA_EMPRESA(2, "Média Empresa – Maior que R$ 4,8 milhões e menor ou igual a R$ 300 milhões"),
    GRANDE_EMPRESA(3, "Grande Empresa – Maior que R$ 300 milhões.");

    @JsonValue
    int codigo;
    String descricao;

    private Faturamento(int codigo, String descricao) {
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
