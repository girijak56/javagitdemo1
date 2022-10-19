package FratelloTask4.Java1project;

public class EvenorOdd {
	public void verify(int n) {
		if (n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		EvenorOdd obj = new EvenorOdd();
		obj.verify(10);
		obj.verify(15);
		obj.verify(1);
		obj.verify(12);
		obj.verify(18);
		obj.verify(50);



	}

}
