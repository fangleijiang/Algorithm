import java.util.Scanner;

public class ClassicalPassword {

	public static void main(String[] args) {
		String result = "密文为:";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符串(明文)：");
		String temp = sc.next();
		char str[] = temp.toCharArray();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请选择加密方式：1.进行加密加密     2.进行乘法加密      3.其他加密方式");
		int way = sc2.nextInt();
		switch (way) {
		case 1:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] + 4);// 每个字符加4，往后推移了四个
				result+=str[i];
			}
			System.out.print(result);
			break;

		case 2:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] * 2);// 每个字符*2，往后推移了四个
				if (str[i] > 127) {
					str[i] = (char) (str[i] % 127);
				}
				result+=str[i];
				
			}
			System.out.print(result);
			break;

		case 3:
			for (int i = 0; i < str.length; i++) {
				str[i] = (char) (str[i] * 2 + 4);// 每个字符*2+4，往后推移了四个
				if (str[i] > 127) {
					str[i] = (char) (str[i] % 127);
				}
				result+=str[i];
				
			}
			System.out.print(result);
			break;

		default:
			System.out.println("您的输入有误");
			break;
		}

	}

}
