package list1;

import java.util.Scanner;

public class Problem5 {
	/*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
imprima: "número não válido".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10 || (a+b==20)) {
			System.out.println("número válido");
		}
		if(a<=10 &&(a+b!=20)) {
			System.out.println("número não válido");
		}
		input.close();
	}

}
