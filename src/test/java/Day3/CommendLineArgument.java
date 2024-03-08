package Day3;
public class CommendLineArgument {

	public static void main(String[] args) {// args we will send through comment line
		
		// TODO Auto-generated method stub 
  
  if (args.length>0) {
	  for (int i=0;i<args.length;i++) {
		  System.out.println(args[i]);
	  }
  }
  else
	  System.out.println("No Argument passed from command line");
	}

}
//right click on the file properties and open location and write cmd-enter cmd will open with location
//then write java filename.java arguments (one two three)- enter. one two three will print

