package net.mdantas.task.models;

public enum Estado {

	EM_ANDAMENTO("Em andamento"),
	CONCLUIDA("Concluida"),
	REMOVIDA("Removida");
	
	public String descricaoEstado;

	Estado(String descricaoEstado){
		this.descricaoEstado = descricaoEstado;
	}
	
}
