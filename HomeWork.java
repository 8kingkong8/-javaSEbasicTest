import java.util.*;
public class HomeWork{
    /*
	// 练习一，声明，初始化变量，输出和
	public static void main(String[] args){
		int age1 = 20;
		int age2 = 30;
		System.out.println(age1 + age2);
	}
	*/
	/*
	// 练习二，定义整型19，输出二进制十六进制八进制数
	public static void main(String[] args){
		int num = 19;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
	}
	*/
	/*
	// 练习三，定义一long.float.double型变量
	public static void main(String[] args){
		long longNum = 12345678901L;
		float floatNum = 3.1415926F;
		double doubleNum = 1234567890.0987654321;
		System.out.println(longNum+"|"+floatNum+'|'+doubleNum);
	}
	*/
	
	/*
	// 练习四，随机生成A-Z 97代表字符 0 的整型数
	public static void main(String[] args){
		Random random = new Random();
		int num = random.nextInt(26);
		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int nums = scanner.nextInt();
		System.out.println("两者之和是："+(num + nums));
	    char character = (char)('A' + num + nums);
		System.out.println(character);
		char a = 98 ;
		char b = '0';
		System.out.println(a+""+(int)b);
	}
	*/
	/*
	//练习五控制台接受一个数字，输出平方
	public static void main(String[] args){
		//阻塞方法，Ctrl+c 强退
		Scanner a = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int num = a.nextInt();
		System.out.println(num*num);
		//牛郎织女
		double lightYear = 4.2*9.46*Math.pow(10,15);
		System.out.println(lightYear/0.45);
		//自由落体
		double height = 384;
		double g = 9.8;
		System.out.print(Math.sqrt(2*height*g));
	}
	*/
}
	