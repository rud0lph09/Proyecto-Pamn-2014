/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author honoratosh
 */
public class Gauss 
{
    /**
	 * atributo de tipo entero para n y double para cte y matrices de tipo double
	 */
    int n;
    public double cte;
    public double [][] A = new double [4][4];
    public double [] B = new double [4];

     /**
     * método que asigna valor a atributo n
     * @param n atributo de tipo entero
     */
    public Gauss(int n)
    {
        this.n = n;
    }

    /**
     * método
     * @param Aa Se asigna la matriz A a Aa
     */
    public void setA(double[][] Aa)
    {
        double [][] A = Aa;

    }
    
     /**
     * método
     * @param Bb Se asigna la matriz B a Ba
     */
    public void setB(double[] Bb)
    {
        double [] B = Bb;
    }
    
     /**
     * Se realizan ciclos
     */
    public void ciclos(){

        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                cte = A[j][i] / A[i][i];

                for (int k = i; k < n; ++k)
                {
                    A[j][k] = A[j][k] - cte * A[i][k];
                }

            B[j] = B[j] - cte * B[i];
            }

        }
    }
    
    /**
     * método 
     * @return devuelve valor de atributo B
     */
    public double[] getX()
    {
        return B;
    }
    
}
