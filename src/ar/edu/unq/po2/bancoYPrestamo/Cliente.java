package ar.edu.unq.po2.bancoYPrestamo;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int plazo;
	private double sueldoMensual;
	private Credito credito;
	private Banco banco;
	
	
	public Cliente(String n, String a, String dir, int e, double sMensual, Credito cred) {
		this.setNombre(n);
		this.setApellido(a);
		this.setDireccion(dir);
		this.setEdad(e);
		this.setSueldoMensual(sMensual);
		this.setCredito(cred);
	}
	
	public double pedirCredito() {
		return this.getSueldoMensual() + banco.darUnCredito(credito);
	}
	
	public double cantidadDePlazoAPagar() {
		return this.pedirCredito() / this.getPlazo();
	}
	
	public void pagarPrestamoEnCuota() {	
		 banco.aumentarElSaldo(plazo,this.cantidadDePlazoAPagar());
	}

	public double sueldoAnual() {
		return this.sueldoMensual * 12;
	}
	
	//GET Y SET
	
	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}
