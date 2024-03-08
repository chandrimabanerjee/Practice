package Day3;

public class DeleteDigitFromString {
  public static void DeleteDigit(String s) {
	  String result="";
	  for (int i=0;i<s.length();i++) {
		  if(!Character.isDigit(s.charAt(i))){
			  result=result + s.charAt(i);
		  }
	  }
	  System.out.println(result);
	  
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="123ffr2";
    DeleteDigit(s);
	}

}
