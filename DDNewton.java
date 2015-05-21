/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author honoratosh
 */
public class DDNewton 
{
  int n;
  double [] X = new double[4];
  double [] Y = new double[4];
    
  public DDNewton(int N)
  {
    this.n = N; 
  }
  
  public void setXY(double[] X, double[] Y)
  {
    this.X = X;
    this.Y = Y;
  }    

  public double[] getPolinomio()
  {
    double[] polinomio = {0.0, 0.0};
    return polinomio;
  }

}
