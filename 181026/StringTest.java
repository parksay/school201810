import java.util.Scanner;
class StringTest 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		double f;
		a=10; b=5; c=4; d= 7;
		f=(a+b+c+d)/(double)4;
		System.out.println(f);
		/*���ڳ� �и� �� �ϳ��� double�� �ٲ��ָ� �ȴٴ� ���ݾ�
		�и� double�� �ٲ��ִ� ��� �� ����. ù°�� 4.0���� �Ἥ �ڵ���ȯ
		�Ѥ��� (double)4�� �Ἥ ���� ��ȯ
		*/

		Scanner sc = new Scanner(System.in);
		String name, bdtp;
		int age;
		byte ht;
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc. nextLine();

		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc. nextInt();

		System.out.print("Ű�� �Է��Ͻÿ�: ");
		ht = sc. nextByte();

		bdtp = sc. nextLine(); /*�տ��� byte�� ��ĵ�޾����Ƿ� ���ۿ�
		���� \n�� ���� ���� nextByte�� ���ڸ� ������ �� �ְ�, ���ڴ� �� ������.
		���� nextLine�� �� �� �־� �༭ ���ۿ� ���� \n�� �����;� ��.
		���۸� �����.
		*/

		System.out.print("�������� �Է��Ͻÿ�: ");
		bdtp = sc. nextLine();

		System.out.println("�̸�: " + name + "\n����: " + age
		+ "\nŰ: "	+ ht + "\n������: " + bdtp );
		//a+b+c+d/(double)4
		//stack�� ������, heap�� �޸�, heap �� ����� ������ '��ü'
		//char + char �� int�� ��������, string + string�� �״�� �̾�ٿ���
		/*buffer���� ������ �� ������ ���� �� nextInt �ٵ� ���� 90 ���� ����
		������, �� ���ͱ��� ���ۿ� �־�. �ٵ� ���ڸ� ������ ���ϱ� ���ۿ� ���Ͱ�
		���� �־�. �׷��� ���� ��ĵ nextLine���� ���� ���� ��� ���� �ʰ� ���Ͱ� �ֱ淡
		�� ���͸� �ٷ� �����ٰ� ��. ��, ���������, nextInt ���Ŀ� ���� nextLine��
		�ٷ� ����Ű�� �������� ��.
		�ݸ鿡, nextLine�� ���ڿ� " "�� ��������, �� ���� ���͸� �����ְ� ����.
		���� nextInt ���Ŀ� nextLine���� ��ĵ �ް� ������, nextLine�� �߰���
		�ѹ� �� �־��༭ ���۸� ����ִ� ������ �߰��ؾ� ��.
		� ������ �������� ���۸� ����� ����� �� ���ΰ�? �� ���� ��� �������
		�� ������ '����Ű'�� �ʱ�ȭ �ż�, ����� ����. �״ϱ� �̹��� ���۸� �����
		���� ����ϴ� �༮�� ���� ������ ������ �� �ٽ� �ް� �� �ָ� �����;� ��.
		*/
		System.out.println("Hello World!");

	}
}
