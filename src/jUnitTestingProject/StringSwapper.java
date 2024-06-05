//package jUnitTestingProject;
//
//public class StringSwapper {
//	public void swapLastTwoChar(String ans, String str) {
//		String lastString=str.substring(str.length()-2, str.length());
//		System.out.println(swappedString);
//	}
//	public static void main(String args[]) {
//		StringSwapper ss=new StringSwapper();
//		ss.swapLastTwoChar("ABCD", "ABCD" );
//	}
//}
package jUnitTestingProject;

public class StringSwapper {

	public Object swapLastTwoChar(String str) {
		if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}



}