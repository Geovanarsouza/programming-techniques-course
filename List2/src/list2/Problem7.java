package list2;

public class Problem7 {
	/*Imprima a saída:
0 - 0
1 - 3
2 - 6
...
100 - 300*/
	public static void main(String[] args) {
		for(int i=0,j=0;i<=100;i++,j=j+3) {
			System.out.print(i+" - "+j+"\n");
		}
	}

}
