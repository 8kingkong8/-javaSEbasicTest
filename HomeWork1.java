import java.util.*;
public class HomeWork1{
    /*
	public static void main(String[] args){
	    char a = 67;
		int b = (int)'a';
		System.out.println(a);
		System.out.print(b);
	}
	*/
	
	/*
	public static void main(String[] args){
		Scanner z = new Scanner(System.in);
		int x =  z.nextInt();
		int y = f(x);
		System.out.print(y);
	}
	*/
	/*
	// y = x^2-2x+4
	public static int f(int x){
		int y = (int)(Math.pow(x,2)) - 2*x + 4;
		return y;
	}
	*/
	/*
	// y = x/3??
	public static int f(int x){
		int y = x%3;
		return y;
	}
	*/
	/*
	// y = x++.
	public static void main(String[] args){
		Scanner z = new Scanner(System.in);
		int x =  z.nextInt();
		f(x);
		
	}
	public static void f(int x){
		System.out.print(x++);
	}
	*/
	/*
    public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		int size = 5;
		int page = 0;
		page = num%size == 0 ? num/size : num/size+1;
		System.out.print(page);
    }
	*/
	/*
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int score = sca.nextInt();
		if(score > 100 || score < 0){
			System.out.print("super man");
		}else if(score >= 90 && score <= 100){
			System.out.print("优秀");
		}else if(score >= 80 && score < 90){
			System.out.print("良好");
		}else{
			System.out.print("不及格");
		}
	}*/
	/*
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int num = 0;
		while(num != -1){
			System.out.print("请输入一个数");
			num = sca.nextInt();
			System.out.println("您输入的数为："+num);
		}
	}*/
	/*
	public static void main(String[] args){
		int x1 = 1;
		int y1 = 1;
		int x2 = 0;
		int y2 = 1;
		double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print(distance);
	}*/
	public static void main(String[] args){
		String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		for(int i = 0;i < str.length();i++){
			if(i%2 == 0){
				oldNum = oldNum + str.charAt(i) - '0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
		System.out.println("奇数和："+oldNum);
		System.out.print("偶数和："+evenNum);
	}
	
	
}