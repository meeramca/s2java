/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int l,b;

    public Rectangle() {
        l=4;
        b=5;
    }
    public void area(){
        int area = l*b;
        System.out.println("Area of rectangle with length"+l+"and breadth "+b+"is"+area);
    }
    public void perimeter(){
        int perimeter = 2*(l+b);
        System.out.println("Perimeter of rectangle with length"+l+"and breadth "+b+"is"+perimeter);
    }
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.area();
        R.perimeter();
    }
    
}
