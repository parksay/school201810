import java.util.Scanner;
class SwitchTest3 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String opr;
	System.out.print("�����ڸ� ������ �ּ��� (+, -, *, /) : ");
	opr = sc. nextLine();
	int x, y;
	System.out.print("ù ��° ������ �Է��� �ּ��� : ");
	x = sc. nextInt();
	System.out.print("�� ��° ������ �Է��� �ּ��� : ");
	y = sc. nextInt();
	switch (opr)
	{
		case "+" :
			System.out.println(x + " " + opr + " " + y + " = " + (x + y));
		break;
		case "-" :
			System.out.println(x + " " + opr + " " + y + " = " + (x - y));
		break;
		case "*" :
			System.out.println(x + " " + opr + " " + y + " = " + (x * y));
		break;
		case "/" :
			if (y == 0)
			{
			System.out.println("���������� �Ұ����� �����Դϴ�");
			}
			else
			{
			System.out.println(x + " " + opr + " " + y + " = " + (x / y));
			}
		break;
		default :
			System.out.println("�ùٸ� �����ڸ� �������ּ���.");

	}
		System.out.println("Hello World!");
	}
}
