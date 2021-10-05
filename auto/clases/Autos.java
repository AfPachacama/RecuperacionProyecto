package clases;

public  class Autos {
	
	//Atributo Comunes

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int anio;
	public Autos(String placa, String marca, String modelo, int año) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = año;
	}
//	Metodos Set and Get
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return anio;
	}
	public void setAño(int año) {
		this.anio = año;
	}
	
	
}
