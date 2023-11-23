/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author Utente
 */
public class Libro {
    InputStreamReader Input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(Input);

    

    private String nome;
    private double prezzo;
    private int n_scaffale;
    private int n_pagine;
    private String Casa_editrice;
    private double Inizializza1;
    private int Inizializza2;
    private String stampa;
    private float applica_Sconto;
    private float sconto=50;
   private double operazioni=0;
   
  
    
  
    public void setsconto(float sconto){
    
    this.sconto=sconto;
    
    
    }
    public void setoperazioni(double operazioni ){
        
        
        this.operazioni=operazioni;
    
    
    
    }
    
    public void setnome(String nome){
    
    this.nome=nome;
    
    }
    public void setprezzo(double prezzo){
    
    this.prezzo=prezzo;
    
    }
    
    public void setn_scaffale(int n_scaffale){
    
    this.n_scaffale=n_scaffale;
    
    
    }
    public void setn_pagine(int n_pagine){
    
    this.n_pagine=n_pagine;
    
    
    }
    
    public void setCasa_editrice(String Casa_Editrice){
    
    this.Casa_editrice=Casa_Editrice;
    
    }
    
    public void setInizializza1(double Inizializza1){
        
        
    this.Inizializza1=Inizializza1;
    
    
    }
    
    public double getInizializza1(){
    try{
    
    prezzo=Double.parseDouble(tastiera.readLine());
    
    }catch(Exception e){
    
    
    System.out.println("Input Errato!");
    
    
    }
   
      return Inizializza1;
    }
     
    public void setInizializza2(int Inizializza2){
        
        
    this.Inizializza2=Inizializza2;
    
    
    }
    
   
    public int Inizializza2(){
    
    try{
    
    n_pagine=Integer.parseInt(tastiera.readLine());
    n_scaffale=Integer.parseInt(tastiera.readLine());
    
    
    }catch(Exception e){
    
    System.out.println("Input Errato");
    
    }
 
   
   
   return Inizializza2; 
    
    }
    
       public void setapplica_Sconto(float applica_Sconto){
    
    this.applica_Sconto=applica_Sconto;
    
    }
    
    public float getapplica_Sconto(){
    
    operazioni=prezzo/100;
    operazioni=operazioni*50-prezzo;
    
    return applica_Sconto;
    }
    
    public void stampa(){
    
   System.out.println("il prezzo e'"+prezzo+"/n il numero di scaffale e'"+n_scaffale+"/n il numero di pagine e'"+n_pagine+"/n Congratulazioni lo sconto e'"+applica_Sconto);
    
    }
    }
    
    
    
  
    
   
    
 
    
    
    
    

