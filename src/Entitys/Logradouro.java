package Entitys;
// Generated 31/08/2017 09:43:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Logradouro generated by hbm2java
 */
@Entity
@Table(name="logradouro"
    ,schema="public"
)
public class Logradouro  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String sigla;
     private Set<Endereco> enderecos = new HashSet<Endereco>(0);

    public Logradouro() {
    }

	
    public Logradouro(int codigo) {
        this.codigo = codigo;
    }
    public Logradouro(int codigo, String nome, String sigla, Set<Endereco> enderecos) {
       this.codigo = codigo;
       this.nome = nome;
       this.sigla = sigla;
       this.enderecos = enderecos;
    }
   
     @Id 

    
    @Column(name="codigo", unique=true, nullable=false)
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="nome", length=75)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="sigla", length=5)
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="logradouro")
    public Set<Endereco> getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }




}


