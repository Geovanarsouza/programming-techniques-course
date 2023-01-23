package list1;

import java.util.Scanner;

public class Problem4 {
	/*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"número não válido".*/
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a>10 || (a+b==20)) {
			System.out.println("número válido");
		}
		if(a<=10 && (a+b!=20)) {
			if(a==b) {
				System.out.println("A é igual B; A e B são"
						+ "diferentes de 10; A é menor que 10");
			}
			else {
				System.out.println("número não válido");
			}
		}
		input.close();
	}

}
