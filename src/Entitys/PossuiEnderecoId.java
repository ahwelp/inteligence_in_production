package Entitys;
// Generated 11/09/2017 17:34:30 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PossuiEnderecoId generated by hbm2java
 */
@Embeddable
public class PossuiEnderecoId implements java.io.Serializable {

    private int cliente;
    private int endereco;

    public PossuiEnderecoId() {
    }

    public PossuiEnderecoId(int cliente, int endereco) {
        this.cliente = cliente;
        this.endereco = endereco;
    }

    @Column(name = "cliente", nullable = false)
    public int getCliente() {
        return this.cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    @Column(name = "endereco", nullable = false)
    public int getEndereco() {
        return this.endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof PossuiEnderecoId)) {
            return false;
        }
        PossuiEnderecoId castOther = (PossuiEnderecoId) other;

        return (this.getCliente() == castOther.getCliente())
                && (this.getEndereco() == castOther.getEndereco());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getCliente();
        result = 37 * result + this.getEndereco();
        return result;
    }

}
