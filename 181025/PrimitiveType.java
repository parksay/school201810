import java.util.Scanner;
class PrimitiveType
{
	public static void main(String[] args) 
	{
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		a=127; /*1byte �� 2^7����. 127������ �� ������ 128�Ǵ� ���� ���� �Ѿ�.
		�������� ��Ÿ���� 01111111(2) ��. (�� ó���� 0�� ��� 1�� ����)*/
		d = 10000000000L; /* long���� 2^63 ���� �����ϴٸ�. �� �̰� �� ��.
		d�� ���� long���� �����߾, �����ϴ� �������� ��� 100���� ������,
		�� ��� 100���� �⺻ �ڷ����� int �������� ó���ؼ� d���ٰ� �ھ�. �״ϱ�
		ó�� �������� �ɷ������� �ž�. �׷���, �̰� ����̱�� ������, ó�� ������������,
		�⺻���� int���� long���� ó���ش޶�� �Ϻη� �� ����� ��. �׷��� ����
		' L '�� �ٿ�. 10000000000L �̷��� long���� ó��.*/
		c = 010;
		System.out.println(c);
		c = 0x10;
		System.out.println(c);
		e=1.5f;
		System.out.println(e);
		f=1e5;
		System.out.println(f);
		g='A';
		System.out.println(g);
		g=65;
		System.out.println(g);
		g= '\u0041' ;
		System.out.println(g);
		g= 'B' -1 ;
		System.out.println(g);
		g = 0x41 ;
		System.out.println(g);
		g = 48 ;
		System.out.println(g);
		//0�� �⺻�� 0���� '0'�ϸ� �����ڵ�? �̷� �ɷ� ��ϵ� 48��, "0"�� string ����

		Scanner testin = new Scanner(System.in);
		int test;
		test = testin. nextInt();
		System.out.println( (char) (test + 1) );
		/*(char) test = A
		(char) test + 1 = 66
		(char) test + (char) test +1 = 131
		(char) test (test + 1) = B
		/*
		System.out.println(c);
*/

		System.out.println("Hello World!");
	}
}
