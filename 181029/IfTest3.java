import java.util.Scanner;
class IfTest3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int y = sc. nextInt();
		
		if (y % 400 ==0)
		{
			System.out.println("����");
		}
		else if ( y % 4 != 0)
		{
			System.out.println("���");
		}
		else if ( y % 4 == 0)
		{
			if (y % 100 == 0)
				System.out.println("���");
			else
				System.out.println("����");
		}

/* �������� ������. �켱 ���� ū �Ը𿡼� ������ ��, A or B �� �� ���� ���� �����ٸ�,
������ �������� ���� �� �ִ°�?
�� ���� B����, �ٽ� ����ȭ �Ѵٸ� ������ �������� ���� �� �ִ°�?
B1 or B2�� �����ٸ�?
�״ϱ�, ��� �����, ū �Ը𿡼����� ���� �Ը�� �����ϵ�,
���� �Ը�κ��� ū �Ը�� �����ϵ�, �� �� �ִ� �� �켱
�̺й��� �ɼ��ϰ� ����ϱ�.
*/
		System.out.println("Hello World!");
	}
}
