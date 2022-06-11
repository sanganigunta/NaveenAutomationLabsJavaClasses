
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test");
		String str ="100";
		String str1 ="true";
		char c ='3';
		
		int n = Integer.parseInt(str);
		Double d = Double.parseDouble(str);
		Float f = Float.parseFloat(str);
		Boolean b = Boolean.parseBoolean(str1);
		long l = Long.parseLong(str);
		short s = Short.parseShort(str);
		byte by = Byte.parseByte(str);
		System.out.println(n);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		System.out.println(l);
		System.out.println(by);
		System.out.println(s);
		
		int n1 = Integer.valueOf(str);
		double d1 = Double.valueOf(str);
		float f1 = Float.valueOf(str);
		boolean b1 = Boolean.valueOf(str1);
		long l1 = Long.valueOf(str);
		short s1 =Short.valueOf(str);
		byte by1 =Byte.valueOf(str);
		char c1 = Character.valueOf(c);
		
		System.out.println("###################");
		
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(b1);
		System.out.println(l1);
		System.out.println(by1);
		System.out.println(s1);
		System.out.println(c1);
		
	}

}
