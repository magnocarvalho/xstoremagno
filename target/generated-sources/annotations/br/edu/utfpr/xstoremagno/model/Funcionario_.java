package br.edu.utfpr.xstoremagno.model;

import br.edu.utfpr.xstoremagno.model.Compra;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T13:05:21")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> nomefuncionario;
    public static volatile SingularAttribute<Funcionario, String> cargofuncionario;
    public static volatile SingularAttribute<Funcionario, Integer> idfuncionario;
    public static volatile SingularAttribute<Funcionario, String> telefone;
    public static volatile CollectionAttribute<Funcionario, Compra> compraCollection;
    public static volatile SingularAttribute<Funcionario, Date> criacaofuncionario;
    public static volatile SingularAttribute<Funcionario, String> celular;
    public static volatile SingularAttribute<Funcionario, String> emailcontato;

}