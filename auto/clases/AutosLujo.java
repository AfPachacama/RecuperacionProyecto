package clases;

//Atributo Particular Auto  Lujoso
public class AutosLujo extends Autos {

	private String CodigoImportacion;

	public AutosLujo(String placa, String marca, String modelo, int anio, String codigoImportacion) {
		super(placa, marca, modelo, anio);
		this.CodigoImportacion = codigoImportacion;
	}

	public String getCodigoImportacion() {
		return CodigoImportacion;
	}

	public void setCodigoImportacion(String codigoImportacion) {
		CodigoImportacion = codigoImportacion;
	}
	
}
