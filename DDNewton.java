/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodolfo Castillo Vidrio, Carlos Monzalvo Navarro, Hernández Domínguez Diego, Rojas Flores Fernando
 */
public class DDNewton 
{
  /**
   * atributo de tipo entero para n 
   */
  int n;
  double [] X = new double[4];
  double [] Y = new double[4];
    
  /**
   * método que asigna valor a atributo n
   * @param N atributo de tipo entero
   */
  public DDNewton(int N)
  {
    this.n = N; 
  }
  
   /**
   * método que asigna valor a atributo X y Y
   * @param X atributo de tipo double
   * @param Y atributo de tipo double
   */
  public void setXY(double[] X, double[] Y)
  {
    this.X = X;
    this.Y = Y;
  }    


  /**
   * método
   * @return devuelve polinomio de tipo double 
   */
  public double[] getPolinomio()
  {

    // for (int i = 0; i = n - 1; i++){
    //   for (int j = 0; i = n - 1; j++){
    //     X[j][i+1] = (X([j+1][i] - X[j][i]);
    //   }
    // }

    double[] polinomio = {0.0, 0.0};
    return polinomio;
  }

}
