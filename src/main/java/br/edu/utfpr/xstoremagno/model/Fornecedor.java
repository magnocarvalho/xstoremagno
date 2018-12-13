/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author magno
 */
@Entity
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
    , @NamedQuery(name = "Fornecedor.findByIdfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idfornecedor = :idfornecedor")
    , @NamedQuery(name = "Fornecedor.findByBairro", query = "SELECT f FROM Fornecedor f WHERE f.bairro = :bairro")
    , @NamedQuery(name = "Fornecedor.findByCelularcontato", query = "SELECT f FROM Fornecedor f WHERE f.celularcontato = :celularcontato")
    , @NamedQuery(name = "Fornecedor.findByCep", query = "SELECT f FROM Fornecedor f WHERE f.cep = :cep")
    , @NamedQuery(name = "Fornecedor.findByCidade", query = "SELECT f FROM Fornecedor f WHERE f.cidade = :cidade")
    , @NamedQuery(name = "Fornecedor.findByCnpjpessoajuridica", query = "SELECT f FROM Fornecedor f WHERE f.cnpjpessoajuridica = :cnpjpessoajuridica")
    , @NamedQuery(name = "Fornecedor.findByComplemento", query = "SELECT f FROM Fornecedor f WHERE f.complemento = :complemento")
    , @NamedQuery(name = "Fornecedor.findByCriacaofornecedor", query = "SELECT f FROM Fornecedor f WHERE f.criacaofornecedor = :criacaofornecedor")
    , @NamedQuery(name = "Fornecedor.findByEmailcontato", query = "SELECT f FROM Fornecedor f WHERE f.emailcontato = :emailcontato")
    , @NamedQuery(name = "Fornecedor.findByEndereco", query = "SELECT f FROM Fornecedor f WHERE f.endereco = :endereco")
    , @NamedQuery(name = "Fornecedor.findByEstado", query = "SELECT f FROM Fornecedor f WHERE f.estado = :estado")
    , @NamedQuery(name = "Fornecedor.findByNomefornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomefornecedor = :nomefornecedor")
    , @NamedQuery(name = "Fornecedor.findByNumeroendereco", query = "SELECT f FROM Fornecedor f WHERE f.numeroendereco = :numeroendereco")
    , @NamedQuery(name = "Fornecedor.findByRazaosocialpessoajuridica", query = "SELECT f FROM Fornecedor f WHERE f.razaosocialpessoajuridica = :razaosocialpessoajuridica")
    , @NamedQuery(name = "Fornecedor.findByTelefonecontato", query = "SELECT f FROM Fornecedor f WHERE f.telefonecontato = :telefonecontato")})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private Integer idfornecedor;
    @Size(max = 255)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 255)
    @Column(name = "celularcontato")
    private String celularcontato;
    @Size(max = 255)
    @Column(name = "cep")
    private String cep;
    @Size(max = 255)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 255)
    @Column(name = "cnpjpessoajuridica")
    private String cnpjpessoajuridica;
    @Size(max = 255)
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "criacaofornecedor")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criacaofornecedor;
    @Size(max = 255)
    @Column(name = "emailcontato")
    private String emailcontato;
    @Size(max = 255)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 255)
    @Column(name = "estado")
    private String estado;
    @Size(max = 255)
    @Column(name = "nomefornecedor")
    private String nomefornecedor;
    @Size(max = 255)
    @Column(name = "numeroendereco")
    private String numeroendereco;
    @Size(max = 255)
    @Column(name = "razaosocialpessoajuridica")
    private String razaosocialpessoajuridica;
    @Size(max = 255)
    @Column(name = "telefonecontato")
    private String telefonecontato;
    @OneToMany(mappedBy = "fornecedorcompra")
    private Collection<Compra> compraCollection;
    @OneToMany(mappedBy = "fornecedorproduto")
    private Collection<Produto> produtoCollection;

    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCelularcontato() {
        return celularcontato;
    }

    public void setCelularcontato(String celularcontato) {
        this.celularcontato = celularcontato;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnpjpessoajuridica() {
        return cnpjpessoajuridica;
    }

    public void setCnpjpessoajuridica(String cnpjpessoajuridica) {
        this.cnpjpessoajuridica = cnpjpessoajuridica;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Date getCriacaofornecedor() {
        return criacaofornecedor;
    }

    public void setCriacaofornecedor(Date criacaofornecedor) {
        this.criacaofornecedor = criacaofornecedor;
    }

    public String getEmailcontato() {
        return emailcontato;
    }

    public void setEmailcontato(String emailcontato) {
        this.emailcontato = emailcontato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public String getNumeroendereco() {
        return numeroendereco;
    }

    public void setNumeroendereco(String numeroendereco) {
        this.numeroendereco = numeroendereco;
    }

    public String getRazaosocialpessoajuridica() {
        return razaosocialpessoajuridica;
    }

    public void setRazaosocialpessoajuridica(String razaosocialpessoajuridica) {
        this.razaosocialpessoajuridica = razaosocialpessoajuridica;
    }

    public String getTelefonecontato() {
        return telefonecontato;
    }

    public void setTelefonecontato(String telefonecontato) {
        this.telefonecontato = telefonecontato;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.utfpr.xstoremagno.Fornecedor[ idfornecedor=" + idfornecedor + " ]";
    }
    
}
