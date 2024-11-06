/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexaoDB.ConectarBD;
import Entidades.Servidor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LSA
 */
public class ServidorDAO {

    private static final String SQL_INSERIR = "INSERT INTO servidores (cod,nome,email,tipo,campus) VALUES (?,?,?,?,?)";

    private static final String SQL_DELETAR = "DELETE FROM servidores WHERE cod = ?";

    private static final String SQL_ALTERAR = "UPDATE servidores SET nome = ?,email = ?,tipo =?,campus =? WHERE cod = ?";

    private static final String SQL_BUSCAR = "SELECT * FROM servidores WHERE cod = ? ";
    
    private static final String SQL_BUSCAR_2 = "Select * from servidores Where nome like ? OR cod like ? ;";
    
    
     private static final String SQL_VERIFICAR_EMAIL = "SELECT * FROM servidores WHERE email = ?";
    

    private boolean retorno = false;

    public boolean inserirServidor(Servidor servidor) {

        Connection con = null;
        PreparedStatement stmt= null;
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_INSERIR);
            stmt.setString(1, servidor.getCod());
            stmt.setString(2, servidor.getNome());
            stmt.setString(3, servidor.getEmail());
            stmt.setString(4, servidor.getEstado());
            stmt.setString(5, servidor.getCampus());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean deletarServidor(Servidor servidor) {

        Connection con = null;
        PreparedStatement stmt= null;
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_DELETAR);
            stmt.setString(1, servidor.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean atualizarServidor(Servidor servidor) {

        Connection con = null;
        PreparedStatement stmt= null;
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ALTERAR);
            stmt.setString(1, servidor.getNome());
            stmt.setString(2, servidor.getEmail());
            stmt.setString(3, servidor.getEstado());
            stmt.setString(4, servidor.getCampus());
            stmt.setString(5, servidor.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public List<Servidor> listarServidores(String SQL) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
         
        List<Servidor> listaServidores = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Servidor servidorTPM = new Servidor();
                servidorTPM.setCod(rs.getString(1));
                servidorTPM.setNome(rs.getString(2));
                servidorTPM.setEmail(rs.getString(3));
                servidorTPM.setEstado(rs.getString(4));
                servidorTPM.setCampus(rs.getString(5));

                listaServidores.add(servidorTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaServidores;
    }

    public List<Servidor> buscarServidores(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Servidor> listaServidores = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Servidor servidorTPM = new Servidor();
                servidorTPM.setCod(rs.getString(1));
                servidorTPM.setNome(rs.getString(2));
                servidorTPM.setEmail(rs.getString(3));
                servidorTPM.setEstado(rs.getString(4));
                servidorTPM.setCampus(rs.getString(5));

                listaServidores.add(servidorTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return listaServidores;
    }
     public List<Servidor> buscarServidores2(String keyword) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        List<Servidor> listaServidores = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR_2);
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                Servidor servidorTPM = new Servidor();
                servidorTPM.setCod(rs.getString(1));
                servidorTPM.setNome(rs.getString(2));
                servidorTPM.setEmail(rs.getString(3));
                servidorTPM.setEstado(rs.getString(4));
                servidorTPM.setCampus(rs.getString(5));

                listaServidores.add(servidorTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return listaServidores;
    }
    
     public Servidor verificarEmail(String email) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Servidor servidorTPM = new Servidor();
        servidorTPM.setEmail("");

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_VERIFICAR_EMAIL);
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            while (rs.next()) {
                servidorTPM.setCod(rs.getString(1));
                servidorTPM.setNome(rs.getString(2));
                servidorTPM.setEmail(rs.getString(3));
                servidorTPM.setEstado(rs.getString(4));
                servidorTPM.setCampus(rs.getString(5));
                
                return servidorTPM;

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }
       return servidorTPM; 
        
    } 

}
