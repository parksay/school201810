
import java.util.Scanner;

//�ʴ����� �ð�,��,�ʷ� ȯ�� (��� ������) 
public class OperatorTest1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time, hour, minute, sec;
		
		System.out.print("�ð��� �� ������ �Է��ϼ��� : ");
		time = input.nextInt();
		
		sec = time;
		hour = sec / 3600;
		sec = sec % 3600;
		minute = sec / 60;
		sec = sec % 60;
		
		System.out.println(time + "�ʴ� " + hour + "�ð� " + minute + "�� " + sec + "���Դϴ�.");
	}
}
