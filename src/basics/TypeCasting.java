package basics;


public class TypeCasting {

	public static void main(String[] args) {
		
		int intValue = 100;
		
		//Implicit TypeCasting
		long longValue = intValue;
		
		//Implicit TypeCasting
		double doubleValue = longValue;
		
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
		double dValue = 10.65;
		
		//Explicit TypeCasting
		int iValue = (int)dValue;
		
		//Explicit TypeCasting // in ex go from double -> int -> bytes //java narrows value under the hood while running
		byte bValue = (byte)dValue;
		
		System.out.println(iValue);
		System.out.println(bValue);
	}

}
