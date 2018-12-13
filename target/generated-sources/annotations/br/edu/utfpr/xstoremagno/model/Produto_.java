package br.edu.utfpr.xstoremagno.model;

import br.edu.utfpr.xstoremagno.model.Categoria;
import br.edu.utfpr.xstoremagno.model.Fornecedor;
import br.edu.utfpr.xstoremagno.model.Itemcompra;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T13:05:21")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, String> codigoproduto;
    public static volatile CollectionAttribute<Produto, Itemcompra> itemcompraCollection;
    public static volatile SingularAttribute<Produto, BigInteger> maximoproduto;
    public static volatile SingularAttribute<Produto, Categoria> categoriaproduto;
    public static volatile SingularAttribute<Produto, BigInteger> custoproduto;
    public static volatile SingularAttribute<Produto, String> descricaoproduto;
    public static volatile SingularAttribute<Produto, Date> criacaoproduto;
    public static volatile SingularAttribute<Produto, Integer> idproduto;
    public static volatile SingularAttribute<Produto, Fornecedor> fornecedorproduto;
    public static volatile SingularAttribute<Produto, BigInteger> vendaproduto;
    public static volatile SingularAttribute<Produto, BigInteger> quantidade;
    public static volatile SingularAttribute<Produto, BigInteger> minimoproduto;

}