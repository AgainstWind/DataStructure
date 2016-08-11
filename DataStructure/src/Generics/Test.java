package Generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Gen<Integer,Double> gen1 = new Gen(1,2d);
		System.out.println(gen1.getT());
		System.out.println(gen1.getK());
		List b = new ArrayList();
		Comparable a = new Date();
		System.out.println(a.compareTo("2015-08-09"));
	}

}
