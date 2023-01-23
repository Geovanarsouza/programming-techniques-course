package list1;

import java.util.Scanner;

public class Problem11 {
	/*Verifique se A é maior que 10 se não for verifique se A mais B é igual a
20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
for diferente de 20, imprima: "número não válido".*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a<=10) {
			if(a+b==20) {
				System.out.println("A + B = 20");
			}
			else {
				System.out.println("número não válido");
			}
		}
		input.close();

	}

}
