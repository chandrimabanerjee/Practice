package Day2;

class Ov {
double rate() {
return 10;}
}
 class Op extends Ov{
	double rate() {
		return 10.5;}
}
 class Og extends Ov{
	double rate() {
		return 11.5;}
}

public class Overriding{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Ov a=new Ov();
 System.out.println(a.rate());
 Og b=new Og();
 System.out.println(b.rate());
	}

}
