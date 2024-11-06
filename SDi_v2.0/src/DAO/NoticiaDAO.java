/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexaoDB.ConectarBD;
import Entidades.Noticia;
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
public class NoticiaDAO {
     
    private static final String SQL_INSERIR = "INSERT INTO noticias (cod,assunto,noticia,status,destinatario) VALUES(?,?,?,?,?) ";

    private static final String SQL_DELETAR = "DELETE FROM noticias WHERE cod = ?";

    private static final String SQL_ATUALIZAR = "UPDATE noticias SET assunto = ?, noticia = ?,status =?, destinatario =? WHERE cod = ?";
    
    private static final String SQL_ATUALIZAR_STATUS = "UPDATE noticias SET status = ?, destinatario = ? WHERE cod = ?";

    private static final String SQL_LISTAR = "SELECT * FROM noticias";
    
    private static final String SQL_BUSCAR = "SELECT * FROM noticias WHERE cod = ? ";

    private static final String SQL_BUSCAR_2 = "Select * from noticias where  assunto like ? OR cod like ? ;";
   
    
    private boolean retorno = false;
    
    
    public boolean inserirNoticia( Noticia noticia) {

        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_INSERIR);
            stmt.setString(1, noticia.getCod());
            stmt.setString(2, noticia.getAssunto());
            stmt.setString(3, noticia.getNoticia());
            stmt.setString(4, noticia.getStatus());
            stmt.setString(5, noticia.getDestinatario());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
    }

    public boolean deletarNoticia(Noticia noticia) {

        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_DELETAR);
            stmt.setString(1, noticia.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
    }
  
    public boolean alterarNoticia(Noticia noticia) {
   
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ATUALIZAR);
           
            stmt.setString(1, noticia.getAssunto());
            stmt.setString(2, noticia.getNoticia());
            stmt.setString(3, noticia.getStatus());
            stmt.setString(4, noticia.getDestinatario());
            stmt.setString(5, noticia.getCod());
            

            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
}

    public boolean alterarStatus(String codigo,String status,String destinatrio) {
   
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ATUALIZAR_STATUS);
           
            stmt.setString(1, status);
            stmt.setString(2, destinatrio);
            stmt.setString(3, codigo);
           
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
}

    
     public List<Noticia> listarNoticias() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Noticia> listaNoticias = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_LISTAR);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Noticia noticiaTPM = new Noticia();
                noticiaTPM.setCod(rs.getString(1));
                noticiaTPM.setAssunto(rs.getString(2));
                noticiaTPM.setNoticia(rs.getString(3));
                noticiaTPM.setStatus(rs.getString(4));
                noticiaTPM.setDestinatario(rs.getString(5));

                listaNoticias.add(noticiaTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, rs);
        }

        return listaNoticias;
    }
      
     
      public List<Noticia> buscarNoticia(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Noticia> listaNoticias = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Noticia noticiaTPM = new Noticia();
                noticiaTPM.setCod(rs.getString(1));
                noticiaTPM.setAssunto(rs.getString(2));
                noticiaTPM.setNoticia(rs.getString(3));
                noticiaTPM.setStatus(rs.getString(4));
                noticiaTPM.setDestinatario(rs.getString(5));
                listaNoticias.add(noticiaTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaNoticias;
    }
       public List<Noticia> buscarNoticia2(String keyword) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Noticia> listaNoticias = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR_2);
            stmt.setString(1,"%" + keyword + "%");
            stmt.setString(2,"%" + keyword + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Noticia noticiaTPM = new Noticia();
                noticiaTPM.setCod(rs.getString(1));
                noticiaTPM.setAssunto(rs.getString(2));
                noticiaTPM.setNoticia(rs.getString(3));
                noticiaTPM.setStatus(rs.getString(4));
                noticiaTPM.setDestinatario(rs.getString(5));
                listaNoticias.add(noticiaTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaNoticias;
    }

    
}
