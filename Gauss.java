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
    int n;
    public double cte;
    public double [][] A = new double [4][4];
    public double [] B = new double [4];


    public Gauss(int n)
    {
        this.n = n;
    }

    

    public void setA(double[][] Aa)
    {
        double [][] A = Aa;

    }

    public void setB(double[] Bb)
    {
        double [] B = Bb;
    }
    

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

    public double[] getX()
    {
        return B;
    }
    
}
