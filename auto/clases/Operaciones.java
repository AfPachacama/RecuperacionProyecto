package clases;

import java.util.ArrayList;

public class Operaciones {
	 ArrayList<AutosEconomicos> arrayAutosEco=new ArrayList<AutosEconomicos>();
	 ArrayList<AutosLujo> arrayAutosLujo=new ArrayList<AutosLujo>();
	 
	 public Operaciones(){
		 
	 }
	 public void GuardarAutoEconomico(AutosEconomicos ae){
		 arrayAutosEco.add(ae);
		 System.out.println("El Auto se ha guardado Exitosamente");
		 
	 }
	 public void GuardarAutoLujo(AutosLujo al){
		 arrayAutosLujo.add(al);
		 System.out.println("El Auto se ha guardado Exitosamente");		 
	 }
	 public void BuscarAuto(String placa){
		 boolean conf=false;
		 for (AutosEconomicos autosEconomicos : arrayAutosEco) {
			if(autosEconomicos.getPlaca().equals(placa)){
				System.out.println("Auto Encontrado - Auto Economico");
				System.out.println("Modelo: "+autosEconomicos.getModelo());
				System.out.println("Placa: "+autosEconomicos.getPlaca());
				System.out.println("Marca: "+autosEconomicos.getModelo());
				System.out.println("Codigo Descuento: "+autosEconomicos.getCodigoDescuento());
				conf=true;
			}
		 }
		 for (AutosLujo autosLujo : arrayAutosLujo) {
				if(autosLujo.getPlaca().equals(placa)){
					System.out.println("Auto Encontrado - Auto de Lujo");
					System.out.println("Modelo: "+autosLujo.getModelo());
					System.out.println("Placa: "+autosLujo.getPlaca());
					System.out.println("Marca: "+autosLujo.getModelo());
					System.out.println("Codigo Importacion: "+autosLujo.getCodigoImportacion());
					conf=true;
			}
		}
		if(conf==false){
			System.out.println("Auto No Encotrado");
		}
	 }
	 

}
