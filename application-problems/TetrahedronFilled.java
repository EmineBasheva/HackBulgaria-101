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
public class TetrahedronFilled {

    public TetrahedronFilled() {
    }
    
    public int tetrahedron_filled(int[] tetrahedrons, int water){
        double waterL = water;
        Arrays.sort(tetrahedrons);
        FillTetrahedron fillT = new FillTetrahedron();
        int countTet = 0;
        
        int i = 0;
        while(i < tetrahedrons.length &&
                fillT.fill_tetrahedron(tetrahedrons[i]) < waterL){
            waterL = waterL - fillT.fill_tetrahedron(tetrahedrons[i]);
            countTet++;
            i++;
        }
        
        return countTet;
    }
}
