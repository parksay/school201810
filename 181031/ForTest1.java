import java.util.Scanner;
class ForTest1  
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int i, n, s;
	i = 1;
	for ( ; i <= 6; i = i + 1)
	{
		System.out.print("����" + i + "�� ° �Է� : ");
		n = nextInt();
		s = s + n;
	}
	System.out.println("�հ��" + s);
/* 
��� �����, n1, n2, n3.... ��� ���ؼ� �� ���Ѵ�!
�̷� �Ϳ��� �ͼ����� �ִµ�, �츮�� for ���� �� ����
�� ȸ���� �ݺ��ϴ� ���·δ� ��� ��Ÿ�� �� ������
�ϴ� ������� ������ ���� ��.
*/
		System.out.println("Hello World!");
	}
}
