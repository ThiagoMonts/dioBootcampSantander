/*
Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, o mais novo parque de diversões do universo bruxo. 

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa. 
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class dragaoBerradorWorld {
    public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int maxGuests = sc.nextInt();
		int heightMin = sc.nextInt();
		int heightMax = sc.nextInt();
    
		int enteredGuests = 0;
    
		List<Integer> guests = new ArrayList<Integer>();
    
		while(sc.hasNext()) {
			guests.add(sc.nextInt());
		}
		
		List<Integer> guestsAllowed = guests.stream()
										.filter(g -> g >= heightMin)
										.filter(g -> g <= heightMax)
										.collect(Collectors.toList());

		enteredGuests = (guestsAllowed.size() < maxGuests) ? guestsAllowed.size() : maxGuests;
    
		System.out.println(enteredGuests);
	
		sc.close();
	}
}