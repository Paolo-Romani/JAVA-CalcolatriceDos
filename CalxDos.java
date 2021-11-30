/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calxdos;

import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class CalxDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op="";
        int num = 0, ris=0;
        
        boolean stato = true, uguale = false;
        
        do{
            switch(op){
                case "=":
                    System.out.println("RISULTATO: "+ris);
                    uguale = true;
                    break;
                case "AC":
                    op = "";
                    uguale = false;
                    break;
                case "off":
                    stato = false;
                    break;
            }
            if(stato){
                if(!uguale){
                    System.out.println("Inserisci un numero");
                    num = sc.nextInt();
                }else
                    uguale = false;
                switch(op){
                    case "":
                        ris = num;
                        break;
                    case "+":
                        ris = ris + num;
                        break;
                    case "-":
                        ris = ris - num;
                        break;
                    case "*":
                        ris = ris * num;
                        break;
                    case "/":
                        ris = ris / num;
                        break;
                }            
                System.out.println("OPERAZINI: + - * / AC off, scegli");
                op = sc.next();
            }
        }while(stato);
        
    }
    
}
