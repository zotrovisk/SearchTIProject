package rest;

public class Registro {

	private String dataInicial;
	
	private String dataFinal;
	
	private String codigo;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public Registro() {
		// TODO Auto-generated constructor stub
	}
	
	public Registro(String dataInicial,String dataFinal,String codigo) {
	  this.dataInicial = dataInicial;
	  this.dataFinal = dataFinal;
	  this.codigo = codigo;
	
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Registro [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", codigo=" + codigo + "]";
	}

	
	
	
	
	
	
}
