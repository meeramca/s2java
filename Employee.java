/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

public class Employee {
    int employee_id;
    String employee_name;
    int salary;
    Employee(int a, String b,int c)
    {
        employee_id = a;
        employee_name = b;
        salary = c;
    }
    public void tot_salary(){
        int tot_salary = salary+(salary*20/100);
        System.out.println("total salary with DA 20% is " +tot_salary );
    }
    public static void main(String[] args) {
        Employee e = new Employee(101, "joy", 3000);
        e.tot_salary();
        
    }
    
}
