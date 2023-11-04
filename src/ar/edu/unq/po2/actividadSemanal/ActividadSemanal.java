package ar.edu.unq.po2.actividadSemanal;

public class ActividadSemanal implements Comparable<ActividadSemanal>{
	private Deporte deporte;
	private int horaDeInicio;
	private int duracion;

	private DiaDeLaSemana dia;
	
	public ActividadSemanal(Deporte dep,DiaDeLaSemana d) {
		this.setDeporte(dep);
		this.setDia(d);
	}
	
	public int costoDeLaActividad() {
		int cantDeCosto = 0;
		if(this.SonDeLunesAMiercoles()) {
			cantDeCosto += 500 + this.cantidadPorComplejidad();
		}else {
			cantDeCosto += 1000 + this.cantidadPorComplejidad();
		}
		return cantDeCosto;
	}
	
	public int cantidadPorComplejidad() {
		return deporte.getComplejidad() * 200;
	}
	
	public boolean SonDeLunesAMiercoles() {
		return this.getDia() == DiaDeLaSemana.LUNES || this.getDia() == DiaDeLaSemana.MARTES 
											|| this.getDia() == DiaDeLaSemana.MIERCOLES;
	}
	
	//COMPARABLE
	
	@Override
	public int compareTo(ActividadSemanal act) {
		if(this.costoDeLaActividad() < act.costoDeLaActividad()) {
			return -1;			
		}else if(this.costoDeLaActividad() > act.costoDeLaActividad()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//GET Y SET
	
	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}
	
	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
