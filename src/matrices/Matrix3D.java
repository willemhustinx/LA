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
public class Matrix3D extends Matrix {

    public Matrix3D(double[][] data) {
        super(data);
    }
    
    public static Matrix scale(double x, double y, double z) {
        
        double[][] scaling_data = {
            {x, 0, 0, 0},
            {0, y, 0, 0},
            {0, 0, z, 0},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(scaling_data);
                
        System.out.println("Matrix3D scale: ");
        matrix.show();
        
        return matrix;
    }
    
    public static Matrix translate(double x, double y, double z) {
        
        double[][] translation_data = {
            {1, 0, 0, x},
            {0, 1, 0, y},
            {0, 0, 1, z},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(translation_data);
        
        System.out.println("Matrix3D translate: ");
        matrix.show();
        
        return matrix;
    }
    
    protected static Matrix RotateOverX(double alpha) {
        
        double[][] xRotation_data = {
            {1, 0, 0, 0},
            {0, Math.cos(alpha), -Math.sin(alpha), 0},
            {0, Math.sin(alpha), Math.cos(alpha), 0},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(xRotation_data);
        matrix.show();
        
        return matrix;
    }
    
    protected static Matrix RotateOverY(double alpha) {
        
        double[][] yRotation_data = {
            {Math.cos(alpha), 0, Math.sin(alpha), 0},
            {0, 1, 0, 0},
            {-Math.sin(alpha), 0 , Math.cos(alpha), 0},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(yRotation_data);
        matrix.show();
        
        return matrix;
    }
    
    protected static Matrix RotateOverZ(double alpha) {
        
        double[][] zRotation_data = {
            {Math.cos(alpha), -Math.sin(alpha), 0, 0},
            {Math.sin(alpha), Math.cos(alpha), 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(zRotation_data);
        matrix.show();
        
        return matrix;
    }
    
    public static Matrix rotate(double alpha, double x, double y, double z) {
        
        double[][] data = {
            {x, 0, 0, 0},
            {0, y, 0, 0},
            {0, 0, z, 0},
            {0, 0, 0, 1}
        };
        
        Matrix matrix = new Matrix(data);
        
        matrix = matrix.multiply(RotateOverX(alpha));
        System.out.println("Matrix3D rotate x: ");
        matrix.show();
        
        matrix = matrix.multiply(RotateOverY(alpha));
        System.out.println("Matrix3D rotate y: ");        
        matrix.show();
        
        matrix = matrix.multiply(RotateOverZ(alpha));
        System.out.println("Matrix3D rotate z: ");
        matrix.show();
        
        System.out.println("Matrix3D rotate: ");
        matrix.show();
        
        return matrix;
    }
    
    public static Matrix rotate(double alpha,
        double x, double y, double z,
        double mx, double my, double mz) {
        
        Matrix matrix = rotate(alpha, x, y, z);
        
        matrix = matrix.multiply(translate(x, y, z));
        
        return matrix;
    }
}
