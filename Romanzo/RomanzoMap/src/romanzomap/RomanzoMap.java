/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romanzomap;

import java.io.*;
import java.util.*;

/**
 *
 * @author Studente
 */
public class RomanzoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String inputFile = "dati/romanzo.txt";
Map d = new HashMap();
     
int dimTesto = contaParole(inputFile);
              String testo[] = new String[dimTesto];	
			d.put(dimTesto,0);
              
System.out.println("come poter lavorare col testo:\n 1) Conta numero di parole\n 2)conta numero di parole diverse\n 3) esci");
         int scelta = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

		
			switch (scelta) {
			
				                
			case 1: {
	                 System.out.println("Il numero di parole nel testo e' " + dimTesto);
			};
			
			
			break;
			case 2: 
                        {
		         System.out.println("Il numero di parole diverse è " + contaparolediverse(inputFile));	
			};
			break;
                        case 3:{
                            System.out.println("Uscita dal programma...");
                        };
                       
			}
			
			
		}
	
	


	// Conta il numero di parole contenute nel testo
public static int contaParole(String inputFile) throws IOException {
		int conto = 0;
		
                StringTokenizer riga = null;
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		String s = in.readLine();
		while(s != null) {
			riga = new StringTokenizer(s, " \t\n\r\f,.;:");
			conto = conto + riga.countTokens();
			s = in.readLine();
		}
		return conto;
	          
            

}    	 
public static int contaparolediverse(String inputFile) throws IOException{
    int conto =0;   
    int dimTesto = contaParole(inputFile);
String testo[] = new String [dimTesto];
    for (int i = 0; i < testo.length; i++) {
        for (int j = testo.length-1; j <=1; j--) {
          if(testo[i].equalsIgnoreCase(testo[j])){
              testo[i] = testo[j];
          conto ++;            
          while(testo[i].contentEquals(testo[j])){
              conto = conto+2;
          }
          }
    
        }
}
return conto;
}
}

		        


    


	
    

