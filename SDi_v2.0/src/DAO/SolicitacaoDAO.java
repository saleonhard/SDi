/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexaoDB.ConectarBD;
import Entidades.Solicitacao;
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
public class SolicitacaoDAO {
     
    private static final String SQL_INSERIR = "INSERT INTO  solicitacoes (cod,assunto,conteudo,status) VALUES(?,?,?,?) ";

    private static final String SQL_DELETAR = "DELETE FROM solicitacoes WHERE  cod=?";

    private static final String SQL_ALTERAR = "UPDATE solicitacoes SET assunto = ?,conteudo = ?, status = ? WHERE cod = ?";
    
    private static final String SQL_ALTERAR_STATUS = "UPDATE solicitacoes SET status = ? WHERE cod = ?";

    private static final String SQL_LISTAR_TUDO =  "SELECT * FROM solicitacoes";
    
    private static final String SQL_BUSCAR = "SELECT * FROM solicitacoes WHERE  cod = ? ";
    
    private static final String SQL_BUSCAR_2 = "Select * from solicitacoes Where assunto like ? OR cod like ? ;";
   
    private boolean retorno = false;
    
    
    public boolean inserirSolicitacao( Solicitacao solicitacao) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_INSERIR);
            stmt.setString(1, solicitacao.getCod());
            stmt.setString(2, solicitacao.getAssunto());
            stmt.setString(3, solicitacao.getConteudo());
            stmt.setString(4, solicitacao.getStatus());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
    }

    public boolean deletarSolicitacao(Solicitacao solicitacao) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_DELETAR);
            stmt.setString(1, solicitacao.getCod());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, stmt, null);
        }
        return retorno;
    }
  
    public boolean alterarSolicitacao(Solicitacao solicitacao) {

        Connection con = null;
        PreparedStatement stmt = null;
       
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ALTERAR);
           
            stmt.setString(1, solicitacao.getAssunto());
            stmt.setString(2, solicitacao.getConteudo());
            stmt.setString(3, solicitacao.getStatus());
            stmt.setString(4, solicitacao.getCod());
            

            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }

    public boolean alterarStatus(String novoStatus,String codigo) {

        Connection con = null;
        PreparedStatement stmt = null;
       
        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_ALTERAR_STATUS);
            stmt.setString(1,novoStatus);
            stmt.setString(2,codigo);
           
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt, null);
        }
        return retorno;
    }
    
    public List<Solicitacao> listarSolicitacao() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Solicitacao> listaSolicitacoes =  new ArrayList ();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_LISTAR_TUDO);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Solicitacao solicitacaoTPM = new Solicitacao();
                solicitacaoTPM.setCod(rs.getString(1));
                solicitacaoTPM.setAssunto(rs.getString(2));
                solicitacaoTPM.setConteudo(rs.getString(3));
                solicitacaoTPM.setStatus(rs.getString(4));
                listaSolicitacoes.add(solicitacaoTPM);
                
            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }
    
    return listaSolicitacoes ;
}
   
    public List<Solicitacao> buscarSolicitacao(String cod) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Solicitacao> listaSolicitacoes = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Solicitacao solicitacoesTPM = new Solicitacao();
                solicitacoesTPM.setCod(rs.getString(1));
                solicitacoesTPM.setAssunto(rs.getString(2));
                solicitacoesTPM.setConteudo(rs.getString(3));
                solicitacoesTPM.setStatus(rs.getString(4));

                listaSolicitacoes.add(solicitacoesTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaSolicitacoes;
    }
    public List<Solicitacao> buscarSolicitacao2(String keyword) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Solicitacao> listaSolicitacoes = new ArrayList();

        try {
            con = ConectarBD.conectar();
            stmt = con.prepareStatement(SQL_BUSCAR_2);
            stmt.setString(1,"%" + keyword + "%");
            stmt.setString(2,"%" + keyword + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Solicitacao solicitacoesTPM = new Solicitacao();
                solicitacoesTPM.setCod(rs.getString(1));
                solicitacoesTPM.setAssunto(rs.getString(2));
                solicitacoesTPM.setConteudo(rs.getString(3));
                solicitacoesTPM.setStatus(rs.getString(4));

                listaSolicitacoes.add(solicitacoesTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,stmt,rs);
        }

        return listaSolicitacoes;
    }


    
}
