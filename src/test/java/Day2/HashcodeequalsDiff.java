package Day2;

import java.util.HashSet;
import java.util.Set;
class Pen{
	int price;
	String colour;
	
	Pen (int price, String colour){
		this.price=price;
		this.colour=colour;
	}
	
	public boolean equals (Object obj) {
		Pen that= (Pen)obj;
		boolean Equals=this.price==that.price && this.colour.equals(that.colour);
		return Equals;
	}
	public int hashcode() {
		return price+colour.hashCode();
	}
}
public class HashcodeequalsDiff {	
	public static void main(String[] args) {
		Pen p1=new Pen(10,"black");
		Pen p2=new Pen(10,"black");
	
		Set<Pen> Pen1= new HashSet<>();
		Pen1.add(p1);
		Pen1.add(p2);
		System.out.println(p1.equals(p2));
		System.out.println(Pen1.hashCode());
	}
}
	


