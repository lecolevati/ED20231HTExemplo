package controller;

import model.Palavra;

public interface ITabelaController {

	public void adiciona(Palavra p) throws Exception;
	public Palavra busca(Palavra p) throws Exception;
	public void remove(Palavra p) throws Exception;
	public void lista(String letra) throws Exception;

}
