
package progricerca;

import java.io.*;


public class ProgRicerca {
    
 
    public static void main(String[] args) {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);
        int numeri[]=new int[10];
        int ricerca=0;
        boolean trovato=false;
        int pos=0;
        
        for (int i=0;i<numeri.length;i++){
            try{
                System.out.print("Inserisci il "+(i+1)+" valore: ");
                numeri[i]=Integer.parseInt(tastiera.readLine());
            }
            catch(Exception e){}
                
        }
        
         System.out.print("Inserisci il numero da cercare: ");
        
        try{
                
                ricerca=Integer.parseInt(tastiera.readLine());
            }
            catch(Exception e){}
        
        for (int i=0;i<numeri.length && trovato==false;i++){
            if(numeri[i]==ricerca)
            {
                trovato=true;
                pos=i;
            }
            
        }
        
        if (trovato==true)
            System.out.print("Il numero e' stato trovato" 
                     +"alla posizione "+pos);
        else
            System.out.print("Il numero non e' stato trovato"); 
        

    }
    
}
