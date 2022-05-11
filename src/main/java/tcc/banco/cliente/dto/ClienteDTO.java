package tcc.banco.cliente.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import tcc.banco.cliente.service.model.Fisico;
import tcc.banco.cliente.service.model.Juridico;
import tcc.banco.cliente.service.model.enums.Faturamento;
import tcc.banco.cliente.service.model.enums.TipoDocumento;
import tcc.banco.cliente.service.model.enums.TipoEmpresa;

public class ClienteDTO {
    private String nome;

    private String email;

    private EnderecoDTO endereco;

    private List<TelefoneDTO> telefones;

    private String cpf;

    private TipoDocumento tipoDocumento;

    private String documento;

    private Date dataNascimento;

    private String paisNascimento;

    private String nomeMae;

    private BigDecimal rendaMensal;

    private Integer cnpj;

    private String razaoSocial;

    private TipoEmpresa tipoEmpresa;

    private Faturamento faturamento;

    private Date dataAbertura;

    private Integer cpfRepresentante;

    private Class<?> tipoCliente;

    public ClienteDTO() {
    }

    public ClienteDTO(String nome, String email, EnderecoDTO endereco, List<TelefoneDTO> telefones, String cpf,
            TipoDocumento tipoDocumento, String documento, Date dataNascimento, String paisNascimento, String nomeMae,
            BigDecimal rendaMensal) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefones = telefones;
        this.cpf = cpf;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.paisNascimento = paisNascimento;
        this.nomeMae = nomeMae;
        this.rendaMensal = rendaMensal;
        this.tipoCliente = Fisico.class;
    }

    public ClienteDTO(String nome, String email, EnderecoDTO endereco, List<TelefoneDTO> telefones, Integer cnpj,
            String razaoSocial, TipoEmpresa tipoEmpresa, Faturamento faturamento, Date dataAbertura,
            Integer cpfRepresentante) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefones = telefones;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.tipoEmpresa = tipoEmpresa;
        this.faturamento = faturamento;
        this.dataAbertura = dataAbertura;
        this.cpfRepresentante = cpfRepresentante;
        this.tipoCliente = Juridico.class;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public List<TelefoneDTO> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
    }

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

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public Faturamento getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Faturamento faturamento) {
        this.faturamento = faturamento;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Integer getCpfRepresentante() {
        return cpfRepresentante;
    }

    public void setCpfRepresentante(Integer cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
    }

    public Class<?> getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Class<?> tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
}
