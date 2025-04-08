class area{

    int l , b;
    int area(int l,int b){
    return l*b;
    }
    }
    
    class rectangle extends area{
    
    public rectangle(int l , int b){
    this.l = l;
    this.b= b;
    }
}
    
    public class areaCal{

    public static void main(String[] args){
        rectangle rect = new rectangle(5,4);
        System.out.println(rect.area(10,23));
    }
}

