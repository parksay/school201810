import java.util.Scanner;
class  UCTable1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);

/*
//int�� �޾Ƽ� ����� ���� char�� ��ȯ�ؼ� �ش� �κи� char�� ���
	int fcr, scr, c;
	c = 0;
	fcr = sc. nextInt();
	scr = sc. nextInt();
	for ( ; fcr <= scr; fcr = fcr + 1)
	{
		System.out.print(fcr + ": " + (char)fcr + "  |  ");
		c = c + 1;
		if ( c % 5 == 0)
		{
			System.out.print("\n");
		}
	}
//for�� �������� ������� ����.

*/

//�� �ڵ� 
	char a, b, i;
	a = (char) sc. nextInt();
	b = (char) sc. nextInt();
	

	for ( ; a < b; a = (char)(a + 1))
	{
		System.out.println((int)a + " : " + a);
	}

		System.out.println("Hello World!");
	}
}
