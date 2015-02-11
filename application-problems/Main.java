/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackbg;

import java.util.Arrays;

/**
 *
 * @author Eminka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // test FillTetrahedron
        FillTetrahedron ft = new FillTetrahedron();
        double result1 = ft.fill_tetrahedron(100);
        System.out.println(result1);
        
        // test TetrahedronFilled
        int[] tetrahedrons = {100, 20, 30};
        int[] tetr = {50, 70, 10, 100};
        TetrahedronFilled tFilled = new TetrahedronFilled();
        int result2 = tFilled.tetrahedron_filled(tetrahedrons, 10);
        System.out.println(result2);
        System.out.println(tFilled.tetrahedron_filled(tetr, 60));
        
        // test CaesarEncrypt
        CaesarEncrypt ce = new CaesarEncrypt();
        System.out.println(ce.caesar_encrypt("abc", 1));
        System.out.println(ce.caesar_encrypt("ABC", 1));
        System.out.println(ce.caesar_encrypt("abc", 2));
        System.out.println(ce.caesar_encrypt("aaa", 7));
        System.out.println(ce.caesar_encrypt("xyz", 1));
        System.out.println(ce.caesar_encrypt("XYZ", 1));                
    }
    
}
