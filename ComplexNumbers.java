/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumbers;
import java.util.Scanner;
public class ComplexNumbers {

    /**
     * @param args the command line arguments
     */
    double real;
            double imaginary;
            
            ComplexNumbers(){}
            ComplexNumbers(double real,double imaginary){
                this.real = real;
                this.imaginary = imaginary;
            }
            public static ComplexNumbers sum(ComplexNumbers a, ComplexNumbers b){
                ComplexNumbers ans = new ComplexNumbers();
                ans.real = a.real + b.real;
                ans.imaginary = a.imaginary + b.imaginary;
                return ans;
            }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            ComplexNumbers num1 = new ComplexNumbers();
            ComplexNumbers num2 = new ComplexNumbers();
            System.out.println("Enter first complex number: \nreal: ");
            num1.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num1.imaginary = sc.nextDouble();
            System.out.println("Enter Second complex number: \nreal: ");
            num2.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num2.imaginary = sc.nextDouble();
            
            ComplexNumbers answer = sum(num1,num2);
            System.out.println("The addition of two complex numbers is : "+answer.real+" + "+answer.imaginary+"i");
            
        }
        
    }
