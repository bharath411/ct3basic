package basic;
import basic.meth.Sample1;
import manoj.studentmarks;
public class Ops {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add();
		cal.add1(30);
		int z = 10;
		cal.add1(z);
		String s = "sdfsd";
		
		cal.add2(100, 200);
		int d = cal.add3(349,232);
		double f = cal.avg(d);
		System.out.println(f);
		Sample1 sam = new Sample1();
		studentmarks sm = new studentmarks();
		
		Results r = new Results();
		r.setMarks(100);
		r.result();
	}
}
