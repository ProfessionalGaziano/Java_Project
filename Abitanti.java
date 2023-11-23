/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citta;

/**
 *
 * @author Utente
 */
public class Abitanti {
    
    private int Abitanti;
    private String Nome;
   
    
    public void setNome(String Nome){
    
    this.Nome=Nome;
        
    }
    public String getnome(){
    
 return Nome;  
    
    }
    public void setAbitanti(int Abitanti){
    
    this.Abitanti=Abitanti;
   
    }
    
    public int getAbitanti(){
    
    return Abitanti;
   
    }
    
    public void stampa(){
    
System.out.println("I nomi delle citta sono: "+Nome+"Gli Abitanti sono"+Abitanti);
        
    }
    
    
    
    
    
    
}
