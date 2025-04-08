import java.util.*;

class calculateSalary{
int hours,hourSal;

calculateSalary(int hours,int hourSal){
this.hours= hours;
this.hourSal=hourSal;
}
int calcSal(){
return(hours*hourSal);
}
}

public class salaryCalculator{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int hours = sc.nextInt();
int hourSal = sc.nextInt();
calculateSalary calculator = new calculateSalary(200,700);
System.out.println(calculator.calcSal());
}
}


