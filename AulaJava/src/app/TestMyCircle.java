package app;

	public class TestMyCircle {
		
		public static void main(String[] args) {
			MyCircle c1   =  new  MyCircle (5, 8, 2);
			
			c1 . setX ( 0 );
			c1 . setY ( 4 );

			MyCircle c2 =  new  MyCircle ( 3 , 0, 2 );

			double r1 = c1 . area (c2);
			double r2 = c1 . area (c2 . getX (), c2 . getY ());

			System.out.println (c1);
			System.out.println(c2);

			System.out.println ( " R1 = " + r1);
			System.out.println ( " R2 = " + r2);

			System.out.println ( " Equals: " + c1 .equals(c2));

			c2 . setX (c1 . getX ());
			c2 . setY (c1 . getY ());
			System.out.println ("Equals: " +c1.equals(c2));

		}

	}
		

