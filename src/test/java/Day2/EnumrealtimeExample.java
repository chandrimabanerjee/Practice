package Day2;
enum Laptop{
	
	Macbook(2000),Surface(1000);// object with the constructor value
	 int price;
	
	 private Laptop(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
		
	}
	public void setprice(int price) {
		this.price=price;
		
	}

	

	
}
public class EnumrealtimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (Laptop l: Laptop.values())
System.out.println(l+" "+l.getPrice());
	}

}
