package ar.edu.unq.po2.clienteDeEmail;

public class Correo {
	
	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String asuntoCorreo, String dest, String cuerpoCorreo) {
		this.setAsunto(asuntoCorreo);
		this.setDestinatario(dest);
		this.setCuerpo(cuerpoCorreo);
	}
	
	//GET Y SET
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asuntoCorreo) {
		this.asunto = asuntoCorreo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String dest) {
		this.destinatario = dest;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpoCorreo) {
		this.cuerpo = cuerpoCorreo;
	}
}
