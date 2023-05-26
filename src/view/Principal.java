package view;

import br.com.serialexperimentscarina.arvoreint.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		ArvoreInt arvore = new ArvoreInt();
		
		for (char letra : vetor) {
			arvore.insert(letra);
		}
		
		try {
			arvore.remove(7);
			arvore.remove(6);
			arvore.prefixSearch();
			System.out.println('\n');
			arvore.infixSearch();
			System.out.println('\n');
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
