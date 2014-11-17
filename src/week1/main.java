package week1;

public class main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(from1To2(6.0,3.0,2.0,8.0));
		System.out.println(from2To3(6.34,6.34));
		
		
		//System.out.println(from1To2(0.34,0.62,0.34,1.62));
		System.out.println(from2To3(32.0,64.0));
		
		System.out.println(from1To2(234.0,445.0,612.0,823.0));
		System.out.println(from2To3(0,1));
		
	}

	public static String from1To2(double x1, double y1, double x2, double y2)
			throws Exception {
		double a, b;

		if (x2 - x1 == 0) {
			throw new Exception();
		}

		b = (y2 - y1) / (x2 - x1);

		a = y1 - (b * x1);

		// bereken a en b
		return "y = " + a + " + " + b + "x";
	}

	public static String from3To1(double e, double f, double g, double h)
			throws Exception {

		return "P(" + e + "," + f + ") en Q(" + (e + g) + "," + (f + h) + ")";
	}

	public static String from3To2(double e, double f, double g, double h)
			throws Exception {
		double a, b;

		if (g == 0) {
			throw new Exception();
		}

		b = h / g;

		a = f - (b * e);

		// bereken a en b
		return "y = " + a + " + " + b + "x";
	}

	public static String from2To3(double a, double b) throws Exception {

		return "(x boven y) = (a boven " + a + ") + l(1 boven " + b + ")";

	}

}
