import java.util.Scanner;
class BMIfm
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	double wt, ht, bmi;
	System.out.print("ü�� : ");
	wt = sc. nextDouble();
	System.out.print("Ű : ");
	ht = sc. nextDouble();
	ht = ht / 100;
	bmi = wt / (ht*ht);
	if (bmi < 18.5)
	{
		System.out.println("��ü��");
	}
	if (bmi >= 18.5 && bmi < 23)
	{
		System.out.println("����");
	}
	if (bmi >= 23 && bmi < 25)
	{
		System.out.println("��ü��");
	}
	if (bmi >= 25)
	{
		System.out.println("��");
	}

/*
	if (bmi < 18.5)
	{
		System.out.println("��ü��");
	}
	else if (bmi >= 18.5 && bmi < 23)
	{
		System.out.println("����");
	}
	else if (bmi >= 23 && bmi < 25)
	{
		System.out.println("��ü��");
	}
	else 
	{
		System.out.println("��");
	}
�̰͵� ����. else �� default �� ���� �Ŷ�, ������ ���� �޾����� �ʾƵ� ��.
�ƴ�, ������ �� ��
*/
	System.out.println("Hello World!");
	}
}
