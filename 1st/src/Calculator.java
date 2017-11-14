import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num = Input.nextDouble();
		System.out.println("Enter operation (2 for square):");
		char op = Input.next().charAt(0);
		if (op == '2'){
			double ans4 = num * num;
			System.out.println(ans4);
		}else{
			System.out.println("Enter second number:");
			double num2 = Input.nextDouble();
			switch (op) {
				case '+':
					double ans = num + num2;
					System.out.println(ans);
					break;
				case '-':
					double ans1 = num - num2;
					System.out.println(ans1);
					break;
				case '*':
					double ans2 = num * num2;
					System.out.println(ans2);
					break;
				case '/':
					double ans3 = num / num2;
					System.out.println(ans3);
					break;
			}
		}
	}
}
