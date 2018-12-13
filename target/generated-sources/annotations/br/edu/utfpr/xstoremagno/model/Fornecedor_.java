package br.edu.utfpr.xstoremagno.model;

import br.edu.utfpr.xstoremagno.model.Compra;
import br.edu.utfpr.xstoremagno.model.Produto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T13:05:21")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, String> cnpjpessoajuridica;
    public static volatile SingularAttribute<Fornecedor, String> cidade;
    public static volatile SingularAttribute<Fornecedor, String> estado;
    public static volatile SingularAttribute<Fornecedor, String> endereco;
    public static volatile CollectionAttribute<Fornecedor, Compra> compraCollection;
    public static volatile SingularAttribute<Fornecedor, String> bairro;
    public static volatile SingularAttribute<Fornecedor, String> nomefornecedor;
    public static volatile SingularAttribute<Fornecedor, String> razaosocialpessoajuridica;
    public static volatile CollectionAttribute<Fornecedor, Produto> produtoCollection;
    public static volatile SingularAttribute<Fornecedor, String> celularcontato;
    public static volatile SingularAttribute<Fornecedor, String> cep;
    public static volatile SingularAttribute<Fornecedor, Integer> idfornecedor;
    public static volatile SingularAttribute<Fornecedor, String> complemento;
    public static volatile SingularAttribute<Fornecedor, String> telefonecontato;
    public static volatile SingularAttribute<Fornecedor, Date> criacaofornecedor;
    public static volatile SingularAttribute<Fornecedor, String> emailcontato;
    public static volatile SingularAttribute<Fornecedor, String> numeroendereco;

}