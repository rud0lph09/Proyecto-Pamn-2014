/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.Math;


/**
 *
 * @author honoratosh
 */
public class Biseccionador {

    public Funcion f;
    double ma, mb, c;

    public Biseccionador(double a, double b, Funcion la_funcion){
    	ma = a;
    	mb = b; 
    	f = la_funcion;
    }
    
    public double calcular (double x){
    	

    	do {
            c = (ma + mb)/2;
    		if ((f.Funcion(ma)*f.Funcion(c)) < 0) {
    			mb = c;	
            System.out.println("a");
    		}else  {
    			ma = c;
            System.out.println("b");
            }
    	} while(Math.abs(ma-mb) > x && f.Funcion(c) !=0);
    	
        return c;
    }
    
}
