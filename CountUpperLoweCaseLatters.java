package classproblems;

public class CountUpperLoweCaseLatters {
	public static void main(String[]args) {
		countUppLowCase("KSHhjdh");
		
	}
	public static void countUppLowCase(String str) {
		int isUppercase=0;
		int isLowercase=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				isUppercase++;
			}
			if(Character.isLowerCase(str.charAt(i))) {
				isLowercase++;
			}
		}
		System.out.println("This is UpperCase Count : "+isUppercase);
		System.out.println("This is LowerCase Count : "+isLowercase);
		
	}

}
