/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cjava.pruebas;

/**
 *
 * @author miguel Alumno
 */
public class Prueba02 {
    public static void main(String[] args) {
        // TODO code application logic here
        String a = args[0];
        byte b = 0B0010;
        System.out.println(b);
        int c = b++;
        System.out.println(c);
        byte d = ++b;
        System.out.println(d);
        System.out.println(a+b+c+d);
        //System.out.println(args[1]);
        
    }
}
