package Day_2;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
	
			int count=0;//1
			for(int i=1;i<=n;i++)//j=2 3
			{
				if(n%i==0){
					count++;//2
				}
				
			}
			if(count==2){
				System.out.println("Prime no : "+n);
			}else{
			    System.out.println("not Prime no : "+n);
			}
		}


    
}
