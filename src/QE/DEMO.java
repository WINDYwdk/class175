package QE;

import java.util.Scanner;

public class DEMO {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数");
	int b=sc.nextInt();
	pu(b);
}
private static int pu(int b) {
for(int i=0;i<=b;i++){
	System.out.println(i);

}
       return b; 
}

}
