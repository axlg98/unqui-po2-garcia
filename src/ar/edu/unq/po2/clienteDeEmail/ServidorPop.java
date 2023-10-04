package ar.edu.unq.po2.clienteDeEmail;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	
	private String usuario;
	private String password;
	private List<Correo> retorno;
	
	public ServidorPop(String user, String pass) {
		
	}

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		this.setUsuario(user);
		this.setPassword(pass);
		//Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		if (nombreUsuario.length() > 0 && passusuario.length() > 0) {
			this.setUsuario(nombreUsuario);
			this.setPassword(passusuario);
		}
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.	
		retorno.add(correo);
		
	}

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde	
		retorno.clear();
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}
	
	//GET Y SET

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Correo> getRetorno() {
		return retorno;
	}

	public void setRetorno(List<Correo> retorno) {
		this.retorno = retorno;
	}

}
