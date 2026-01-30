package classproblems;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println(countDigit("hueshfsh7845"));
		

	}
	public static int countDigit(String str) {
		int isDigit=0;
		for(int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				isDigit++;
			}
		}
		return isDigit;
	}

}
