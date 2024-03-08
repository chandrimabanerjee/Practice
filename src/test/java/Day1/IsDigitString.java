package Day1;

public class IsDigitString {
	public static String removeNumFromString(String str) {
		if (str == null) {
		return null;
		}
		char[] ch = str.toCharArray();
		int length = ch.length;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < length) {
		if (Character.isDigit(ch[i])) {
		i++;
		} else {
		sb.append(ch[i]);
		i++;
		}
		}
		return sb.toString();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=removeNumFromString("java12ww");
		System.out.println(s);
	}

}
