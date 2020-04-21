package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche(); //instanciar la clase coche
		Renault.establece_color("Azul");
		System.out.println(Renault.dime_datos_generales());
		Renault.configure_asientos("si");
		System.out.println(Renault.dime_asientos());
	}

}
