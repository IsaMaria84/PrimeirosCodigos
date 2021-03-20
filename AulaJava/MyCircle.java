package app;

public class MyCircle {
	
	private int x;
	private int y;
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		this.x = 0;
		this.y = 0;

}
	public MyCircle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "MyCircle [x=" + x + ", y=" + y + ", center=" + center + ", radius=" + radius + ", getX()=" + getX()
				+ ", getY()=" + getY() + ", getCenter()=" + getCenter() + ", getRadius()=" + getRadius()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public double area(int x, int y) {
		double resultado = 0;
		double area = 0;
		double raio1 = 5.0;
		double raio2 = 5.0;
		final double PI = 3.1416;
		area = PI*(raio1 * raio2);
		return resultado;
		
	}
	
	public double area(MyCircle p) {
		return this.area(p.getX(), p.getY());
	}
	
	public  boolean  equals ( MyCircle  other ) {
		boolean resultado =  false ;
		if (other!=  null ) {
			resultado = ( this . x == other . getX ()) && ( this . y == other . getY ());
		
		return resultado;

		}
		return resultado;
		
	}
}



