
package br.com.infox.dal;

import java.sql.*;
public class ModuloConexao {
   
    // metodo para conectar-se com o banco
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // chamando o driver do sql
        String driver = "com.mysql.jdbc.Driver";
        // armazenar informaçoes referentes ao banco
        String url ="jdbc:mysql://localhost:3306/dbinfox";
        String user ="root";
        String password = "";
        // estabelecendo a conexao com o banco de dados
        // 1 tratando as excessoes
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    } 
    
}
