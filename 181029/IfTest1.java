import java.util.Scanner;
class IfTest1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int score = sc. nextInt();
		
/*
��������, '�տ� ������ ������� �켱����'�� �����ؼ� �ڵ�

		if (score > 100 || score < 0)
		{
			System.out.println("0~100�� �ش��ϴ� ������ �Է����ּ���.");
		}
		
		if (score <= 100 && score >= 70 )
		{
			System.out.println("���");
		}
		
		if (score >= 0 && score < 70)
		{
			System.out.println("�����");
		}
*/

/*
�̺й����� �����, �� �� Ư���� ��츦 �ٽ� ����ȭ �ؼ� �̺й����� ������,
�� ���� �ݺ��ϱ�. - Ư�� ��찡 ����ȭ�� ���, �ش� ��ȣ ������ ���Խ�Ű��
*/
		if (score > 100 || score < 0)
		{
			System.out.println("0~100 ���ּ���");
		}
		else
		{if (score >= 70)
			{ 
				System.out.println("���");
			}
		 else if (score < 70)
			{
				System.out.println("�����");
			}
		}
		
		System.out.println("Hello World!");
	}
}
