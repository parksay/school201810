import java.util.Scanner;
class SwitchReview1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int yy, bth;
	System.out.print("�¾ �⵵ ���ڸ� : ");
	yy = sc. nextInt();
	bth = (yy - 4) % 12;
	switch (bth)
	{
	case 0 : 
	System.out.println("����");
	break;
	case 1 : 
	System.out.println("�Ҷ��");
	break;
	case 2 : 
	System.out.println("ȣ���̶��");
	break;
	case 3 : 
	System.out.println("�䳢���");
	break;
	case 4 : 
	System.out.println("����");
	break;
	case 5 : 
	System.out.println("����");
	break;
	case 6 : 
	System.out.println("�����");
	break;
	case 7 : 
	System.out.println("����");
	break;
	case 8 : 
	System.out.println("�����̶��");
	break;
	case 9 : 
	System.out.println("�߶��");
	break;
	case 10 : 
	System.out.println("�����");
	break;
	case 11 : 
	System.out.println("�������");
	}

/*
String str;
switch (yy%12)
{
case 1 :
	str = "���";
break;
case 2 :
	str = "�Ҷ�";
brea;
........
}
System.out.println("����� " + str + "�� �Դϴ�");

�̷��� �ϸ� ��� ������ �� ���� �ᵵ ��. ���� �Ŷ� ���� �� ���� �ŷ���.
*/
		System.out.println("Hello World!");
	}
}
