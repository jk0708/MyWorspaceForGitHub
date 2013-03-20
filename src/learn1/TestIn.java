package learn1;

import java.util.Scanner;

public class TestIn {
	public static void main(String args[]){
		System.out.println("请输入你的身份证号：\n");
		Scanner s=new Scanner(System.in );
		String s1=s.nextLine();
		int l=s1.length();
		System.out.println("原来你身份证号是"+l+"位数的啊");
		
		
		
	}

}
