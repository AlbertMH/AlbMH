
public class Texto {

	public static void main(String[] args) {
		String texto = "la guerra de las galaxias";
		
		
		String [] palabras = texto.split(" ");
		
		for (String ele: palabras)
			System.out.println("palabras : " + ele);

	}

}
