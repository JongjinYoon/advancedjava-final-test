package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();

		switch (operation) {
		case "+":
			Add add = new Add();
			System.out.println(add.calculate(a, b));
			break;
		case "-":
			Sub sub = new Sub();
			System.out.println(sub.calculate(a, b));
			break;
		case "*":
			Mul mul = new Mul();
			System.out.println(mul.calculate(a, b));
			break;
		case "/":
			Div div = new Div();
			System.out.println(div.calculate(a, b));
			break;
		default:
			System.out.println("연산자가 잘못되었습니다");
			break;
		}
	}
}
