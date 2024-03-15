/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversi;
import java.lang.Integer;

/**
 *
 * @author Erick
 */
public class conversion {
    public String intToHex(int n){
        
        return Integer.toHexString(n).toUpperCase();
    }
    
    public String intToOct(int n){
        
        return Integer.toOctalString(n);
        
    }
    public String intToBin(int n){
        
        return Integer.toBinaryString(n);
    }
}

