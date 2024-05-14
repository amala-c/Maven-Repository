package excelread;

import java.io.IOException;

public class excelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s1= excelCode.readStringData(0,0);
		System.out.println(s1);
		String s2= excelCode.readIntegerData(1, 0);
		System.out.println(s2);
		
	}

}
