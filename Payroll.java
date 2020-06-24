public class Payroll 
{

   public double Salary;
   public double bonus;
  public String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */

   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
      
     public double getSalary(){
         return Salary;
     }
     
     public void setSalary( double Salary){
        
          this.Salary = Salary;
     }
     
    
    public double getBonus(){
         if (Salary >=3000){
             bonus = Salary*0.10;
         } else {
             bonus = Salary*0.05;
         }
         return bonus;
         
     }
     
     public void setBonus( double bonus){
        this.bonus = bonus;
     }
    
}
