/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author 140083
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    thr t;
    for(int j=0 ;j<100;j++){
         t=new thr();
         t.start();
         t.join();
    }
    
        thr.pr();
     }
    
    
       
    }
    

