package aula;

public class Main {
	   public static void main ( String [ ] args ){
	  
	     Casa c1 = new Casa (null, 0, 0, 0);
	     
	     c1.porta1= c1.portaAberta(c1.porta1);
	     c1.porta2 = c1.portaFechada(c1.porta2);
	     c1.porta3 = c1.portaFechada(c1.porta3);
	  
	     String [] color = { "Blue  " ,"Vermelha", "Azul" ,"Cinza", "Amarela " };
	     c1.pintar();
	     System.out.println ("===> Casa Criada  <========( passo 1 )====");
	     System.out.println (" A cor da casa é :"+ c1.cor);
	     c1.quantasPortasAbertas();
	     System.out.println( " Esse é número de portas abertas na casa!");
	  	
	  

	  
	  }
	}