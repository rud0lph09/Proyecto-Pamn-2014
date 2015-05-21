/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

/**
 *
 * @author Rodolfo Castillo Vidrio, Pedro Carlos Monzalvo Navarro, Hernández Domínguez Diego, Rojas Flores Fernando
 */
public class ProyectoFinal {

    public static void main(String[] args) 
    {
         /**
         * matriz A y arreglos B,X1,X2 de tipo double y atributo de tipo double para resultado
         */
        double [][] A = {{2,2,2,2},{2,2,2,2},{2,2,2,2},{2,2,2,2}};    //Matriz de 4 x 4
        double [] B = {2,2,2,2};     //Matriz de 4 x 1
        double [] X1 = {2,2,2,2};       //Matriz de 4 x 1
        double [] X2 = {2,2,2,2};        //Matriz de 4 x 1
        double resultado;
        EquisCuadradaMasUno mi_funcion = new EquisCuadradaMasUno();

        Biseccionador b1 = new Biseccionador(0,20,mi_funcion);
        resultado = b1.calcular(0.001);

        NewtonRaphson nr1 = new NewtonRaphson(mi_funcion);
        resultado = nr1.calcular(0.0, 0.0001);
        
        DDNewton ddn1 = new DDNewton(4);
        ddn1.setXY(B, B);
            
       
        
        Gauss g1 = new Gauss(4);
        g1.setA(A);
        g1.setB(B);
        X1 = g1.getX();
        
        GaussJordan gj = new GaussJordan(4);
        gj.setA(A);
        gj.setB(B);
        X2 = gj.getX();
                        
    }
    
}
