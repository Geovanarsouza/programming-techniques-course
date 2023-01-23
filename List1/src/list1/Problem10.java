package list1;

import java.util.Scanner;

public class Problem10 {
	/*Verifique se A é maior que 10 se não for imprima: "número menor que
10". Verifique se A mais B é igual a 20 se não for verdade imprima
"número diferente de 20".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a<10) {
			System.out.println("número menor que 10");
		}
		if(a+b!=20) {
			System.out.println("número diferente de 20");
		}
		input.close();
	}

}
