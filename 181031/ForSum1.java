import java.util.Scanner;
class ForSum1  
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int i, n, s;
	i = 1;
	s = 0;
	for ( ; i <= 5; i = i + 1)
	{
		System.out.print("����" + i + "�� ° �Է� : ");
		n = sc. nextInt();
		if (n == 0)
		{
			i = 6;
		}
		if (n < 0)
		{
			n = 0;
		}
/* ������ �Է� ������, �հ� ���� ������ ����.
���� ������ if������ �����ϴ� if������ �ڸ��� ���� �ٲٸ�,
�հ迡�� �����ϱ� ���� n = 0���� �ٲ� ������,
�Ʒ� ������ if ������ ������ �����ع����� ������,
���� �Է� -> ������ �� �Ǿ����.
*/
		s = s + n;
	}
/*
�Է� �޴ٰ� 0 �Է��ϸ� �ݺ����� ��������.
if ���๮ �ȿ� break; �־ ��
*/
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
