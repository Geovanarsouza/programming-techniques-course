package list2;

public class Problem9 {
	/*Imprima a saída:
0 - 33
2 - 36
4 - 39
...
26 - 72*/
	public static void main(String[] args) {
		for(int i=0,j=33;i<27;i=i+2,j=j+3) {
			System.out.print(i+" - "+j+"\n");
		}
	}

}
