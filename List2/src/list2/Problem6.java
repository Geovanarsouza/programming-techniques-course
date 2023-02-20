package list2;

public class Problem6 {
	/*Imprima a saída:
0 - 33
1 - 32
2 - 31
...
99 - -66*/

	public static void main(String[] args) {
		for(int i=0,j=33;i<100;i++,j--) {
			System.out.print(i+" - "+j+"\n");
		}
	}

}
