package dio.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {

	public static void main(String[] args) {
		
		// lista de elementos
		List<String> numerosAleatorios = Arrays.asList("1", "6", "3", "7", "5", "10", "2", "8", "9", "4");
		
		System.out.println("Imprima todos od elementos dessa lista de String:");
		
		// funcao de impressao utilizando forEach para percorrer a lista e interface funcional lambida "->".
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
		
		System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista:");
		
		/* pegando os elementos com stream transformando em numeros inteiros com map parseInt, filtrando com condicionais que retorna boleano como if e else
		 * e colocando em uma nova lista com collect collectors toList e imprimindo a lista com laco forEach percorrendo a List*/
		numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Mostre a media dos numeros:");
		
		// pegando os elementos transformando em inteiros e verificando a media com average imprimindo se tiver true com ifpresent.
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

	}

}
