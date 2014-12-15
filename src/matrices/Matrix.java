/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author Mathijs
 */
public class Matrix {
    
    int M, N;
    double[][] data;
    
    public Matrix(double[][] data) {
        
        this.M = data.length;
        this.N = data[0].length;
        this.data = data;
    }
    
    protected Matrix(int m, int n) {
        this.M = m;
        this.N = n;
        this.data = new double[m][n];
    }
    
    protected void validate(Matrix matrix) {
        
        if(this.N != matrix.M)
            throw new RuntimeException("Illegal matrix dimensions.");
    }
    
    public Matrix multiply(Matrix matrix) {
        
        validate(matrix);
        
        double[][] new_data = new double[this.M][matrix.N];
        
        for(int current_m  = 0; current_m < this.M; current_m++) {
            
            for(int current_n = 0; current_n < matrix.N; current_n++) {
                
                for(int index = 0; index < matrix.M; index++) {
                    new_data[current_m][current_n] += (
                        this.data[current_m][index] * matrix.data[index][current_n]
                    );
                }
            }            
        }
        
        return new Matrix(new_data);
    }
    
    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) 
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
    }
    
    // returns a scaling matrix
    public static Matrix scale(double velocity) {
        
        double upscale = 1 + (velocity / 200);
        double downscale = 1 - (velocity / 400);
        
        double[][] scale_data = {
            {upscale, 0, 0},
            {0, downscale, 0},
            {0, 0, 1}              
        };
        
        return new Matrix(scale_data);
    }    
}
