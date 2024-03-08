package Day3;

public class ReverseStringSet {
	public static String reverseTheSentence(String inputString)
	{
	String[] words = inputString.split(" ");
	String outputString = "";
	for (int i = words.length-1; i >= 0; i--)
	{
	outputString = outputString + words[i] + " ";
	}
	return outputString;
	}
public static void main(String args[]) {
	String s=reverseTheSentence("The work is you");
	System.out.println(s);
}


}
