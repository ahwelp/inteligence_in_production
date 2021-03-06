package Entitys;
// Generated 13/09/2017 20:17:35 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PossuiContato generated by hbm2java
 */
@Entity
@Table(name = "possui_contato",
         schema = "public"
)
public class PossuiContato implements java.io.Serializable {

    private PossuiContatoId id;
    private Contato contato;
    private Pessoa pessoa;
    private TipoContato tipoContato;

    public PossuiContato() {
    }

    public PossuiContato(PossuiContatoId id, Contato contato, Pessoa pessoa, TipoContato tipoContato) {
        this.id = id;
        this.contato = contato;
        this.pessoa = pessoa;
        this.tipoContato = tipoContato;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "cliente", column = @Column(name = "cliente", nullable = false))
        , 
        @AttributeOverride(name = "contato", column = @Column(name = "contato", nullable = false))})
    public PossuiContatoId getId() {
        return this.id;
    }

    public void setId(PossuiContatoId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contato", nullable = false, insertable = false, updatable = false)
    public Contato getContato() {
        return this.contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente", nullable = false, insertable = false, updatable = false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_contato", nullable = false)
    public TipoContato getTipoContato() {
        return this.tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

}
