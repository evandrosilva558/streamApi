package dio.streamApi;

import java.util.Arrays;
import java.util.List;

public class ExerciciosStreamApi {

	public static void main(String[] args) {
		
		// lista de elementos
		List<String> numerosAleatorios = Arrays.asList("1", "2", "3", "4", "5");
		
		System.out.println("Imprima todos od elementos dessa lista de String;");
		
		// funcao de impressao utilizando forEach para percorrer a lista e interface funcional lambida.
		numerosAleatorios.forEach(s -> System.out.println(s));

	}

}
