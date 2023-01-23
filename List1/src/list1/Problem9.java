package list1;

import java.util.Scanner;

public class Problem9 {
	/*Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
verdadeiras imprima: "número não válido".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10 && (a+b==20)) {
			System.out.println("A + B = 20");
		}
		else {
			System.out.println("número não válido");
		}
		input.close();
	}

}
