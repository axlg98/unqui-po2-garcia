package ar.edu.unq.po2.state;

public class EncriptadorNumero implements IEncriptacion{
	
	@Override
	public String encriptarTexto(String texto) {
		StringBuilder resultado = new StringBuilder();
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			if(Character.isLetter(c)) {
				int offSet = Character.isUpperCase(c) ? 'A' : 'a';
				int valorNumero = c - offSet +1;
				resultado.append(valorNumero);
			}else {
				resultado.append(c);
			}
		}
		return resultado.toString();
	}
	
	@Override
	public String desencriptarTexto(String texto) {
		return null;
	}

}
