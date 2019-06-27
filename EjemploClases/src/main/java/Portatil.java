/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUMARS
 */
public class Portatil {
    String color;
    String procesador;
    

    public void establecerColor (String c){
        color = c;
    }
    
    public String obtenerColor (){
        return color;
    }
    
    public void establecerProcesador (String p){
        procesador = p;
    }
    
    public String obtenerProcesador (){
        return procesador;
    }
}
