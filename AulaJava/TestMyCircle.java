package app;

public class TestMyCircle {
	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		
		c.setX (4);
		c.setY (2);
		
		MyCircle c1 = new MyCircle(4 , 0 , 5);
		double a = c . area (c1);
		double b = c . area (c1 . getX (), c1 . getY ());
		System.out.println (c);
		System.out.println(c1);

		System.out.println ( " R1 = " + c);
		System.out.println ( " R2 = " + c1);

		System.out.println ( " Equals: " + c .equals(c1));

		c1 . setX (c . getX ());
		c1 . setY (c . getY ());
		System.out.println ("Equals: " +c.equals(c1));

	}

}
	
