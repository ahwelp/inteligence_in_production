package entitys;
// Generated 31/08/2017 03:15:39 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Evento generated by hbm2java
 */
@Entity
@Table(name="evento"
    ,schema="public"
)
public class Evento  implements java.io.Serializable {


     private int codigo;
     private Endereco endereco;
     private Tipoevento tipoevento;
     private Date horainicio;
     private Date horatermino;
     private String descricao;

    public Evento() {
    }

	
    public Evento(int codigo, Endereco endereco, Tipoevento tipoevento) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.tipoevento = tipoevento;
    }
    public Evento(int codigo, Endereco endereco, Tipoevento tipoevento, Date horainicio, Date horatermino, String descricao) {
       this.codigo = codigo;
       this.endereco = endereco;
       this.tipoevento = tipoevento;
       this.horainicio = horainicio;
       this.horatermino = horatermino;
       this.descricao = descricao;
    }
   
     @Id 

    
    @Column(name="codigo", unique=true, nullable=false)
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idendereco", nullable=false)
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtipoevento", nullable=false)
    public Tipoevento getTipoevento() {
        return this.tipoevento;
    }
    
    public void setTipoevento(Tipoevento tipoevento) {
        this.tipoevento = tipoevento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="horainicio", length=13)
    public Date getHorainicio() {
        return this.horainicio;
    }
    
    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="horatermino", length=13)
    public Date getHoratermino() {
        return this.horatermino;
    }
    
    public void setHoratermino(Date horatermino) {
        this.horatermino = horatermino;
    }

    
    @Column(name="descricao", length=150)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


