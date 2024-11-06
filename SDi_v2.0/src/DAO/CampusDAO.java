/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexaoDB.ConectarBD;
import Entidades.Campus;
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
public class CampusDAO {

    private static final String SQL_INSERIR = "INSERT INTO campus (cod,nome,local) VALUES(?,?,?) ";

    private static final String SQL_DELETAR = "DELETE FROM campus WHERE cod = ?";

    private static final String SQL_ALTERAR = "UPDATE campus SET nome=?,local=? WHERE cod = ?";

    private static final String SQL_LISTAR = "SELECT * FROM campus";

    private static final String SQL_BUSCAR = "SELECT * FROM campus WHERE cod = ? ";
   
    private static final String SQL_BUSCAR_2 = "Select * from campus Where nome like ? OR cod like ? ;";
   
    
    private boolean retorno = false;

    public boolean inserirCampus(Campus campus) {

        Connection con = null;
        PreparedStatement stmt = null;
       
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_INSERIR);
            stmt.setString(1, campus.getCod());
            stmt.setString(2, campus.getNome());
            stmt.setString(3, campus.getLocal());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean deletarCampus(Campus campus) {

        Connection con = null;
        PreparedStatement stmt = null;
        
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_DELETAR);
            stmt.setString(1, campus.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean alterarCampus(Campus campus) {

        Connection con = null;
        PreparedStatement stmt = null;
        
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ALTERAR);
            stmt.setString(1, campus.getNome());
            stmt.setString(2, campus.getLocal());
            stmt.setString(3, campus.getCod());

            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public List<Campus> listarCampus() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Campus> listaCampus = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_LISTAR);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Campus campusTPM = new Campus();
                campusTPM.setCod(rs.getString(1));
                campusTPM.setNome(rs.getString(2));
                campusTPM.setLocal(rs.getString(3));

                listaCampus.add(campusTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaCampus;
    }

    public List<Campus> buscarCampus(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Campus> listaCampus = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Campus campusTPM = new Campus();
                campusTPM.setCod(rs.getString(1));
                campusTPM.setNome(rs.getString(2));
                campusTPM.setLocal(rs.getString(3));

                listaCampus.add(campusTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaCampus;
    }
    public List<Campus> buscarCampus2(String keyword) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Campus> listaCampus = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR_2);
           stmt.setString(1,"%" + keyword + "%");
            stmt.setString(2,"%" + keyword + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Campus campusTPM = new Campus();
                campusTPM.setCod(rs.getString(1));
                campusTPM.setNome(rs.getString(2));
                campusTPM.setLocal(rs.getString(3));

                listaCampus.add(campusTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaCampus;
    }

}
