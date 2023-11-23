/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricerca.numero.nel.vettore;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Utente
 */
public class RicercaConcorrenti{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       InputStreamReader input=new InputStreamReader(System.in);
       BufferedReader tastiera=new BufferedReader(input);
       String nomi[]=new String[10];
       String Nome_Ricerca[]=new String[10];
       int i,posizione=0;
       boolean trovato=false;
       
       for(i=0;i<nomi.length;i++){
       
           System.out.println("Inserisci il nome dei concorrenti che hanno tagliato il  traguardo "+(i+1)+":");
           try{
           
           nomi[i]=tastiera.readLine();
           
               
               
           }catch(Exception e){
           
           System.out.println("Devi Inserire dei Nomi!");
           
           
           }
       }
       
       System.out.println("\n Inserisci il Concorrente registrato che vuoi trovare all'interno della competizione");
       try{
           
           Nome_Ricerca[i]=tastiera.readLine();
           
       }catch(Exception e){
           
           System.out.println("Devi inserire un nome");
           
       }
            for(i=0;i<nomi.length && trovato==false;i++){
          
          if(Nome_Ricerca[i]==nomi[i]){
           trovato=true;
           posizione=i;
           
           }
       
       }
                if(trovato==true){
           
           System.out.println("Il concorrente  che hai cercato e' in posizione:   "+posizione+"    il concorente ricercato e':"+Nome_Ricerca);
           
           }else{
           
           System.out.println("Il Concorrente non e' registrato");
           
           }
       
    }
    
}
