package dio.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {

	public static void main(String[] args) {
		
		// lista de elementos
		List<String> numerosAleatorios = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		
		System.out.println("Imprima todos od elementos dessa lista de String:");
		
		// funcao de impressao utilizando forEach para percorrer a lista e interface funcional lambida.
		numerosAleatorios.forEach(s -> System.out.println(s));
		
		// impressao dos elementos da classe lista utilizando reference-method. "::"
		numerosAleatorios.forEach(System.out::println);
		
		System.out.println("Pegue os 5 primeiros numeros e coloq-os dentro de um Set:");
		
		// pegando 5 elementos com stream.limit e colocando na colecao set com collector collectors.toset e imprimindo com referrence-method :: e foreach percorrendo o set.
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("Transforme essa lista de Strings em numeros Inteiros:");
		
		// pegando todos os elementos com stream.map transformando em inteiro com integer::parseInt e colocando na list com collect collectors.toList.
		numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
		
		numerosAleatorios.forEach(System.out::println);

	}

}
