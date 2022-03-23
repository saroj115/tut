package tut;

import java.util.Scanner;

public class RevNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner (System.in);
System.out.println("Pleae enter the number");

int num = sc.nextInt();
System.out.println("you have entered:"+num);
int rem, rev = 0;
while(num!=0) {
	rem= num%10;
	rev= rev*10+rem;
	num= num/10;
	}
		System.out.println("you have entered:"+ rev);
				
	}
	
		
	}
	


