package ar.edu.unq.po2.state;

public class EncriptadorNaive {
	
	private String texto;
	private IEncriptacion metodo;
	
	public String encriptation() {
		return metodo.encriptarTexto(this.getTexto());
	}
	
	public String desencriptation() {
		return metodo.desencriptarTexto(this.getTexto());
	}
	
	//SET Y GET
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public IEncriptacion getMetodo() {
		return metodo;
	}
	public void setMetodo(IEncriptacion metodo) {
		this.metodo = metodo;
	}
	
}
