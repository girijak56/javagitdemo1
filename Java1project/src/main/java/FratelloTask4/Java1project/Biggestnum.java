package FratelloTask4.Java1project;

public class Biggestnum {
	public static void compare(int a, int b) {
		if(a>b) {
			System.out.println(a+ " is big");
		}
		else if(b>a) {
			System.out.println(b+ " is big");
		}
		else {
			System.out.println("equal");
		}
	}

	public static void main(String[] args) {
		Biggestnum.compare(12, 10);
		Biggestnum.compare(3, 20);
		Biggestnum.compare(100, 100);
	}

}
 