import java.util.Scanner;
class ReviewTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k, e, m, tt;
		double avg;

		System.out.print("���� ����: ");
		k = sc. nextInt();
		System.out.print("���� ����: ");
		e = sc. nextInt();
		System.out.print("���� ����: ");
		m = sc. nextInt();

		tt = k + e + m;
		avg = tt / (double)3;
		System.out.println("����: " + tt + "\n���: " + avg);		
		System.out.println("Hello World!");
	}
}
