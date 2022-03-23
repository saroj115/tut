package tut;

import java.util.Scanner;

public class CalcIntDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner( System.in);
System.out.println("enter number");
int num = sc.nextInt();
System.out.println(" your integer value is" +num);
int length =0;
while(num!=0) {
	num = num/10;
	length = length+1;
	
}
System.out.println("The length of the provided integer is" +length);

	}

}

