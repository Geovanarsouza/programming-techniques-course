package list1;

import java.util.Scanner;

public class Problem6 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
20”.*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10) {
			System.out.println("A > 10");
		}
		else {
			System.out.println("A <= 10");
		}
		if(a+b==20) {
			System.out.println("A + B = 20");
		}
		else {
			System.out.println("A + B != 20");
		}
		input.close();
	}

}
