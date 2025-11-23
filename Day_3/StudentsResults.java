package Day_3;
import java.util.*;

public class StudentsResults {
    public static void studentsDetails(double averageMarks){
        String results = ((averageMarks >= 40) || (averageMarks >= 75)) ? "pass" : "Excellant";
        System.out.println("Result: " + results);
    }
    public static void main (String []args){
        double averageMarks;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter average marks: ");
        averageMarks = sc.nextDouble();
        studentsDetails(averageMarks);
    }
    
}
