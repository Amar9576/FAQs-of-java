/*  Check Vowel or Consonant
Write a Java program that takes a character and checks whether it is a 
vowel or a consonant using if-else.*/


import java.util.Scanner ;
public class VowelOrConsonant {
    public  static void main (String []args){
        Scanner sc= new Scanner (System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='b'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("it is vowel");
        }
        else {
            System.out.println("it is consonant");
        }
    
    }
}
