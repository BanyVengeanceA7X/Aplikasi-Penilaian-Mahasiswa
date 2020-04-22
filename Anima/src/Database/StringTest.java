/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.Scanner;

public class StringTest { 
    public static void main (String args []){ 
        String str = "Mempelajari String itu penting"; 
        Scanner A = new Scanner(System.in);
        
        //Memeriksa apakah String mengandung digit angka atau tidak 
        
        String B = A.next();
        
        if(B.matches(".*[1-9].*")){
            System.out.println("angka");
        }else{
            System.out.println("Bukan agnak");
        }
    } 
}//String nama = input_namamhs1.getText();
//        String NIM = input_nim2.getText();
//        if(ps.validasiData()&& !nama.matches(".*[1-9].*") && !NIM.matches(".*[A-Za-z].*")){