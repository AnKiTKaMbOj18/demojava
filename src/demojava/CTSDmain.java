package demojava;

public class CTSDmain {

	public static void main(String[] args) {
		
		Drawing d=new Drawing();
		Triangle t=new Triangle();
		Circle c=new Circle();
		
		d.setShape(t);
		d.drawShape();
		
		d.setShape(c);
		d.drawShape();
		

	}

}
