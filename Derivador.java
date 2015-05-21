/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author honoratosh
 */
public class Derivador 
{
  private Funcion f;
  
  public Derivador(Funcion la_funcion)
  {
  	f = la_funcion;
  }
  
  public double derivar(double x, double delta_x)
  {
  	// \frac {f(x_0+h) - f(x_0-h)} {h^2} 
  	double fxh = f.Funcion(x + delta_x);
  	double fxhh = f.Funcion(x - delta_x);
  	double h2 = (delta_x*2);

    return (fxh - fxhh)/h2 ;
  }
  
}