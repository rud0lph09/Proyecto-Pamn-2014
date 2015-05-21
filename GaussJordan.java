/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author honoratosh
 */
public class GaussJordan extends Gauss 
{
    /**
     * método 
     * @param n atributo de tipo entero
     */	
    public GaussJordan(int n)
    {
        super(n);
    }
    
    /**
     * método de ciclos
     */
    public void cicloJordan(){

    	//Cilco que normaliza el renglon pivote
		for (int i = 0; i < 3; i++) {
			cte = A[i][i];
				for (int j = 1; j < 3; j++) {
					A[i][j] = A[i][j]/cte;
					}
						B[i] = B[i]/cte;
		// Ciclo de eliminacion gaussiana

		super.ciclos();
	}

		//Eliminacion inversa
		for (int i = 2; i<1; i++) {
			for (int j = (i-1); j <= 1; j++) {
				cte = A[j][i];
				A[j][i] = A[j][i] - cte*A[i][i];
				B[j] = B[j] - cte * B[i];
			}

    }
}
}
