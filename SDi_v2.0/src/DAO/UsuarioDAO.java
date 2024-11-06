/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexaoDB.ConectarBD;
import Entidades.Usuario;
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
public class UsuarioDAO {

    private static final String SQL_INSERIR = "INSERT INTO usuarios (cod,nome,email,login,senha,tipo) VALUES(?,?,?,?,?,?)";

    private static final String SQL_DELETAR = "DELETE FROM usuarios WHERE cod = ?";

    private static final String SQL_ALTERAR = "UPDATE usuarios SET nome = ?,email = ?, login = ?,senha = ?,tipo = ? WHERE cod = ?";
 
    private static final String SQL_LISTAR = "SELECT * FROM usuarios";

    private static final String SQL_BUSCAR = "SELECT * FROM usuarios WHERE cod = ? ";
    
    private static final String SQL_VERIFICAR_LOGIN = "SELECT * FROM usuarios WHERE login = ?";
    
    private static final String SQL_BUSCAR_2 = "Select * from usuarios Where nome like ? OR cod like ? ;";
   
   
    private boolean retorno = false;

    public boolean inserirUsuario(Usuario usuario) {

        Connection con = null;
        PreparedStatement stmt = null;
        
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_INSERIR);
            stmt.setString(1, usuario.getCod());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getLogin());
            stmt.setString(5, usuario.getSenha());
            stmt.setString(6, usuario.getTipo());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean deletarUsuario(Usuario usuario) {

        Connection con = null;
        PreparedStatement stmt = null;
        
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_DELETAR);
            stmt.setString(1, usuario.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean alterarUsuario(Usuario usuario) {

        Connection con = null;
        PreparedStatement stmt = null;
       
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ALTERAR);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getTipo());
            stmt.setString(6, usuario.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public List<Usuario> listarUsuarios() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> listaUsuarios = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_LISTAR);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuarioTPM = new Usuario();
                usuarioTPM.setCod(rs.getString(1));
                usuarioTPM.setNome(rs.getString(2));
                usuarioTPM.setEmail(rs.getString(3));
                usuarioTPM.setLogin(rs.getString(4));
                usuarioTPM.setSenha(rs.getString(5));
                usuarioTPM.setTipo(rs.getString(6));
                

                listaUsuarios.add(usuarioTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaUsuarios;
    }

    public List<Usuario> buscarUsuario(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> listaUsuarios = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuariosTPM = new Usuario();
                usuariosTPM.setCod(rs.getString(1));
                usuariosTPM.setNome(rs.getString(2));
                usuariosTPM.setEmail(rs.getString(3));
                usuariosTPM.setLogin(rs.getString(4));
                usuariosTPM.setSenha(rs.getString(5));
                usuariosTPM.setTipo(rs.getString(6));
                listaUsuarios.add(usuariosTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return listaUsuarios;
    }
    
     public List<Usuario> buscarUsuario2(String keyword) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> listaUsuarios = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR_2);
            stmt.setString(1,"%" + keyword + "%");
            stmt.setString(2,"%" + keyword + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuariosTPM = new Usuario();
                usuariosTPM.setCod(rs.getString(1));
                usuariosTPM.setNome(rs.getString(2));
                usuariosTPM.setEmail(rs.getString(3));
                usuariosTPM.setLogin(rs.getString(4));
                usuariosTPM.setSenha(rs.getString(5));
                usuariosTPM.setTipo(rs.getString(6));
                listaUsuarios.add(usuariosTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return listaUsuarios;
    }
     public Usuario buscarUsuario3(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuariosTPM = new Usuario();
       
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1,cod);
           
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                usuariosTPM.setCod(rs.getString(1));
                usuariosTPM.setNome(rs.getString(2));
                usuariosTPM.setEmail(rs.getString(3));
                usuariosTPM.setLogin(rs.getString(4));
                usuariosTPM.setSenha(rs.getString(5));
                usuariosTPM.setTipo(rs.getString(6));
               

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return usuariosTPM;
    }
    
    
    
     public Usuario verificarLogin(String login) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuarioTPM = new Usuario();
        usuarioTPM.setLogin("");

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_VERIFICAR_LOGIN);
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                usuarioTPM.setCod(rs.getString(1));
                usuarioTPM.setNome(rs.getString(2));
                usuarioTPM.setEmail(rs.getString(3));
                usuarioTPM.setLogin(rs.getString(4));
                usuarioTPM.setSenha(rs.getString(5));
                usuarioTPM.setTipo(rs.getString(6));
                return usuarioTPM;

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }
       return usuarioTPM; 
        
    } 
     
     

}
