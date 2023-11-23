/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Utente
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String nome="";
        String cognome="";

        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);

        try {
            System.out.println("Scrivi il tuo nome: ");
            nome = tastiera.readLine();
            System.out.println("\n Scrivi il tuo Cognome: ");
            cognome = tastiera.readLine();
        }catch (Exception e){
            System.out.println("Devi inserire una lettera non dei numeri.");
           
        }
        System.out.println(" Il tuo nome e':"+nome+" Il tuo cognome e': "+cognome);
    }
}
    }
    
}
