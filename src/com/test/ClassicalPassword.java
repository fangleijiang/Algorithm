import java.util.Scanner;

public class ClassicalPassword {

	public static void main(String[] args) {
		String result = "����Ϊ:";
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���(����)��");
		String temp = sc.next();
		char str[] = temp.toCharArray();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("��ѡ����ܷ�ʽ��1.���м��ܼ���     2.���г˷�����      3.�������ܷ�ʽ");
		int way = sc2.nextInt();
		switch (way) {
		case 1:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] + 4);// ÿ���ַ���4�������������ĸ�
				result+=str[i];
			}
			System.out.print(result);
			break;

		case 2:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] * 2);// ÿ���ַ�*2�������������ĸ�
				if (str[i] > 127) {
					str[i] = (char) (str[i] % 127);
				}
				result+=str[i];
				
			}
			System.out.print(result);
			break;

		case 3:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] * 2 + 4);// ÿ���ַ�*2+4�������������ĸ�
				if (str[i] > 127) {
					str[i] = (char) (str[i] % 127);
				}
				result+=str[i];
				
			}
			System.out.print(result);
			break;

		default:
			System.out.println("������������");
			break;
		}

	}

}
