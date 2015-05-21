/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rodolfo Castillo Vidrio, Carlos Monzalvo Navarro, Hernández Domínguez Diego, Rojas Flores Fernando
 */
public class EquisCuadradaMasUno implements Funcion
{
    
    @Override
    /**
     * método que obtiene el resultado de Funcion
     * @param x atributo de tipo double
     * @return devuelve el resultado de la función
     */
    public double Funcion(double x){
        return x*x + 1;
    }
    
}
