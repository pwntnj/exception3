/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class LAB3 {
    public static void main(String[] args) {
        try{
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch(ArithmeticException e){
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
