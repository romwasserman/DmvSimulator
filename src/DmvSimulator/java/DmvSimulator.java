package DmvSimulator.java;

public class DmvSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to DMV");
		int userNum = 88;
		System.out.println("Your number is 88, please wait until your number is called.");
		int res = 89;
		//int count = 0;
		while (res != userNum ) {
			if (res > 200) {
				res = 0;
				res++;
			}
			System.out.println(res);
			res++;
		}
		System.out.println(res);
		System.out.println("You don't have the required papers, people this days are dumb sometimes...");

	}
}
