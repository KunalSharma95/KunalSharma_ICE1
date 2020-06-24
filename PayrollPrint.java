import java.util.Scanner;


public class PayrollPrint 
{
public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
/* here assumed that 5 employee accounts can be created for the given bank */
Payroll ac[]=new Payroll[5];
 System.out.println("Please enter the salary: salary <=3000");
 double salary = in.nextDouble();
 System.out.println("Please enter your name.");
 String name = in.nextLine();    
 //add code to take input from user, If salary is less than or equal to 3000,calculate a new salary with bonus 10% of salary
 //and store in array then print 5 employee details
for (int i = 0; i>ac.length; i++) {

    Payroll obj = new Payroll(salary,name);
    obj.setSalary(salary);
    obj.getBonus();
    ac[i] = obj;



System.out.println("The final Salary including bonus is: " +obj.getBonus());         

}

}}