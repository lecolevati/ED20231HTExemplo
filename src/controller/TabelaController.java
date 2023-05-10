package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Palavra;

public class TabelaController implements ITabelaController {

	Lista[] vetPalavra;
	
	public TabelaController() {
		vetPalavra = new Lista[26];
		for (int i = 0 ; i < 26 ; i++) {
			vetPalavra[i] = new Lista();
		}
	}

	@Override
	public void adiciona(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}
	}

	@Override
	public Palavra busca(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Palavra p1 = (Palavra) l.get(i);
			if (p1.verbete.equals(p.verbete)) {
				return p1;
			}
		}
		return null;
	}

	@Override
	public void remove(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Palavra p1 = (Palavra) l.get(i);
			if (p1.verbete.equals(p.verbete)) {
				l.remove(i);
				break;
			}
		}
	}

	@Override
	public void lista(String letra) throws Exception {
		int hash = hashCode(letra);
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Palavra p = (Palavra) l.get(i);
			System.out.println(p.toString());
		}
	}
	
	private int hashCode(String l) {
		l = l.substring(0, 1).toLowerCase();
		char letra = l.charAt(0);
		int ltr = letra - 97;
		return ltr;
	}
	
}








