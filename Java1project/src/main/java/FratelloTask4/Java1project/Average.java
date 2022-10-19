package FratelloTask4.Java1project;

public class Average {
	public static double average(double a1, double a2) {
		double avg =(a1+a2)/2;
		return avg;
	}

	public static void main(String[] args) {
		double r = Average.average(7.8, 80);
		System.out.println("avg = "+r);

	}

}
