package les5.overrideConstr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		Test t1 = new Test();
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		Test t2 = new Test(str);
	}

}

class Test {
	public Test() {
		System.out.println("Constructor Test()");
	}
	public Test(String str) {
		this();
		System.out.println(str);
	}
}
