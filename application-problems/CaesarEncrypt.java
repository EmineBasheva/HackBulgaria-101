/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackbg;

/**
 *
 * @author Eminka
 */
public class CaesarEncrypt {

    public CaesarEncrypt() {
    }
    
    String caesar_encrypt(String str,  int n){
        String result = "";
        
        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            int codeOfCurrent = (int)current;
            if(codeOfCurrent > 64 && codeOfCurrent < 91){
                int ready = (int)((codeOfCurrent + n - 65) % 26) + 65;
                
                result = result + (char)(ready);
            } else if(codeOfCurrent > 96 && codeOfCurrent < 123){
                int ready = (int)((codeOfCurrent + n - 97) % 26) + 97;
                
                result = result + (char)(ready);
            } else {
                result = result + current;
            }
        }
        
        return result;
    }
}
