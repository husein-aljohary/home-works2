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
public class circle extends picture{

    public circle(String name) {
        super(name);
    }
    
public String draw(){
return "{"+this.getpic()+"}";
}

    
}
