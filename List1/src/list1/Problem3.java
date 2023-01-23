package list1;

import java.util.Scanner;

public class Problem3 {
	/*Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
impressões são permitidas na saída do programa).*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("A: ");
		int a=input.nextInt();
		System.out.println("B: ");
		int b=input.nextInt();
		if(a==10) {
			System.out.println("a = 10");
		}
		if(a+b==20) {
			System.out.println("A + B = 20");
		}
		if(b==10) {
			System.out.println("B = 10");
		}
		input.close();
	}

}
