package jUnitTestingProject;

public class StringUtil {
	public static String removeFirstAndSecondA(String input) {
		if(input==null || input.length()<2) {
			return input;
		}
		StringBuilder result=new StringBuilder();
		if(input.charAt(0)!='A') {
			result.append(input.charAt(0));
		}
		if(input.length()>1 && input.charAt(1)!='A') {
			result.append(input.charAt(1));
		}
		if(input.length()>2) {
			result.append(input.substring(2));
		}
		return result.toString();
	}
}
