import java.util.Scanner;
class ForTest2 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int x, y, m, n;
	x = sc. nextInt();
	y = sc. nextInt();
	m = x > y ? x : y;
	n = x < y ? x : y;

/*
�ƴϸ�
if (x < y)
{
	z = x;
	x = y;
	y = z;
}
�䷡ �ؼ� �갡 �� ũ�ٸ�, ���� �ڸ� �ٲٴ� �ͱ��� ������ �Ŀ�
���� for���� �����϶�! �䷸��
*/
	for (; n < m; n = n + 1)
	{
	System.out.print(n + " ");
	}
		System.out.println("Hello World!");
	}
}
