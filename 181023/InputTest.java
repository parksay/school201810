import  java.util.Scanner; //��ĵ ��� �غ��ض�
class InputTest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //��ĳ�� ����
		char p;
		p = scan. nextLine();
		
		System.out.println(scan. nextLine() + "�� �ٺ� �˰� ��û��");
		int x, y, z;
		x = scan. nextInt(); //���� �Է� ����
		y = scan. nextInt();
		z = x + y;
		System.out.println("���� ���ϸ� " + z);

		int a, b, c;
		System.out.println("���ϱ⸦ ������ ������ �Է��� �ּ���.");
		a = scan. nextInt();
		System.out.println("���ϱ⸦ ������ �� �ϳ��� ������ �Է��� �ּ���.");
		b = scan. nextInt();
		c = a * b;
		System.out.println("���� ���ϸ� " + c);
		
		int m, n, l;
		m = scan. nextInt();
		n = scan. nextInt();
		l = ++m * n; //�̷��� �ϸ�, �Է� ���� m���� 1�� ���� ��, �Է� ���� n�� ���ض�
		System.out.println("(�� ���� + 1) �� �ſ� (�� ����) ���ϸ� " +l);
		
		System.out.println("Hello World!");
	}
}
