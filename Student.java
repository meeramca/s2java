/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {

    int m1,m2,m3,sum;
    Student()
    {
        m1=53;
        m2=63;
        m3=65;
    }
    public void sum(){
        sum = m1 + m2 + m3;
        System.out.println("sum is "+sum);
        
    }
    public void percentage(){
        float percentage = (sum /100)*3;
        System.out.println("percentage is "+percentage);
    }
    public static void main(String[] args) {
        Student a = new Student();
        a.sum();
        a.percentage();
    }
    
}
