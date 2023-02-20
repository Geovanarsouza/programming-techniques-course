package list2;

public class Problem8 {
	/*Imprima a saída:
0 - 100
1 - 99
2 - 98
...
49 - 51*/
	public static void main(String[] args) {
		for(int i=0,j=100;i<50;i++,j--) {
			System.out.print(i+" - "+j+"\n");
		}
	}

}
