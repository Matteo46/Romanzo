/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romanzo;

import java.io.*;
import java.util.*;

/**
 *
 * @author Studente
 */
public class Romanzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v;
        TreeSet t = new TreeSet();
        StringTokenizer tokenizer;
        int inserimenti = 0;
        try {
            FileReader f = new FileReader("dati/romanzo.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                v = s.nextLine();
                tokenizer = new StringTokenizer(v, " ,.:;()!?-\"");
                while (tokenizer.hasMoreTokens()) {
                    inserimenti++;
                    t.add(tokenizer.nextToken().toLowerCase());
                
                }
            }
            System.out.println("Parole totali: " + inserimenti);
            System.out.println("Parole distinte: " + t.size());
        } catch (FileNotFoundException ex) {
            System.out.println("ERRORE" + ex.getMessage());
        }
    }
}
