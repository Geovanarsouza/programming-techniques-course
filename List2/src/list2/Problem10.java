package list2;

import java.util.Scanner;

public class Problem10 {
	/*Faça um programa que possa exibir uma sequência como a abaixo,
sendo o teto dos pares da esquerda e direita informados pelo usuário.
Exemplo: com pares da esquerda e direta com o teto de 2 unidades.
0 - 0
0 - 1
0 - 2
1 - 0*/
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ROOF: ");
		int roof=input.nextInt();
		for(int i=0;i<=roof;i++) {
			for(int j=0;j<=roof;j++) {
				System.out.println(i+" - "+j);
			}
		}
		input.close();
	}

}
