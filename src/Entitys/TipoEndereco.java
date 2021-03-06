package Entitys;
// Generated 13/09/2017 20:17:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoEndereco generated by hbm2java
 */
@Entity
@Table(name = "tipo_endereco",
        schema = "public"
)
public class TipoEndereco implements java.io.Serializable {

    private int codigo;
    private String nome;
    private String sigla;
    private String descricao;
    private Boolean ativo;
    private Set<PossuiEndereco> possuiEnderecos = new HashSet<PossuiEndereco>(0);

    public TipoEndereco() {
    }

    public TipoEndereco(int codigo) {
        this.codigo = codigo;
    }

    public TipoEndereco(int codigo, String nome, String sigla, String descricao, Boolean ativo, Set<PossuiEndereco> possuiEnderecos) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
        this.descricao = descricao;
        this.ativo = ativo;
        this.possuiEnderecos = possuiEnderecos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", unique = true, nullable = false)
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Column(name = "nome", length = 75)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "sigla", length = 5)
    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Column(name = "descricao", length = 150)
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "ativo")
    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEndereco")
    public Set<PossuiEndereco> getPossuiEnderecos() {
        return this.possuiEnderecos;
    }

    public void setPossuiEnderecos(Set<PossuiEndereco> possuiEnderecos) {
        this.possuiEnderecos = possuiEnderecos;
    }

}
