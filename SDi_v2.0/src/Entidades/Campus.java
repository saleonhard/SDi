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
public class Campus {
    String cod;
    String nome;
    String local;

   

    public Campus() {
    }
     public Campus(String cod, String nome, String local) {
        this.cod = cod;
        this.nome = nome;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
     

}
