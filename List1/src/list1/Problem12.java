package list1;

import java.util.Scanner;

public class Problem12 {
	/*Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
verdadeiras, imprima: "números não válidos". Sejam as afirmações
anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
disciplina de Técnicas de Programação”.*/

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
			System.out.println("número não válidos");
		}
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de programação");
		input.close();

	}

}
