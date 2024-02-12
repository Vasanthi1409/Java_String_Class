package String_Class.com;

public class String_Class_Pgm {

	public static void main(String[] args) {
		String ST = "Software Testing";
		String SD = "Software Developing";
		String ST2 = "software testing";
		int LenofST = ST.length();
		System.out.println(LenofST);
		int IndexofST = LenofST - 1;
		System.out.println(IndexofST);
		boolean STequalsSD = ST.equals(SD);
		System.out.println(STequalsSD);
		boolean STequalsIgnoreCaseST2 = ST.equalsIgnoreCase(ST2);
		System.out.println(STequalsIgnoreCaseST2);
		String upperCaseofST = ST.toUpperCase();
		System.out.println(upperCaseofST);
		String lowerCaseofSD = SD.toLowerCase();
		System.out.println(lowerCaseofSD);
	}
}
