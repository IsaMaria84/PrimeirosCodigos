package aula;

public class Porta {
	
	private String pAberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	
	public Porta () {
		pAberta = "verdadeiro";
		cor = "vermelha";
		dimensaoX = 0.0;
		dimensaoY = 0.0;
		dimensaoZ = 0.0;
	}	
		
	public void abre() {
		
	}
	
	public void fecha() {
		
	}
	
	public void pinta(String s) {
		
	}
	
	
	
	
	public Porta (String portaAi, String corI, double dimensaoXI, double dimensaoYI, double dimensaoZI) {
		
		pAberta = portaAi;
		cor = corI;
		dimensaoX = dimensaoXI;
		dimensaoY = dimensaoYI;
		dimensaoZ = dimensaoZI;
				
}

	public String getpAberta() {
		return pAberta;
	}

	public void setpAberta(String pAberta) {
		this.pAberta = pAberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
}