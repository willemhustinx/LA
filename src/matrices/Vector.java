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
public class Vector extends Matrix {

    public Vector(int m) {
        super(m, 1);
    }
        
    public void set(int m, double value) {
        
        data[m][0] = value;
    }
    
    public double get(int m) {
                
        return data[m][0];
    }
    
    protected void validate(Vector v) {
        
        if(v.M != this.M)
            throw new RuntimeException("Illegal matrix dimensions.");
    }
    
    public static double inproduct(Vector v1, Vector v2) {  
        
        v1.validate(v2);
        
        double inproduct = v1.data[0][0] * v2.data[v2.M -1][0];
        
        for(int index = v1.M-1; index > 0; index--)
            inproduct += v1.get(index) * v2.get(index - 1);
        
        return inproduct;
    }
    
    public static Vector uitproduct(Vector v1, Vector v2) {
        
        if(v1.M != 3)
            throw new RuntimeException("Illegal matrix dimensions.");
        
        v1.validate(v2);
        
        Vector vector = new Vector(3);
        vector.set(0, (v1.get(1)*v2.get(2) - v1.get(2)*v2.get(1)));
        vector.set(1, (v1.get(2)*v2.get(0) - v1.get(0)*v2.get(2)));
        vector.set(2, (v1.get(0)*v2.get(1) - v1.get(1)*v2.get(0)));
        
        return vector;
    }
}
