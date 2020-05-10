package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double x1, double x2) throws IllegalArgumentException{
		if(x2 == 0) {
			throw new IllegalArgumentException();
		}
		return (x1/x2);
	}
	
	public static String reverseString(String s) throws IllegalStateException {
		if(s.trim().equals("")) {
			throw new IllegalStateException();
		}
		String a = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			a += s.charAt(i);
		}
		return a;
	}
}
