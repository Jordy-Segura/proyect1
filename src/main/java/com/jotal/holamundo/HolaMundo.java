/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jotal.holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class HolaMundo {

    public static void main(String[] args) {
        /*byte mordida=126;
        System.out.println("mordida="+mordida);
        
        short corto=32000;
        System.out.println("corto="+corto);
        
        int entero=32000;
        System.out.println("entero="+entero);
        
        long largo=32000000;
        System.out.println("largo="+largo);
        
        float decimal=3.045f;
        System.out.println("decimal="+decimal);
        
        double doble=32.0090;
        System.out.println("doble="+doble);
        
        char carater='C';
        System.out.println("caracter="+carater);
        
        boolean boleano=true;
        System.out.println("boleano="+boleano);
        
        String cadena="Hola Mundo";
        System.out.println("cadena="+cadena);
        
        final float pi=3.1416f;
        float res=pi*18;
        System.out.println("pi*18="+res);
        
        Scanner entrada=new Scanner(System.in);
        float numero;
        System.out.println("Ingrese un numero: ");
        numero=entrada.nextFloat();
        System.out.println("Su numero es "+numero);
    
        Scanner entrada2=new Scanner(System.in);
        String letras;
        System.out.println("Ingrese una cadena: ");
        letras=entrada2.nextLine();
        System.out.println("Su cadena es "+letras);
        
        Scanner entrada3=new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese una cadena: ");
        caracter=entrada3.next().charAt(1);
        System.out.println("Su caracter es "+caracter);*/
        
        
        String cadena=JOptionPane.showInputDialog("Ingresa una cadena");
        JOptionPane.showMessageDialog(null, "esta es tu cadena\n"+"--- "+cadena+" ---");
        
        int entero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una cadena"));
        JOptionPane.showMessageDialog(null, "este es tu entero\n"+"--- "+entero+" ---");
        
        
    }
}
