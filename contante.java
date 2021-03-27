package gokurso;

import java.util.Scanner;

public class contante 
{
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		final double pi = 3.14;
		double raio;
		System.out.println("Digite o valor do raio: ");
		raio = leia.nextDouble();
		
		double diametro = 2*raio;
		double perimetro = 2*pi*raio;
		double area = pi*Math.pow(raio,2);
		
		System.out.println("diametro = "+diametro+" perimetro ="+perimetro+"area ="+area);
	}
	
}

