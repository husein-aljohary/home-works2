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
public class thr extends Thread{
    
    static int s=0;
     public static void pr(){
          System.out.println("the answer is: "+s);
        }

     public static synchronized int sum(){
            for(int j=1;j<=50;j++){
                     s+=j;
                }
                     return s;
             }

     @Override
     
      public void run(){
          sum();
         }
    
    }
