class  Test4
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		a=b=c=d=0;
		++a; //������ ���������ڴ� �켱������ ���� -> a�� ���� 0�̾��µ� 1�� ���غη��� -> a=1
		System.out.println(a);
		b=a++; //������ ���������ڴ� �켱������ ���� -> b�� a�� ���� �� �Ŀ�, a�� 1�� ���ض� -> b=1, a=2
		System.out.println(b);
		c=++a; //������ �����������̹Ƿ� ���� 1 ������ -> a=3 �� �Ŀ� c�� a�� ������.
		System.out.println(c);
		d=++c;
		System.out.println(d);
		System.out.println("a= " + a + " b= " + b + " c= " + c + " d= " + d);
		//�� �� �ű��Ѱ� �����ٰ�
		System.out.println(a*8+7-1*5);
		//�̷��� �س����� a�� �Լ� �ȿ����� ������ �� ������, �Լ� �ۿ����� ���� ������ ����.
		System.out.println("a= " + a);
		//�̷��� �ٽ� ����ϸ�, ���� a ������ ������.
		System.out.println("Hello World!");
		System.out.println(b-7);
		System.out.println("b=" - b);
	}
}
