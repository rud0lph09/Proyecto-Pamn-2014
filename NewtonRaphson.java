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
public class NewtonRaphson 
{
    public Funcion f;
    
    /**
     * método que asigna valor a f
     * @param la_funcion 
     */
    public NewtonRaphson(Funcion la_funcion)
    {
        f = la_funcion;
    }

    /**
     * método calcular de tipo double
     * @param valor_inicial atributo de tipo double
     * @param tolerancia atributo de tipo double
     * @return 
     */
    public double calcular(double valor_inicial, double tolerancia)
    {
    	Derivador df = new Derivador(f);
    	double error = 50; // para poder reducir hasta la tolerancia
    	while(error>tolerancia){
    		valor_inicial = (valor_inicial - f.Funcion(valor_inicial)) / df.derivar(valor_inicial, tolerancia);
    		error = Math.abs(f.Funcion(valor_inicial));
    	}
        
        
    }
}
