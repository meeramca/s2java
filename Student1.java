/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

/**
 *
 * @author sjcet
 */
public class Student1 {
    int m1,m2,m3,a,b,c;
    Student1(int a, int b,int c){
        m1 = a;
        m2 = b;
        m3 = c;
    }
    public void sum(){
        int sum = m1+m2+m3;
        System.out.println("sum of "+m1+","+m2+","+m3+" is"+sum);
    }
    public void percentage(){
        int percentage=(m1+m2+m3*100)/300;
        System.out.println("percentage is "+percentage);
    }
    public static void main(String[] args) {
        Student1 s1= new Student1(10, 20, 30);
        Student1 s2 = new Student1(30, 20, 12);
        s1.sum();
        s1.percentage();
        s2.sum();
        s2.percentage();
    }
    
}
