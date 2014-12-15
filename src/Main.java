
import matrices.Matrix;
import matrices.Matrix3D;
import matrices.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mathijs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        double[][] data = {
//            {1, 0, 0, 0},
//            {0, 1, 0, 0},
//            {0, 0, 1, 0}, 
//            {0, 0, 0, 1}
//        };
//        
//        Matrix matrix = new Matrix(data);
//        
//        // schalen matrix3d
//        Matrix scale = Matrix3D.scale(0, 5, 5);
//        Matrix scale_result = matrix.multiply(scale);
//        scale_result.show();
//        
//        // translatie matrix3d
//        Matrix translation = Matrix3D.translate(0, 5, 5);
//        Matrix translation_result = matrix.multiply(translation);
//        translation_result.show();
//        
//        // rotatie matrix3d
//        Matrix rotation = Matrix3D.rotate(30, 5, 5, 5);
//        Matrix rotation_result = rotation.multiply(matrix);
//        rotation_result.show();
        
        Vector v1 = new Vector(3);
        v1.set(0, 1);        
        v1.set(1, -1);
        v1.set(2, 0);
        
        Vector v2 = new Vector(3);
        v2.set(0, 1);        
        v2.set(1, 1);
        v2.set(2, 0);
        
        System.out.println(Vector.inproduct(v1, v2));
        Vector.uitproduct(v1, v2).show();
    }    
}
