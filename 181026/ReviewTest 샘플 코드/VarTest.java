
import java.util.Scanner;

//int�� ������ �����ϰ� ������ �Է¹޾� ����. �� ���� 0���� ū�� ���ϰ� �� �����  boolean������ ���� (�ڷ���, ����)
public class VarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		boolean result;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		result = num > 0;
		
		System.out.println("num�� �� : " + num);
		System.out.println("result�� �� : " + result);
	}

}
