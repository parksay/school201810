import java.util.Scanner;
class SwitchTest1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.out);
	int x = sc. nextInt();
	
/*
	if (x == 1)
	{
		System.out.println("1���� �����Ͽ����ϴ�.");
	}
	else if (x == 2)
	{
		System.out.println("2���� �����Ͽ����ϴ�.");
	}
	else if (x == 3)
	{
		System.out.println("3���� �����Ͽ����ϴ�.");
	}
	else
	{
		System.out.println("��Ÿ�� �����Ͽ����ϴ�.");
	}
�Ʒ��� �Ȱ��� ����� �ڵ�
*/

	switch (x) //int �Ǵ� string�� ����� ���� ��.
	{
		case 1 :
			System.out.println("1���� �����Ͽ����ϴ�.");
		break;
		case 2 :
			System.out.println("2���� �����Ͽ����ϴ�.");
		break;
		case 3 :
			System.out.println("3���� �����Ͽ����ϴ�.");
		break;
		default :
			System.out.println("��Ÿ�� �����Ͽ����ϴ�.");
/*default ���� break;�� �־ �ǰ� ��� �ǰ�~
switch �޼��� �ȿ����� case�� ���� ������ ��� ����.
������ �ݴ�� default���� ���͵� �Ȱ���.
case 1 : 
Case 2 :
	{ A }
�̷��� 'case 1 �Ǵ� case 2 �� �� { A }�϶�.' ��� ��
*/
		System.out.println("Hello World!");
	}
}
