package Entitys;
// Generated 31/08/2017 03:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name="endereco"
    ,schema="public"
)
public class Endereco  implements java.io.Serializable {


     private int codigo;
     private Cidade cidade;
     private Logradouro logradouro;
     private String rua;
     private Integer numero;
     private String bairro;
     private Integer cep;
     private String complemento;
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public Endereco() {
    }

	
    public Endereco(int codigo, Cidade cidade, Logradouro logradouro) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }
    public Endereco(int codigo, Cidade cidade, Logradouro logradouro, String rua, Integer numero, String bairro, Integer cep, String complemento, Set<Evento> eventos) {
       this.codigo = codigo;
       this.cidade = cidade;
       this.logradouro = logradouro;
       this.rua = rua;
       this.numero = numero;
       this.bairro = bairro;
       this.cep = cep;
       this.complemento = complemento;
       this.eventos = eventos;
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
    @JoinColumn(name="idcidade", nullable=false)
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idlogradouro", nullable=false)
    public Logradouro getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    
    @Column(name="rua", length=150)
    public String getRua() {
        return this.rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    
    @Column(name="numero")
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
    @Column(name="bairro", length=75)
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name="cep")
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }

    
    @Column(name="complemento", length=150)
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="endereco")
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }




}


