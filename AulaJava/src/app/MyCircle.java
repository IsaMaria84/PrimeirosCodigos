package app;

public class MyCircle {
	
	private MyPoint center;
	private int radius = 1;
	private int x;
	private int y;
	
	public MyCircle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
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
	
	public int getCenterX() {
		return x;
	}
	
	public int getCenterY() {
		return y;
	}
	
	public void setCenterXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		String resultado = "MyCircle ("+ this.x +", "+ this.y +")";
		return resultado;
	}

	public double area(int x , int y) {
		double resultado = 0;
		double base = 5.0;
		double exp = 2;
		double valor = Math.pow(base,exp);
		double pi = Math.PI;
		double a = pi*valor;
		return a;
	
}

	public double area(MyCircle c2) {
		// TODO Auto-generated method stub
		return 0;
	}

}


