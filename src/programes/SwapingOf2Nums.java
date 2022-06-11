package programes;

public class SwapingOf2Nums {

	public static void main(String[] args) {
		
		int a = 10;
		int b =20;
		
//		int temp =0;
//		
//		System.out.println("Before sorting "+a+":"+b);
//		
//		temp = b;
//		b= a;
//		a = temp;
//		
//		System.out.println("After sorting "+a+":"+b);
		
		
//		a = a+b;
//		b = a -b;
//		a = a-b;
		
//		a = a*b;
//		b= a/b;
//		a = a/b;
		
		
		a = a+b-(b=a);
		
		System.out.println("After sorting "+a+":"+b);

	}

}
