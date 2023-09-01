class Employee{  
 float salary=40000;  
}  
class Test extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Test t=new Test();  
   System.out.println("Programmer salary is:"+t.salary);  
   System.out.println("Bonus of Programmer is:"+t.bonus);  
}  
}  
