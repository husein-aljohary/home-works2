/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 140083
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        picture pic2=new compositepicture("pic2");
        picture pic1=new compositepicture("pic1");
        circle circle1=new circle("circle1");
        circle circle2=new circle("circle2");
        rectangle rectangle1=new rectangle("rectangle1");
        //pic1.draw();
       // pic1.draw();
       // pic2.draw();
       // pic2.draw();
        
        System.out.println("Draw "+pic2.getpic()+" draw ["+rectangle1.getpic()+"]"+"[draw "+pic1.getpic()+"[draw "+circle1.getpic()+"]"+" [draw "+circle2.getpic()+"]"+"]");
        
        
        
    }
    
}
