/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rodolfo Castillo Vidrio, Carlos Monzalvo Navarro, Hernández Domínguez Diego, Rojas Flores Fernando
 */
public class Derivador 
{
  private Funcion f;
  
  /**
   * método
   * @param la_funcion
   */
  public Derivador(Funcion la_funcion)
  {
  	f = la_funcion;
  }
  
   /**
   * método que obtiene el resultado de derivar
   * @param x atributo de tipo double
   * @param delta_x atributo de tipo double
   * @return devuelve el resultado de la función
   */
  public double derivar(double x, double delta_x)
  {
  	// \frac {f(x_0+h) - f(x_0-h)} {h^2} 
  	double fxh = f.Funcion(x + delta_x);
  	double fxhh = f.Funcion(x - delta_x);
  	double h2 = (delta_x*2);

    return (fxh - fxhh)/h2 ;
  }
  
}
