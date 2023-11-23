/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Utente
 */
public class Citta {

   
    public static void main(String[] args) {
       InputStreamReader input=new InputStreamReader(System.in);
       BufferedReader tastiera=new BufferedReader(input);
       
        int Abitanti=0;
        int numero=0;
         int max=0;
     Citta citta[]=new Citta[numero];
        int i;
        
        
      
        for(i=0;i<citta.length;i++){
        
        citta[i]=new Citta();     
        
        System.out.println("Inserisci il nome di una citta: ");
                try{
                
                
                  citta[i].setNome (tastiera.readLine());
                
                
                }catch(Exception e){
                
                
                System.out.println("Devi Inserire Un nome!");
                
                
                
                
                }
        
        
        
        
        
        }

       System.out.println("Inserisci il  Numero di Abitanti Delle Citta:");
       
        try{

            Abitanti=Integer.parseInt(tastiera.readLine());
     
            
        }catch(Exception e){
        
        
        System.out.println("Devi scrivere un Numero.");
        
        }
   if(Abitanti>max){
   
   max=Abitanti;
   
   }
        
        
    }

    }

   
    

    
