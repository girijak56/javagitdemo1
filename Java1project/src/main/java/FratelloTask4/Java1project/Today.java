package FratelloTask4.Java1project;

import java.util.Date;

public class Today {
	
	public String getTodayDate() {
		Date d = new Date();
		String now = d.toLocaleString();
		return now;
	}

	public static void main(String[] args) {
		Today today = new Today();
		String d = today.getTodayDate();
		System.out.println("Now :"+d);

	}

}

