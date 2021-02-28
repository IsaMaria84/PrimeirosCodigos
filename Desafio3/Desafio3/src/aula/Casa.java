package aula;

public class Casa {
		
	String cor;
	int porta1;
	int porta2;
	int porta3;
	
	public Casa(String string, int i, int j, int k) {
		
		cor = "branca";
		porta1 = 0;
		porta2 = 0;
		porta3 = 0;
		
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPorta1() {
		return porta1;
	}

	public void setPorta1(int porta1) {
		this.porta1 = porta1;
	}

	public int getPorta2() {
		return porta2;
	}

	public void setPorta2(int porta2) {
		this.porta2 = porta2;
	}

	public int getPorta3() {
		return porta3;
	}

	public void setPorta3(int porta3) {
		this.porta3 = porta3;
	}

	public void aberta() {
		
	}

	public void fechada() {
		
	}
	
	public void pintar() {
		
	}
	
	public void quantasPortasAbertas() {
		int soma = porta1+ porta2+ porta3;
	     if( soma == 0){
	        System.out.println ( " Todas as portas estão fechadas");
	     }
	     else{ 
	        System.out.println ( soma+"  estão abertas ");
	     }
	}

	public int portaAberta(int porta12) {
		
		return 0;
	}

	public int portaFechada(int porta22) {
		
		return 0;
	}
}


