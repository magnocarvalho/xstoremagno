/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.model;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author magno
 */
@Entity
@Table(name = "itemcompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itemcompra.findAll", query = "SELECT i FROM Itemcompra i")
    , @NamedQuery(name = "Itemcompra.findByIditemcompra", query = "SELECT i FROM Itemcompra i WHERE i.iditemcompra = :iditemcompra")
    , @NamedQuery(name = "Itemcompra.findByCriacaoitemcompra", query = "SELECT i FROM Itemcompra i WHERE i.criacaoitemcompra = :criacaoitemcompra")
    , @NamedQuery(name = "Itemcompra.findByQuantidadeitemcompra", query = "SELECT i FROM Itemcompra i WHERE i.quantidadeitemcompra = :quantidadeitemcompra")
    , @NamedQuery(name = "Itemcompra.findByValoritemcompra", query = "SELECT i FROM Itemcompra i WHERE i.valoritemcompra = :valoritemcompra")})
public class Itemcompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditemcompra")
    private Integer iditemcompra;
    @Column(name = "criacaoitemcompra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criacaoitemcompra;
    @Column(name = "quantidadeitemcompra")
    private Integer quantidadeitemcompra;
    @Column(name = "valoritemcompra")
    private BigInteger valoritemcompra;
    @JoinColumn(name = "compraitemcompra", referencedColumnName = "idcompra")
    @ManyToOne
    private Compra compraitemcompra;
    @JoinColumn(name = "produtoitemcompra", referencedColumnName = "idproduto")
    @ManyToOne
    private Produto produtoitemcompra;

    public Itemcompra() {
    }

    public Itemcompra(Integer iditemcompra) {
        this.iditemcompra = iditemcompra;
    }

    public Integer getIditemcompra() {
        return iditemcompra;
    }

    public void setIditemcompra(Integer iditemcompra) {
        this.iditemcompra = iditemcompra;
    }

    public Date getCriacaoitemcompra() {
        return criacaoitemcompra;
    }

    public void setCriacaoitemcompra(Date criacaoitemcompra) {
        this.criacaoitemcompra = criacaoitemcompra;
    }

    public Integer getQuantidadeitemcompra() {
        return quantidadeitemcompra;
    }

    public void setQuantidadeitemcompra(Integer quantidadeitemcompra) {
        this.quantidadeitemcompra = quantidadeitemcompra;
    }

    public BigInteger getValoritemcompra() {
        return valoritemcompra;
    }

    public void setValoritemcompra(BigInteger valoritemcompra) {
        this.valoritemcompra = valoritemcompra;
    }

    public Compra getCompraitemcompra() {
        return compraitemcompra;
    }

    public void setCompraitemcompra(Compra compraitemcompra) {
        this.compraitemcompra = compraitemcompra;
    }

    public Produto getProdutoitemcompra() {
        return produtoitemcompra;
    }

    public void setProdutoitemcompra(Produto produtoitemcompra) {
        this.produtoitemcompra = produtoitemcompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditemcompra != null ? iditemcompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemcompra)) {
            return false;
        }
        Itemcompra other = (Itemcompra) object;
        if ((this.iditemcompra == null && other.iditemcompra != null) || (this.iditemcompra != null && !this.iditemcompra.equals(other.iditemcompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.utfpr.xstoremagno.Itemcompra[ iditemcompra=" + iditemcompra + " ]";
    }
    
}
