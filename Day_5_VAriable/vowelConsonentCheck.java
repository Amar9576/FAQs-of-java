/* Check if a character is a vowel or consonant
Class Name: VowelConsonantCheck
Variables:
    char ch

Sample Input/Output:
    Input: A -> Output: Vowel
    Input: G -> Output: Consonant
 */
package Day_5_VAriable;
import java.util.*;
public class vowelConsonentCheck {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enetr your Value");
        char check=sc.next().charAt(0);
        if((check=='a'||check=='e' ||check=='i' ||check=='o' ||check=='u')){
            System.out.println("Vowel");
        }
        else if (check=='b'|| check=='c'|| check=='d'||check== 'f'|| check=='g'||check== 'h'|| check=='i'|| check=='j'||check== 'k'||check== 'l'||check=='m' ){
            System.out.println("Consonent");
        }
        else {
            System.out.println("invalid input");
        }

    }
}
