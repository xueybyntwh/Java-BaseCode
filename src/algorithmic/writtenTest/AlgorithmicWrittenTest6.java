package algorithmic.writtenTest;

import java.util.Scanner;

/**
 * 	编写一个命令行程序，提示让用户输入用户名和密码，如果用户名和密码都是admin，则显示登录成功
 * 	如果不是则显示登录失败让用户重新输入，如果用户连续3次认证失败则终止程序。
 * 
 * 
 * 
 * @author Administrator
 * 
 */
public class AlgorithmicWrittenTest6 {

	public static void main(String[] args) {
		checkLogin();
	}

	private static void checkLogin() {
		int count = 0;
		while(count < 3) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入用户名： ");
			String username = scanner.nextLine();
			System.out.println("请输入密码： ");
			String password = scanner.nextLine();
			if("admin".equals(username) && "admin".equals(password)){
				System.out.println("登录成功，欢迎回来！");
				break;
			}else {
				count++;
				if(count < 3) {
					System.out.println("登录失败，请重新输入！");
				}else {
					System.out.println("登录次数过多，认证失败！");
					break;
				}
			}
		}
	}
}
