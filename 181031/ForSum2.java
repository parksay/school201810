import java.util.Scanner;
class ForSum2
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a, i, s, n;
	i = 1;
	s = 0;
/*
5���� ������ �޾Ƽ� �հ踦 ��������,
������ ��꿡 �������� �����鼭,
����Ƶ� ����, ���� 5���� ��� �޾� ����.
*/

/*
	for ( ; i <= 5; i = i + 1)
	{
		System.out.print(i + "�� ° ���� �Է� : " );
		n = sc. nextInt();
		if(n < 0)
		{
			i = i - 1;
			n = 0;
		}
		s = s + n;
	}	
*/

	for ( ; i <= 5;)
	{
		System.out.print(i + "�� ° ���� �Է� : " );
		n = sc. nextInt();

		if(n < 0)
		{
			continue;
		}
		i = i + 1;
		s = s + n;
	}	
/*
�������� �������, for ������ ���๮ ������ �־ ��.
���ǹ��� ������ �� ����Ǵ� ���� �ȿ� ������ ����, ������ �ڸ��� ��� ���� ��.
�׷� ��쿣, for ���� ���� �߿� Ư�� ������ ������ ���� Ƚ���� �����ϰ�
Ư�� ������ ���� Ƚ���� ���������� �ʴ�(Ƚ���� ���������� �ʴ�) �ڵ��� ¥�Ⱑ ����
*/
	System.out.println("�Է°����� �� ���� : " + s);
	System.out.println("Hello World!");
	}
}
