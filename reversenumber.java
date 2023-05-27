import java.util.Scanner;
class reversenumber{
	public static void main(String[] input){
		int num1;
		int reverse=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to reverse ");
		num1 = sc.nextInt();
		while(num1!=0){
			int reminder =(num1%10);
			reverse = (reverse*10)+reminder;
			num1= num1/10;
			}
			System.out.println("reverse number "+reverse);
	}
}