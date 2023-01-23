package list1;

import java.util.Scanner;

public class Problem7 {
	/*Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
	verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
	afirmação não seja verdadeira, imprima: "número não válido".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10 || (a+b==20)) {
			System.out.println("números válidos");
		}
		if(a<=10) {
			System.out.println("números não válidos");
		}
		input.close();
	}

}
