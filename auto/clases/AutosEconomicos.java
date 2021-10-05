package clases;

//Atributo Particular Auto  Economico

public class AutosEconomicos extends Autos {

	private String CodigoDescuento;

	public AutosEconomicos(String placa, String marca, String modelo, int anio, String codigoDescuento) {
		super(placa, marca, modelo, anio);
		CodigoDescuento = codigoDescuento;
	}

	public String getCodigoDescuento() {
		return CodigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		CodigoDescuento = codigoDescuento;
	}
	




}
