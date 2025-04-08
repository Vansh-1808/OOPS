class User {

void welcome(){
System.out.println("Welcome ! What would you like to do today?");
}
}

class Clerk extends User{

void clerkMessage(){
System.out.println("Welcome registrar");
}
}

class Customer extends User{
void customer(){
System.out.println("Welcome Sir/Madam");
}
}

class Employee extends User{
void employee(){
System.out.println("Welcome Employee");
}
}

public class bankSys{

public static void main(String[] args){

Clerk clr = new Clerk();
Customer cus = new Customer();
Employee emp = new Employee();

//System.out.println(clr.clerkMessage());
//System.out.println(cus.customer());
//System.out.println(emp.employee());
clr.clerkMessage();
cus.customer();
emp.employee();
}}

