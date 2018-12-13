package br.edu.utfpr.xstoremagno.model;

import br.edu.utfpr.xstoremagno.model.Compra;
import br.edu.utfpr.xstoremagno.model.Produto;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T13:05:21")
@StaticMetamodel(Itemcompra.class)
public class Itemcompra_ { 

    public static volatile SingularAttribute<Itemcompra, Compra> compraitemcompra;
    public static volatile SingularAttribute<Itemcompra, BigInteger> valoritemcompra;
    public static volatile SingularAttribute<Itemcompra, Date> criacaoitemcompra;
    public static volatile SingularAttribute<Itemcompra, Integer> quantidadeitemcompra;
    public static volatile SingularAttribute<Itemcompra, Integer> iditemcompra;
    public static volatile SingularAttribute<Itemcompra, Produto> produtoitemcompra;

}