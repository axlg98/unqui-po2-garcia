package ar.edu.unq.po2.templateMethod;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia
	;
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	public abstract boolean esHoraPico(); //OPERACIÓN PRIMITIVA

	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		 }
	} //TEMPLATE METHOD
	
	public float costoNeto(){
		return this.getTiempo()*1;
	}//OPERACIÓN PRIMITIVA
	
	//SET Y GET
	
	public int getTiempo(){
		return this.tiempo;
	}//OPERACIÓN CONCRETA
	
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
}