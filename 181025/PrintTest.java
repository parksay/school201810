import java.util.Scanner;
class  PrintTest
{
	public static void main(String[] args) 
	{
		int a= 94;
		char b = 'b';
		System.out.println(a + b); //�����ڵ�� ��ȯ�� ���
		System.out.println(b + "" ); //�����ڵ忡 �ش��ϴ� ����
		System.out.println("a= " + a); //" a= ����"
		System.out.println("1" + 2 + 3); // " 123"
		System.out.println(3 + 2 + "2"); // " 5 + 2 " 
		System.out.println( (char) (a + b) ); // �����ڵ忡 �ش��ϴ� ����
		System.out.println( (char) a + "" + b ); // ���� b
		System.out.println("" + a + b); // ab
		/* ' + ' �������� 
		-���ʿ� int�� �׳� ��¥ ���ϱ��
		-���ʿ� char��, ' + ' ������ �����ϱ� ����, �� �� int�� ��ȯ�ؼ� ó��.
		-String Ÿ���̳� " " �ȿ� �� �ִ� ���ڿ��� �´ٸ� �׳� �״�� �ٿ��� �о���
		-' + ' �������� ���ʿ� char �� " " �� �־�. �׷��� " " �� ���ؼ�, ���� ������
		�����ϴ� �� �ƴϹǷ�, char�� �״�� ���ڷ� ������, �ڿ��ٰ� ���ڿ��� ���� �ٿ� ��.
		-' + ' �������� ���ʿ� int �� " " �� �־�. �׷��� " " �� ���ؼ�, ���� ������
		�����ϴ� �� �ƴϹǷ�, int�� �״�� ���ڷ� ������, �ڿ��ٰ� ���ڿ��� ���� �ٿ� ��.
		-int + char ���, �����Ϸ��� �� �ڷ��� ���� �������. �� �� ū �ڷ��� ������
		�ڵ� ��ȯ. ��, char�� �ش��ϴ� �����ڵ� ���ڿ� int�� ' + '���� �ؼ� int�� ���.
		-���� int���� a�� char�� ���� ��ȯ�ؼ� (char) a + b �̷���,
		a�� char�� ���� ��ȯ�� �Ŀ�, b�� ' + ' ���� �����ϴ� �������� ���� �ٽ�
		int�� �ڵ� ��ȯ��. ��, ó�� �켱 ������ ������ ����
		a�� char�� ���� ��ȯ, a�� b�� +.
		*/
		
		//�Ʒ��� string �ڷ��� �Է¹޾� ����
		Scanner sc = new Scanner(System.in);
		String m = "��û��";
		String n;
		n = sc. nextLine();
		System.out.println(m +"  "+ n + "  ������~");
		System.out.println("Hello World!");
	}
}
