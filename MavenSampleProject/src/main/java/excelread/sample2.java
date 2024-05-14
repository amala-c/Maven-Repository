package excelread;

import java.io.IOException;

public class sample2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s1= sample1.readStringData(0,0);
		System.out.println(s1);
		String s2= sample1.readIntegerData(1, 0);
		System.out.println(s2);
}
}