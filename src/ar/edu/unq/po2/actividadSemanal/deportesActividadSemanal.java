package ar.edu.unq.po2.actividadSemanal;

import java.util.Comparator;
import java.util.List;

public class deportesActividadSemanal {
	private List<ActividadSemanal> acts;
	
	public void agregarActividadSemanal(ActividadSemanal act) {
		acts.add(act);
	}
	//Ejercicio C)I)
	
	public List<ActividadSemanal> todasActDeFutbol(){
		return acts.stream().filter(a-> this.esDeporteDeFutbol(a)).toList();
	}
	
	public boolean esDeporteDeFutbol(ActividadSemanal act) {
		return act.getDeporte() == Deporte.FUTBOL;
	}
	
	//II)
	
	public List<ActividadSemanal> todosDepConLaComplejidad(int complejidad){
		return acts.stream().filter(a-> a.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	//III
	
	public int cantidadDeHorasTotales() {
		return acts.stream().mapToInt(a-> a.getDuracion()).sum();
	}
	
	//IV)
	
	public ActividadSemanal deporteConMenorCosto() {
		return acts.stream().min(Comparator.naturalOrder()).get();
	}
	
	//GET Y SET
	
	public List<ActividadSemanal> getActs() {
		return acts;
	}

	public void setActs(List<ActividadSemanal> acts) {
		this.acts = acts;
	}
	
}
