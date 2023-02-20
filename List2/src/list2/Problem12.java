package list2;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("NUMBER:");
		int number=input.nextInt();
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------------------------------");
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
			{
				if(i==j || (i+j+1==number))
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
			}
		System.out.println("-----------------------------------------------");

		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
			{
				if(i%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
			}
		System.out.println("-----------------------------------------------");

		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
			{
				if(i==0 || i+1==number || j==0 ||j+1==number)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("\n");
			}
		System.out.println("-----------------------------------------------");

		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
			{
				if(j%2==0 && i>=number/2)
				{
					System.out.print("#");
				}
				if(j%2==1 && i>=number/2)
				{
					System.out.print("$");
				}
				if(i<number/2)
				{
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}		
	}

}
