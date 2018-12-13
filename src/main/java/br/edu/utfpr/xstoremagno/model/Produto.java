/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByIdproduto", query = "SELECT p FROM Produto p WHERE p.idproduto = :idproduto")
    , @NamedQuery(name = "Produto.findByCodigoproduto", query = "SELECT p FROM Produto p WHERE p.codigoproduto = :codigoproduto")
    , @NamedQuery(name = "Produto.findByCriacaoproduto", query = "SELECT p FROM Produto p WHERE p.criacaoproduto = :criacaoproduto")
    , @NamedQuery(name = "Produto.findByCustoproduto", query = "SELECT p FROM Produto p WHERE p.custoproduto = :custoproduto")
    , @NamedQuery(name = "Produto.findByDescricaoproduto", query = "SELECT p FROM Produto p WHERE p.descricaoproduto = :descricaoproduto")
    , @NamedQuery(name = "Produto.findByMaximoproduto", query = "SELECT p FROM Produto p WHERE p.maximoproduto = :maximoproduto")
    , @NamedQuery(name = "Produto.findByMinimoproduto", query = "SELECT p FROM Produto p WHERE p.minimoproduto = :minimoproduto")
    , @NamedQuery(name = "Produto.findByQuantidade", query = "SELECT p FROM Produto p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Produto.findByVendaproduto", query = "SELECT p FROM Produto p WHERE p.vendaproduto = :vendaproduto")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Size(max = 255)
    @Column(name = "codigoproduto")
    private String codigoproduto;
    @Column(name = "criacaoproduto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criacaoproduto;
    @Column(name = "custoproduto")
    private BigInteger custoproduto;
    @Size(max = 255)
    @Column(name = "descricaoproduto")
    private String descricaoproduto;
    @Column(name = "maximoproduto")
    private BigInteger maximoproduto;
    @Column(name = "minimoproduto")
    private BigInteger minimoproduto;
    @Column(name = "quantidade")
    private BigInteger quantidade;
    @Column(name = "vendaproduto")
    private BigInteger vendaproduto;
    @JoinColumn(name = "categoriaproduto", referencedColumnName = "idcategoria")
    @ManyToOne
    private Categoria categoriaproduto;
    @JoinColumn(name = "fornecedorproduto", referencedColumnName = "idfornecedor")
    @ManyToOne
    private Fornecedor fornecedorproduto;
    @OneToMany(mappedBy = "produtoitemcompra")
    private Collection<Itemcompra> itemcompraCollection;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public Date getCriacaoproduto() {
        return criacaoproduto;
    }

    public void setCriacaoproduto(Date criacaoproduto) {
        this.criacaoproduto = criacaoproduto;
    }

    public BigInteger getCustoproduto() {
        return custoproduto;
    }

    public void setCustoproduto(BigInteger custoproduto) {
        this.custoproduto = custoproduto;
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public BigInteger getMaximoproduto() {
        return maximoproduto;
    }

    public void setMaximoproduto(BigInteger maximoproduto) {
        this.maximoproduto = maximoproduto;
    }

    public BigInteger getMinimoproduto() {
        return minimoproduto;
    }

    public void setMinimoproduto(BigInteger minimoproduto) {
        this.minimoproduto = minimoproduto;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public BigInteger getVendaproduto() {
        return vendaproduto;
    }

    public void setVendaproduto(BigInteger vendaproduto) {
        this.vendaproduto = vendaproduto;
    }

    public Categoria getCategoriaproduto() {
        return categoriaproduto;
    }

    public void setCategoriaproduto(Categoria categoriaproduto) {
        this.categoriaproduto = categoriaproduto;
    }

    public Fornecedor getFornecedorproduto() {
        return fornecedorproduto;
    }

    public void setFornecedorproduto(Fornecedor fornecedorproduto) {
        this.fornecedorproduto = fornecedorproduto;
    }

    @XmlTransient
    public Collection<Itemcompra> getItemcompraCollection() {
        return itemcompraCollection;
    }

    public void setItemcompraCollection(Collection<Itemcompra> itemcompraCollection) {
        this.itemcompraCollection = itemcompraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.utfpr.xstoremagno.Produto[ idproduto=" + idproduto + " ]";
    }
    
}
