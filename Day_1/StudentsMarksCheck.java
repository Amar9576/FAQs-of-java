/*Student Pass/Fail System
Write a program to store marks in 5 different subjects by taking 5 different variables.
Calculate the average marks scored.If the average is >= 40 then print "Pass", 
else "Fail".*/

public class StudentsMarksCheck {
    public static void main (String []args){
        int M1=2;
        int  M2=5;
        int M3=6;
        int  M4=20;
        int  M5=6;

        int Average=M1+M2+M3+M4+M5/5;

        if (Average>=40){
            System.out.println("Average is :"+Average +" & pass");
        
        }
        else {
            System.out.println("Average is :"+Average +" & Fail");
        }




    }
    
}
