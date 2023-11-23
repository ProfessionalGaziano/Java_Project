/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class Televisore {
    int canale;
    int volume;
    boolean acceso;
    
    public Televisore(){
    acceso=false;
    canale=0;
    volume=0;
    }
    
    public void Accendi(){
    if(acceso==false)
        acceso=true;
    else
        acceso=false;
    
    
    }
    public void Volumesu(){
    if(acceso==true){
      if(volume<100)
       volume++;
    }
  
    
    }
    public void VolumeGiu(){
        if(acceso==true){
         
            if(volume>0)
        volume--;
        
        }
   
    
    }

    public void CanaleSu(){
        if(acceso=true){
         canale++;
    if(canale>100)
      
        canale=1;
        
        }
    
    
    }
     public void CanaleGiu(){
         
       if(acceso=true){
        canale--;
     
     if(canale<0)
       canale=100;
     
       
       }  
         
    
     
     }
}
