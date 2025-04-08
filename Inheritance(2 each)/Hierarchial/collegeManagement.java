class User {

void welcome(){
System.out.println("Welcome ! What would you like to do today?");
}
}

class Teacher extends User{

void teacher(){
System.out.println("Welcome Teacher");
}
}

class Student extends User{
void student(){
System.out.println("Welcome Student");
}
}

class Employee extends User{
void employee(){
System.out.println("Welcome Employee");
}
}

public class collegeManagement{

public static void main(String[] args){

Teacher teach = new Teacher();
Student stud = new Student();
Employee emp = new Employee();

//System.out.println(clr.clerkMessage());
//System.out.println(cus.Student());
//System.out.println(emp.employee());
teach.teacher();
stud.student();
emp.employee();
}}

