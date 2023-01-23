package list1;

import java.util.Scanner;

public class Problem13 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
Caso as afirmações não sejam verdadeiras, imprima: "números não
válidos".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10) {
			System.out.println("A > 10");
		}
		if(a+b==20) {
			System.out.println("A + B = 20");
		}
		if(a<=10 && (a+b!=20)) {
			System.out.println("números não válidos");
		}
		input.close();
	}

}
