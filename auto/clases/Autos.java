package clases;

public  class Autos {
	
	//Atributo Comunes

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int anio;
	public Autos(String placa, String marca, String modelo, int a�o) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = a�o;
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
	public int getA�o() {
		return anio;
	}
	public void setA�o(int a�o) {
		this.anio = a�o;
	}
	
	
}
