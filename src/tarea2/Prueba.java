/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;
public class Prueba {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena="La Lluvia en Sevilla es una maravilla";
       int contador=0;
       char c;
       for(int i=1;i<cadena.length();i++){
           //Comprobamos si el caracter es una vocal
           c=cadena.charAt(i);
           if(c=='a'|| c=='e'||c=='i'|| c=='i'||c=='u'){
                         
               contador++;
           }
       }
     System.out.println("Hay"+ contador+"vocales");
     
       }           
       
    }    

