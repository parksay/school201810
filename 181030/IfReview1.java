import java.util.Scanner;
class IfReview1
{
	public static void main(String[] args) 
	{
//�� ������ �޾Ƽ� �� �� ���� ū �� ����ϱ�
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	a = sc. nextInt();
	b = sc. nextInt();
	c = sc. nextInt();
/*	
	if (a > b)
	{
		if (a > c)
		{
		System.out.println("���� ū����" + a);
		}
		else if (a < c)	
		{
		System.out.println("���� ū ����" + c);
		}
	}
	if ( a < b)
	{
		if (b > c)
		{
		System.out.println("���� ū����" + b);
		}
		else if (b < c)	
		{
		System.out.println("���� ū ����" + c);
		}
	}
�̰Ŵ�, �̺й�. �켱 �� ���� �̾Ƽ� ���� ����, ���� ���� ������ ū ���� ������ �ͼ�
���� ������ ���� ������ �� ���� �Ʊ� ���ߴ� ū ���� �ٽ� ��. �� 4���� ���.
*/

/*
	int d;
	d = a > b ? a : b ;
	if ( c > d)
	{
	System.out.println( "���� ū ���� " + c);
	}
	else if (c < d)
	{
	System.out.println( "���� ū ���� " + d);
	}

���� �ϳ� �� �غ��ؼ�, �� �� ū ���� �ű�� �ְ� ����,
Ŭ ��, ���� �� �� ��츸 �����ϸ� ��.
������� �߿��ϳ�. �� �ϳ� ����ٰ� �װŸ� ������ ��� �غ����� �ϸ�,
�þ߰� ������. ����� ����? ���� ������.
*/

	int d;
	d = a;
	if ( d < b);
	{
	d = b;
	}
	if ( d < c);
	{
	d = c;
	}
	System.out.println("���� ū ���� " + d);
	
/*
���ο� ���� �ϳ� �����ϰ�, if�� ���ؼ� �� ����� ū ����� ���� ���ϰ�
�� ���� ����� ���� ������, �׷� �۾��� �ݺ�
*/
		System.out.println("Hello World!");
	}
}
