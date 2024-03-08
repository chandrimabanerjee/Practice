package Day1;

public class Stringchange {

	
	public static String stringchange(String str) {
		StringBuffer s = new StringBuffer();
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
		if (ch == ' ' && str.charAt(i) != ' ')
		{s.append(Character.toUpperCase(str.charAt(i)));}
		else
		s.append(str.charAt(i));
		ch = str.charAt(i);
		}
		return s.toString().trim();
		}

	
	public static void main(String[] args) {
		String s=stringchange("java is");
		System.out.println(s);
		

	}

}
