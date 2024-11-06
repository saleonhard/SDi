/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

import java.util.ArrayList;
import java.util.Random;

public class GeradorCodigos {
    
    private static final int TAM = 1;
    private static ArrayList<String> codigos = new ArrayList<>();
    
    public String gerarCodigo(String alfabeto){
        String codigoGerado = "";
        Random aleatorio = new Random();
        for(int i = 0 ; i < 6 ; i ++){
            int indice;
            if( i < 2){
             indice = aleatorio.nextInt(TAM);
              codigoGerado = codigoGerado + alfabeto.charAt(indice);
            }
            else{
             indice = aleatorio.nextInt(10);
             codigoGerado = codigoGerado + indice;
            }
        }
        if(codigos.contains(codigoGerado)){
           return  gerarCodigo(alfabeto);
        }
        else{
          codigos.add(codigoGerado);
          return codigoGerado;
        }
   }
    

}
