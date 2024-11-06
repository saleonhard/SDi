/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LSA
 */
public class Solicitacao {
    String cod;
    String assunto;
    String conteudo;
    String status;

    public Solicitacao() {
    }

    public Solicitacao(String cod, String assunto, String conteudo, String status) {
        this.cod = cod;
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.status = status;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

   
    
}
