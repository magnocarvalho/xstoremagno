/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Magno Carvalho
 */
public class EMNames {

    public static final String EMN1 = "br.edu.utfpr_xstoremagno_war_1.0-SNAPSHOTPU";

    public static Map<String, String> getEMN1Props() {

        String heroku_db = System.getenv("DATABASE_URL"); // variavel de ambiente criada pelo Heroku
        Map<String, String> properties = new HashMap<>();

        if (heroku_db == null) { // caso nao tenhamos a variavel de ambiente
            properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost:5432/dbloja");
            properties.put("javax.persistence.jdbc.user", "postgres");
            properties.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");
            properties.put("javax.persistence.jdbc.password", "root");
        } else { // se a variavel de ambiente foi criada, indica que o projeto está alocado no
                 // heroku
            // properties.put("javax.persistence.jdbc.url",
            // "jdbc:postgresql://ec2-184-73-202-79.compute-1.amazonaws.com:5432/d27dm10t2iscbc?sslmode=require");
            // properties.put("javax.persistence.jdbc.user", "okdvfyabceaqmz");
            // properties.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");
            // properties.put("javax.persistence.jdbc.password",
            // "037e654cd0b0f5b25b3973734a99cc9b3cec28a354eee53d92d742e0e4737ce3");
            // obter demais variaveis e configurar persistence.xml
            String jdbc_database_url = System.getenv("JDBC_DATABASE_URL");
            String jdbc_database_username = System.getenv("JDBC_DATABASE_USERNAME");
            String jdbc_database_password = System.getenv("JDBC_DATABASE_PASSWORD");

            properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://xlcfrjxjcnnphz:b8b2eb0c4103d89891e3b8aded05af85523146d71dac164510020e59ecc615e5@ec2-23-21-65-173.compute-1.amazonaws.com:5432/dc6d1hh34hakec");
            properties.put("javax.persistence.jdbc.user", "xlcfrjxjcnnphz");
            properties.put("javax.persistence.jdbc.password", "b8b2eb0c4103d89891e3b8aded05af85523146d71dac164510020e59ecc615e5");
            properties.put("javax.persistence.jdbc.driver", "org.postgresql.Driver"); // configurando driver para
                                                                                      // postgres
        }
        return properties;
    }

}
