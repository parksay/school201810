import java.util.Scanner;
class ReviewTest6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ ������ �Է��ϼ���: ");
		int prc, ftt, ott, ft, ot, rm;
		prc = sc. nextInt();
		ftt = prc / 50000;
		rm = prc - 50000 * ftt;
		ott = rm / 10000 ;
		rm = prc - ftt * 50000 - ott * 10000 ;
		ft = rm / 5000;
		rm = prc - ftt * 50000 - ott * 10000 - ft * 5000;
		ot = rm / 1000;
		
		/*
		rm = prc - ftt * 50000 - ott * 10000 - ft * 5000 - ot * 1000;
		System.out.println(prc + "���� 5������ " + ftt
		+ "��, ������ " + ott + "��, 5õ���� " + ft + "��, õ���� "
		+ ot + "���� �����ϰ�, " + rm + "���� �����ϴ�.");
	*/

		
		rm = ((((prc % 50000)%10000)%5000)%1000);
		System.out.println(rm);
		// ������ ���ϴ� ���� % �δ� ��� ������? ���� ���� ���̷���?
		
		System.out.println("Hello World!");


	}
}
