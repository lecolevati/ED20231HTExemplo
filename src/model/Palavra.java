package model;

public class Palavra {
	
	public String verbete;
	public String significado;
	
	@Override
	public String toString() {
		return "Palavra [verbete=" + verbete + ", significado=" + significado + "]";
	}

	@Override
	public int hashCode() {
		String l = verbete.substring(0,1).toLowerCase();
		char letra = l.charAt(0);
		int ltr = letra - 97;
		return ltr;
	}

}
