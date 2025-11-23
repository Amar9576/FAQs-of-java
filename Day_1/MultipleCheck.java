import java.util.Scanner;

public class MultipleCheck {
    public  static void main (String []args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if (num%4==0){
            System.out.println("its divisible by 4:  "+num);
        }
        if(num%8==0){
            System.out.println("it is divisible by 8: "+num);
        }
        else {
            System.out.println("not divisible by 4 & 8");
        }




    }
    
    
}
