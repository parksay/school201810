import java.util.Scanner;

class Operator
	{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int x, y;
		x = scan. nextInt();
		y = scan. nextInt();
		
		boolean m;
		//���迬����
			m = y == 2*x;
		System.out.println("�� ��?" + m);
			m = x%2 == 0;
		System.out.println("¦��?" + m);
			m = x%2 == 1;
		System.out.println("Ȧ��?" + m);
		//��������
			m = x > 0 && y > 0;
		System.out.println("x�� ����̰�, y�� ����̴�?" + m);
			m = x > 0 || y > 0;
		System.out.println("x�� ����̰ų�, y�� ����̴�?" + m);
			m = x % 2 == 0 || x % 3 == 0 || x % 5 == 0;
		System.out.println("x�� 2or3or5�� ����̴�?" + m);
			m = x % 3 == 0 && x % 5 == 0 ;
		System.out.println("x�� 3and5�� ����̴�?" + m);
			m = 0 < x && x < 100 ;
		System.out.println("x�� 0�� 100 �����̴�?" + m);
			m = 10 > x || x > 20;
		System.out.println("x�� 10�� 20 ���̰� �ƴϴ�?" + m);
		
		int z;
		z = scan. nextInt();
			m = (z % 4 == 0 && z % 100 != 0) || (z % 400 == 0);
			/* ���� ������ �Ȱ���. �ϴ� ������ ��Ȯ�� ���� �ϰ�, ���� �ϰ� ���� ����
			Ǯ� ���� ���� �� ������ �ɰ��� ������ �� �ֵ��� �ϰ�, �װ�
			�������� ǥ���� �س��� �ǳ�. */
		System.out.println("z�� �����̳�?" + m);
		int a, b, c, d;
		
		a = 11;
		b = 5;
		c = a & b ; //�̰Ŵ� ��Ʈ ������, 2���� ��Ʈ ������ ȯ���� ����, �� �ڸ����� ���迡 ����
		System.out.println(c);
		d = a > b ? 1 : 0; //���� ������.  ���ǽ� ? ���� �� : ������ ��
		System.out.println(d);
		System.out.println(a > b ? "ũ��" : "�۴�");
	}
}
