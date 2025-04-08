import java.util.*;

class user{
    String name ,email;
    user(String name ,String email){
        this.name=name;
        this.email= email;
       
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}

class student extends user{
    String usertype="Student";
    
    student(String name,String email,String usertype){
        super(name,email);
        this.usertype=usertype;
    }

    void displayInfo(){
        System.out.println(usertype);
    }

    }

    class professor extends user{
        String usertype="Proffessor";
        
        professor(String name,String email,String usertype){
            super(name,email);
            this.usertype=usertype;
        }
    
        void displayInfo(){
            super.displayInfo();
            System.out.println(usertype);
        }
    
        }

public class collegeManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email= sc.nextLine();
        String usertype=sc.nextLine();
        professor user = new professor(name ,email,usertype);
        if (usertype == "Student"){
            user.displayInfo();
        }else {
            user.displayInfo();
        }
        
    }
}