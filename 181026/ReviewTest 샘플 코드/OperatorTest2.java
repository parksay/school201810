
import java.util.Scanner;

//�ݾ׺� ȭ�󰳼� ���ϱ� (��� ������) 
public class OperatorTest2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price, n50, n10, n5, n1, rest;
		
		System.out.print("��ǰ������ �Է��ϼ��� : ");
		price = input.nextInt();
		
		rest = price;
		n50 = rest / 50000;
		rest = rest % 50000;
		n10 = rest / 10000;
		rest = rest % 10000;
		n5 = rest / 5000;
		rest = rest % 5000;
		n1 = rest / 1000;
		rest = rest % 1000;
		
		System.out.print(price + "���� ");
		System.out.print("5������ " + n50 + "��, ");
		System.out.print("������ " + n10 + "��, ");
		System.out.print("5õ���� " + n5 + "��, ");
		System.out.print("õ���� " + n1 + "���� �����ϰ� ");
		System.out.println(rest + "���� �����ϴ�.");
		
	}
}
