package br.anhembi.projetoagencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_agencia";
    private static final String BD_USER = "professor";
    private static final String BD_PASSWORD = "aula";
    
    // 1. Conectar com o BD
    // 2. Mandar a instrução para o BD
    // 3. Receber a resposta do BD
    // 4. Fechar a conexão
    
    public static boolean inserir(Usuario usuario) {
        String sql = "insert into usuarios (nome, email) values (?, ?);";
        // esse try fecha automaticamente as conexões
        try(
            Connection connection = DriverManager.getConnection(
                    BD_URL, BD_USER, BD_PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql); 
        ){
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getEmail());
            statement.executeUpdate();
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        } 
    }
      
    public static boolean apagar(int id) {
        String sql = "delete from usuarios where id = ?;";
        // esse try fecha automaticamente as conexões
        try(
            Connection connection = DriverManager.getConnection(
                    BD_URL, BD_USER, BD_PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql); 
        ){
            statement.setInt(1, id);
            int registros = statement.executeUpdate();
            return (registros > 0);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        } 
    }
}
