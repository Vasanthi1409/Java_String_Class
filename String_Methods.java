package String_Class.com;

public class String_Methods {

	public static void main(String[] args) {
		String S = "Java Developing";
		boolean startsWithS = S.startsWith("Hello");
		System.out.println(startsWithS);
		boolean endsWithS = S.endsWith("ing");
		System.out.println(endsWithS);
		String replaceS = S.replace('e', 'C');
		System.out.println(replaceS);
		String replaceAllS = S.replaceAll("Java", "Python");
		System.out.println(replaceAllS);
		boolean containsS = S.contains("C");
		System.out.println(containsS);
		int indexOfS = S.indexOf('s');
		System.out.println(indexOfS);
		int lastIndexOfS = S.lastIndexOf('e');
		System.out.println(lastIndexOfS);
		char charAtS = S.charAt(2);
		System.out.println(charAtS);
		String substringS = S.substring(5);
		System.out.println(substringS);
		String substringofS = S.substring(7, 11);
		System.out.println(substringofS);
		boolean emptyS = S.isEmpty();
		System.out.println(emptyS);		
		
		String S1 = "Javascript";
		String S2 = "Framework";
		String S1concatS2 = S1.concat(S2);
		System.out.println(S1concatS2);		
		
		String T = "     J A V A        ";
		String trimT = T.trim();
		System.out.println(trimT);
		
	}
}
