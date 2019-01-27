package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Wendel
 */
public class ModeloConexao {

    // Método responsável por estabelecer a conexão com o banco de dados
    public static Connection conector() {
        Connection conexao = null;
        //Chamando o driver do mysql
        String driver = "com.mysql.jdbc.Driver";
        // Armazendo informações do banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // Esclarecimento de erros de conexão
            //System.out.println("Erro ao conectar com o banco de dados! " + e.getMessage());
            return null;
        }

    }

}
