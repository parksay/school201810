import java.util.Scanner;
class ReviewTest5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h, m, fs, as;
		fs = sc. nextInt();
		h = fs / 3600;
		as = fs - h * 3600;
		m = as / 60;
		as = fs - h * 3600 - m * 60;
		System.out.println(fs + "�ʴ� " + h
			+ "�ð� " + m + "�� " + as + "�� �Դϴ�.");

		/*
		sec = time;
		hour = sec / 3600;		//sec�� 3600���� ������ �� ���� ���ϰ�
		sec = sec % 3600;		//sec�� 3600���� ������ �� �������� ������ ���
		minute = sec / 60;			������ �����ϰڴ�! �� �ǹ̷� �ٽ� �����ϴ� ����
		sec = sec % 60;
		*/


		System.out.println("Hello World!");
	}
}
