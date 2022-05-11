package tcc.banco.cliente.dto;

public class TelefoneDTO {
    private String codPais;

    private String ddd;

    private String numero;

    public TelefoneDTO(String codPais, String ddd, String numero) {
        this.codPais = codPais;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
