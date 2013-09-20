package enums;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sizes {
	static {
		try {
			BufferedReader r = new BufferedReader(new FileReader("sizes"));
			size1 = Integer.valueOf(r.readLine());
			size2 = Integer.valueOf(r.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int size1;
	public static int size2;



}
