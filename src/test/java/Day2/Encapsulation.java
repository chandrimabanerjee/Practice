package Day2;

public class Encapsulation {
private int acc_no; 
private String name;

void setname (String n) {
	name=n;
}
String getname() {
	return name;
}
void setno (int no) {
	acc_no=no;
}
int  getno() {
	return acc_no;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e= new Encapsulation();
		e.setno(101);
		int number=e.getno();
		System.out.println(number);
		e.setname("Tina");
		String name=e.getname();
		System.out.println(name);

		}

}
