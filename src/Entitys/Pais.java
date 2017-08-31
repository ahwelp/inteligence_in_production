package Entitys;
// Generated 31/08/2017 03:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pais generated by hbm2java
 */
@Entity
@Table(name="pais"
    ,schema="public"
)
public class Pais  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String sigla;
     private Set<Estado> estados = new HashSet<Estado>(0);

    public Pais() {
    }

	
    public Pais(int codigo) {
        this.codigo = codigo;
    }
    public Pais(int codigo, String nome, String sigla, Set<Estado> estados) {
       this.codigo = codigo;
       this.nome = nome;
       this.sigla = sigla;
       this.estados = estados;
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

    
    @Column(name="sigla", length=3)
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pais")
    public Set<Estado> getEstados() {
        return this.estados;
    }
    
    public void setEstados(Set<Estado> estados) {
        this.estados = estados;
    }




}


