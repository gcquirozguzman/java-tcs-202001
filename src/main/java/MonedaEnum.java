package main.java;

public enum MonedaEnum {

	SOLES("S","PEN","SOLES"),
	DOLARES("$","USS","DOLARES");
	
	private String codigo;
	
	private String diminutivo;
	
	private String nombreGenerico;

	MonedaEnum(String codigo, String diminutivo, String nombreGenerico){
		this.setCodigo(codigo);
		this.setDiminutivo(diminutivo);
		this.setNombreGenerico(nombreGenerico);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDiminutivo() {
		return diminutivo;
	}

	public void setDiminutivo(String diminutivo) {
		this.diminutivo = diminutivo;
	}

	public String getNombreGenerico() {
		return nombreGenerico;
	}

	public void setNombreGenerico(String nombreGenerico) {
		this.nombreGenerico = nombreGenerico;
	}

}
