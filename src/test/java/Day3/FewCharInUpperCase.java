package Day3;

public class FewCharInUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="race";
		String s2 = s1.substring(0, 1).toUpperCase();
		String nameCapitalized = s2 + s1.substring(1);
		System.out.println(nameCapitalized);

			
		}
	}


