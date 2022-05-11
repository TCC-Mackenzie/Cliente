package tcc.banco.cliente.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import tcc.banco.cliente.service.model.enums.TipoDocumento;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Fisico extends Cliente {
    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private TipoDocumento tipoDocumento;

    @Column(nullable = false)
    private String documento;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String paisNascimento;

    @Column(nullable = false)
    private String nomeMae;

    @Column(nullable = false)
    private BigDecimal rendaMensal;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPaisNascimento() {
        return paisNascimento;
    }

    public void setPaisNascimento(String paisNascimento) {
        this.paisNascimento = paisNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
