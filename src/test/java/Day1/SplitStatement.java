package Day1;

public class SplitStatement {

		public static void main(String args[]){
		String strMain ="Welcome to QAScript";
		String[] arrSplit = strMain.split("\\s");
		for (int i=0; i < arrSplit.length; i++){
		System.out.println(arrSplit[i]);
		}
		}
		}


