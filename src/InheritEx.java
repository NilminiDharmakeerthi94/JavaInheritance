/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilmini
 */
 class Example{
     int z;
   public void Calculate(int x, int y){ 
       z=x+y;
       System.out.println("Value= " +z);
}}
public class InheritEx extends Example{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=4;
        int b=6;
        InheritEx e=new InheritEx();
        e.Calculate(a,b);
        
        // TODO code application logic here
    }
    
}
 