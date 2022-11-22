/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 140083
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        robot r=new robot(new configuration1());
        System.out.println("configuration 1 : "+r);
        
        r=new robot(new configuration2());
        System.out.println("configuration 2 : "+r);
        
    }
    
}
