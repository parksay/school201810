import java.util.Scanner;
class IfTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score = sc. nextInt();
		
		if(score < 0 || score > 100)
		{
			System.out.println("1~100");
		}
		else if(score >= 90)
		{
			System.out.println("��");
		}
		else if(score >= 80)
		{
			System.out.println("��");
		}
		else if(score >= 70)
		{
			System.out.println("��");
		}
		else if(score >= 60)
		{
			System.out.println("��");
		}		
		else
		{
			System.out.println("��");
		}		
		System.out.println("Hello World!");
	}
}
