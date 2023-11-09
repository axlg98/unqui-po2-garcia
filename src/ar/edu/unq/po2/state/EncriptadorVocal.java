package ar.edu.unq.po2.state;

public class EncriptadorVocal implements IEncriptacion{
	@Override
	public String encriptarTexto(String texto) {
		String resultado = "";
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == 'a') {
				resultado += 'e';
			}else if(texto.charAt(i) == 'e') {
				resultado += 'i';
			}else if(texto.charAt(i) == 'i') {
				resultado += 'o';
			}else if(texto.charAt(i) == 'o') {
				resultado += 'u';
			}else if(texto.charAt(i) == 'u') {
				resultado += 'a';
			}else {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}
	
	@Override
	public String desencriptarTexto(String texto) {
		String resultado = "";
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == 'e') {
				resultado += 'a';
			}else if(texto.charAt(i) == 'i') {
				resultado += 'e';
			}else if(texto.charAt(i) == 'o') {
				resultado += 'i';
			}else if(texto.charAt(i) == 'u') {
				resultado += 'o';
			}else if(texto.charAt(i) == 'a') {
				resultado += 'u';
			}else {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
		
	}
}
