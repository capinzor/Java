package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		ruedas=4;
		largo=400;
		ancho=250;
		motor=1000;
		peso=500; 
	}
	
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tine " + ruedas+ " ruedas." +
		" Mide " + largo/100 + " metros, con ancho de " + ancho +
		" cm y un peso de " + peso + " kg";
	}
	
	public void establece_color(String color) {
		this.color = color;
	}
	
	public String dime_color() {
		return "El color del coches es " + color;
	}
	
	public void configure_asientos(String asientos_cuero) {
		
		if(asientos_cuero=="si") {
			this.asientos_cuero=true;	
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asisentos de serie";
		}
	}
	
}
