import java.util.Scanner;
class  TypeCasting //�ڷ��� ��ȯ
{
	public static void main(String[] args) 
	{
		Scanner hi = new Scanner(System.in);
		int a, b, c, d;
		double m;
		a = hi. nextInt();
		b = hi. nextInt();
		c = hi. nextInt();
		d = hi. nextInt();
		m = (double)(a + b + c +d) / 4 ; //���� ���� ��ȯ
		m = (a + b + c + d) / (double)4; //�и� ���� ��ȯ
		m = (a + b + c + d) / 4.0 ; //�и� �ڵ� ��ȯ

			/*�̷��� �ϸ�, m�� ����, ���� double�� ǥ���ϰ� ������, �캯���� ��� ����
		 int��. a,b,c,d �� int�� �޾Ұ�, ������ ���� �ڵ����� �⺻ ���� int�̰�. �׷���
		 �Ҽ��� ���ϰ� ���� �� �ִ� ����, �Ҽ��� ���ϰ� ����ż� ����. (������ ����
		 ��ġ double ó�� ���� �ž�. x.0 �̷� ������. �ٵ� �װ� �Ҽ��� ���ϰ� �߷� �ִ�
		 ���·�, ' .0 ' �� �ٴ� �ž�.) ���� �캯�� double�� �ٲ� ��� ��.
		 ����� �� ������. ù°, ������ ���� 4.0 �̷� ������ �Ἥ, �⺻ ���� double��
		 �ǵ��� ����� ��. �׷� �����ϴ� �������� �ڷ����� double �� ���缭 ���.
		 ��°, �������� ���� double �� ���� ��ȯ. (double)(a + b + c + d)/4 �̷� ������.
		 */
		System.out.println(m);
		System.out.println("Hello World!");
	}
}
