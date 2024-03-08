package Day3;

public class PowerOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int power=3;
        int x=1;
        int number=4;
        while(power>0) {
        	x=number*x;
        	power--;
        }
        System.out.println("Answer = " + x);
	}

}
