

package ConexaoDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

///**
// *
// * @author LSA
// */


public class ConectarBD {

    private static String DRIVER;
    private static String URL;
    private static String USER;
    private static String SENHA;

    static {
        // Carregar as configurações do arquivo properties
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties props = new Properties();
            props.load(input);
            
            // Atribuir as configurações de conexão às variáveis
            DRIVER = props.getProperty("db.driver");
            URL = props.getProperty("db.url");
            USER = props.getProperty("db.username");
            SENHA = props.getProperty("db.password");
        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo de configuração: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar configurações do banco de dados!", "Erro de Configuração", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public static Connection conectar() {
        System.out.println("Conectando...1");
        Connection connection = null;
        try {
            // Registrar o driver
            Class.forName(DRIVER);
            
            // Estabelecer a conexão
            connection = DriverManager.getConnection(URL, USER, SENHA);
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a conexão.");
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados!", "Erro #1", JOptionPane.WARNING_MESSAGE);
            }
            return connection;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!", "Erro #2", JOptionPane.WARNING_MESSAGE);
            System.out.println("O driver especificado não foi encontrado.");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados!", "Erro #3", JOptionPane.WARNING_MESSAGE);
            System.out.println("Não foi possível conectar ao Banco de Dados.");
            throw new RuntimeException(e);
        }
    }

    public static void desconectar(Connection con, PreparedStatement pstmt, ResultSet rs) {
        System.out.println("Desconectando...");
        try {
            if (con != null) {
                con.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            System.out.println("Desconectado!");
        } catch (SQLException ex) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados!");
            throw new RuntimeException(ex);
        }
    }
}

