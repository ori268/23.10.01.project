
public class Test {

	public static void main(String[] args) {

		Rectangle re = new Rectangle ();
		Triangle tr = new Triangle ();
		
		re.setLength(12);
		re.setWidth(5);
		
		tr.setBase(5);
		tr.setHeight(8);
		
		System.out.println(re.toString());
		System.out.println(tr.toString());
	}
	
}
