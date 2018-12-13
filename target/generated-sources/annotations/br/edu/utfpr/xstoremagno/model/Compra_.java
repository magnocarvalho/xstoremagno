package br.edu.utfpr.xstoremagno.model;

import br.edu.utfpr.xstoremagno.model.Fornecedor;
import br.edu.utfpr.xstoremagno.model.Funcionario;
import br.edu.utfpr.xstoremagno.model.Itemcompra;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T13:05:21")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Integer> idcompra;
    public static volatile CollectionAttribute<Compra, Itemcompra> itemcompraCollection;
    public static volatile SingularAttribute<Compra, Funcionario> funcionariocompra;
    public static volatile SingularAttribute<Compra, Fornecedor> fornecedorcompra;
    public static volatile SingularAttribute<Compra, BigInteger> valorcompra;
    public static volatile SingularAttribute<Compra, Date> criacaocompra;

}