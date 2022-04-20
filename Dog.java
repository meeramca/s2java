
package dog;
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}
public class Dog  extends Animal{
    public void display() {
    System.out.println("My name is " + name);
  }
    public static void main(String[] args) {
       Dog labrador = new Dog();
       labrador.name = "Rohu";
       labrador.display();
       labrador.eat();
    }
    
}
