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
public class Servidor {
    
    String cod;
    String nome;
    String email;
    String estado;
    String campus;

    public Servidor() {
    }

    public Servidor(String cod, String nome, String email, String estado, String campus) {
        this.cod = cod;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.campus = campus;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

   
    
}
