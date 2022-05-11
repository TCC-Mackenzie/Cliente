package tcc.banco.cliente.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import tcc.banco.cliente.service.model.enums.Faturamento;
import tcc.banco.cliente.service.model.enums.TipoEmpresa;

@Entity
public class Juridico extends Cliente {
    @Column(nullable = false)
    private Integer cnpj;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private TipoEmpresa tipoEmpresa;

    @Column(nullable = false)
    private Faturamento faturamento;

    @Column(nullable = false)
    private Date dataAbertura;

    @Column(nullable = false)
    private Integer cpfRepresentante;

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getCpfRepresentante() {
        return cpfRepresentante;
    }

    public void setCpfRepresentante(Integer cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
    }
}
