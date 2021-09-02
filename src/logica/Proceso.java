/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */

/*  
    112 1
    LUN2A = 5
    
    A, E, I, O, U, L, N, R, S, T = 1       
    D, G = 2
    B, C, M, P = 3
    F, H, V, W, Y, K, J, X, Q, Z = 4
*/

public class Proceso {
    
    String palabra;
    
    public Proceso(String pPalabra){
        //Creamos una variable temporal, sin convertir
        //quiere decir que aun no sabemos si todas son 
        //Mayusculas. Ya con el metodo toUpperCase()
        //Nos aseguramos que todas sean mayusculas.
        String palabraSinConvertir = pPalabra;
        palabra = palabraSinConvertir.toUpperCase();
    }
    
    public int contarLaPuntacion(){
       //Puntaje de mi palabra
        int cont = 0;
    
             for(int i=0; i < palabra.length(); i++) {
            
            // A, E, I, O, U, L, N, R, S, T = 1 
            if(palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' ||
               palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O' ||
               palabra.charAt(i) == 'U' || palabra.charAt(i) == 'L' || 
               palabra.charAt(i) == 'N' || palabra.charAt(i) == 'R' ||
               palabra.charAt(i) == 'S' || palabra.charAt(i) == 'T' ){
                
                
                //LUN2A = lenght() 5 - 1 = 4
                
                //LUN2A = 5 
                
                if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 2;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 3;
                    }
                    else{
                        cont++;
                    }
                }
                else{
                    cont++;
                    }
                
               
               
            }
            //D, G = 2
            else if(palabra.charAt(i) == 'D' || palabra.charAt(i) == 'G'){
                
                if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 4;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 6;
                    }
                    else{
                        cont = cont + 2;
                    }
                }
                else{
                    cont = cont + 2;
                    }
            }
            
            //B, C, M, P = 3
            else if(palabra.charAt(i) == 'B' || palabra.charAt(i) == 'C' || 
                    palabra.charAt(i) == 'M' || palabra.charAt(i) == 'P'){
                
                 if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 6;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 9;
                    }
                    else{
                        cont = cont + 3;
                    }
                }
                else{
                    cont = cont + 3;
                    }
            }
            
            //F, H, V, W, Y, K, J, X, Z = 4
            else if(palabra.charAt(i) == 'F' || palabra.charAt(i) == 'H' || 
                    palabra.charAt(i) == 'V' || palabra.charAt(i) == 'W' || 
                    palabra.charAt(i) == 'Y' || palabra.charAt(i) == 'K' ||  
                    palabra.charAt(i) == 'Z' ){
                
                 if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 8;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 12;
                    }
                    else{
                        cont = cont + 4;
                    }
                }
                else{
                    cont = cont + 4;
                    }
            }
            
            // Q = 5 La 'Q' no vale 4
            
            else if(palabra.charAt(i) == 'Q'){
                
                if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 10;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 15;
                    }
                    else{
                        cont = cont + 5;
                    }
                }
                else{
                    cont = cont + 5;
                    }
            }
            
            //CH = 5
            //LL, RR,= 8
            else if(palabra.charAt(i) == '-'){
                
                String temp;
                if(i  < palabra.length() - 1){
                    
                    temp = (String.valueOf(palabra.charAt(i + 1)) + 
                            String.valueOf(palabra.charAt( i + 2)));
                    
                    if(temp.equals("CH")){
                        if(palabra.charAt(i + 3) == '2'){
                            cont = cont + 10;
                            i = i + 2;
                        }
                        else if(palabra.charAt(i + 3) == '3'){
                            cont = cont + 15;
                            i = i + 2;
                        }
                        else{
                            cont = cont + 5;
                            i = i + 2;
                        }
                    }
                    else{
                        
                         if(palabra.charAt(i + 3) == '2'){
                            cont = cont + 16;
                            i = i + 2;
                        }
                        else if(palabra.charAt(i + 3) == '3'){
                            cont = cont + 24;
                            i = i + 2;
                        }
                        else{
                            cont = cont + 8;
                            i = i + 2;
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "No puede colocar el simbolo\n "
                            + "'-' al final de la frase.",
                "Error",JOptionPane.ERROR_MESSAGE);
                    
                    
                }
            }
            
            
            
            //J, Ñ, X = 8 La 'X' y la 'J' no valen 4
            else if(palabra.charAt(i) == 'X' || palabra.charAt(i) == 'J' ||
                    palabra.charAt(i) == 'Ñ'){
                
                 if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 16;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 24;
                    }
                    else{
                        cont = cont + 8;
                    }
                }
                else{
                    cont = cont + 8;
                    }
                
            }
            
            //Z = 10
            else if(palabra.charAt(i) == 'Z'){
                 if( i < palabra.length() - 1){
                     if(palabra.charAt(i + 1) == '2'){
                        cont = cont + 20;
                    }
                    else if(palabra.charAt(i + 1) == '3'){
                        cont = cont + 30;
                    }
                    else{
                        cont = cont + 10;
                    }
                }
                else{
                    cont = cont + 10;
                    }
            }
            
            else if(palabra.charAt(i) == '*'){
                
                if(palabra.charAt(palabra.length() - 1) == '2'){
                    
                    cont = cont * 2;
                }
                else if(palabra.charAt(palabra.length() - 1) == '3'){
                    
                    cont = cont * 3;
                }
            }
            
   
        }
        
        return cont;
    }
    
}
