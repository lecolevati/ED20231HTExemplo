package view;

import controller.TabelaController;
import model.Palavra;

public class Principal {

	public static void main(String[] args) {
		Palavra p1 = new Palavra();
		p1.verbete = "Abacaxi";
		p1.significado = "Fruta";

		Palavra p2 = new Palavra();
		p2.verbete = "Abacate";
		p2.significado = "Fruta";

		Palavra p3 = new Palavra();
		p3.verbete = "Abobora";
		p3.significado = "Legume";

		Palavra p4 = new Palavra();
		p4.verbete = "Banana";
		p4.significado = "Fruta";

		Palavra p5 = new Palavra();
		p5.verbete = "Bomba";
		p5.significado = "Doce";

		TabelaController tCont = new TabelaController();
		try {
			tCont.adiciona(p1);
			tCont.adiciona(p2);
			tCont.adiciona(p3);
			tCont.adiciona(p4);
			tCont.adiciona(p5);
			
			Palavra p = new Palavra();
			p.verbete = "Abobora";
			p = tCont.busca(p);
			System.out.println(p);
			System.out.println("======================");
			
			tCont.lista("A");
			System.out.println("======================");
			tCont.lista("B");
			System.out.println("======================");
			
			tCont.remove(p3);
			tCont.lista("A");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
