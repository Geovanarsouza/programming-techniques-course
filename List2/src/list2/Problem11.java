package list2;

public class Problem11 {
	/*11)Faça um programa que possa gerar uma segûencia como a seguinte.
0 - 0  0 - 1  0 - 0  0 - 1  0 - 2  1 - 0  1 - 1  1 - 0  1 - 1
1 - 2  2 - 0  2 - 1  2 - 0  2 - 1  2 - 2  3 - 0  3 - 1  3 - 0
3 - 1  3 - 2*/

	public static void main(String[] args) {
		for(int k=0;k<4;k++)
		{
			for(int i=1;i<3;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.println(k+" - "+j);
				}
			}
		}	
	}

}
