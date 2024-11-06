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
public class Noticia {
    
    String cod;
    String assunto;
    String noticia;
    String status;
    String destinatario;

    public Noticia() {
    }

    public Noticia(String cod, String assunto, String noticia, String status, String destinatario) {
        this.cod = cod;
        this.assunto = assunto;
        this.noticia = noticia;
        this.status = status;
        this.destinatario = destinatario;
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

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

 
    
}
