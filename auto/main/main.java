package main;
import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;

import clases.AutosEconomicos;
import clases.AutosLujo;
import clases.Operaciones;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		boolean salir = false;
        int opcion; 
        AutosEconomicos ae;
        AutosLujo al;
        Operaciones op=new Operaciones();
        Scanner sn = new Scanner(System.in);
        while (!salir) {
        	try {
        		System.out.println("=============================================");
            	System.out.println("\tSISTEMA DE CONTROL DE AUTOS - UCE");
            	System.out.println("=============================================");
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Ingresar Auto");
                System.out.println("2. Consultar Auto");
                System.out.println("3. Salir");
                opcion = sn.nextInt(); 
                switch (opcion) {
				case 1:
					boolean salir2 = false;
					while(!salir2){
						System.out.println("=============================================");
		            	System.out.println("\tIngresar Auto");
		            	System.out.println("=============================================");
		                System.out.println("Seleccione una opcion:");
		                System.out.println("1. Ingresar Auto Lujo");
		                System.out.println("2. Ingresar Auto Economico");
		                System.out.println("3. Salir");
		                
		                try{
		                	opcion = sn.nextInt();
		                	switch (opcion) {
							case 1:
								sn.nextLine();
								System.out.println("Ingrese la placa del vehiculo: ");
								String placa=sn.nextLine();
								System.out.println("Ingrese la marca del vehiculo: ");
								String marca=sn.nextLine();
								System.out.println("Ingrese el modelo del vehiculo: ");
								String modelo=sn.nextLine();
								System.out.println("Ingrese el año del vehiculo: ");
								int anio=sn.nextInt();
								System.out.println("Ingrese el codigo de importacion del vehiculo: ");
								sn.nextLine();
								String codigoImportacion=sn.nextLine();				
								al=new AutosLujo(placa, marca,modelo,anio,codigoImportacion);								
								op.GuardarAutoLujo(al);
								break;
							case 2:
								sn.nextLine();
								System.out.println("Ingrese la placa del vehiculo: ");
								placa=sn.nextLine();
								System.out.println("Ingrese la marca del vehiculo: ");
								marca=sn.nextLine();
								System.out.println("Ingrese el modelo del vehiculo: ");
								modelo=sn.nextLine();
								System.out.println("Ingrese el año del vehiculo: ");
								anio=sn.nextInt();
								sn.nextLine();
								System.out.println("Ingrese el codigo de descuento del vehiculo: ");
								String CodigoDescuento=sn.nextLine();				
								ae=new AutosEconomicos(placa, marca,modelo,anio,CodigoDescuento);
								op.GuardarAutoEconomico(ae);
								break;
							case 3:
								salir2=true;
								break;

							default:
								break;
							}
		                	
		                }catch (InputMismatchException e) {
		                    System.out.println("Debes insertar un número");
		                    sn.next();
		                }
						
					}					
					break;
					
				case 2:
					System.out.println("=============================================");
	            	System.out.println("\tConsultar Auto");
	            	System.out.println("=============================================");
	            	sn.nextLine(); 
	            	System.out.println("Ingrese la placa del vehiculo");
	            	String placa=sn.nextLine();
	            	op.BuscarAuto(placa);
	            	break;
				case 3:
					salir=true;
					break;
				default:
					break;
				}
        		
        	}  catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        	
        }
        
	}

}
