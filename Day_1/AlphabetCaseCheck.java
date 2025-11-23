 /*Check Vowel or Consonant
Write a Java program that takes a character and checks whether it is a 
vowel or a consonant using if-else.*/

import java.util.Scanner;
public class AlphabetCaseCheck {
    public  static void main (String []args){
        Scanner sc = new Scanner (System.in);

        char ch=sc.next().charAt(0);
        
        if(ch>='A'&& ch<='Z'  ){
        System.out.println("Upper Case:"+ch);
        }
        else if(ch>='a'&& ch<='z'){
            System.out.println("LowerCase: "+ch);
        }
        else {
            System.out.println("not alphabet:"+ch);
        }
    }
}
    

