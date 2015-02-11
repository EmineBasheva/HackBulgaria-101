/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackbg;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Eminka
 */
public class FillTetrahedron {
    
    public FillTetrahedron() {
    }
    
    public double fill_tetrahedron(int num){
        double v = 1. / 12 * sqrt(2) * pow(num, 3);
        double l = v / 1000;
        return l;
    }
    
}
