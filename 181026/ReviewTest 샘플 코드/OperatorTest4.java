
import java.util.Scanner;

//��Ƽ���͸� ��ġ�� ȯ�� (���������) 
public class OperatorTest4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cm;
		double inch;
		
		System.out.print("���� �Է� (Cm����) : ");
		cm = input.nextInt();
		
		inch = cm / 2.54;
		
		System.out.print(cm + " Cm = " + inch + " inch");
	}
}
