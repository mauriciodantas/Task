package net.mdantas.task.models;

public enum Estado {

	EM_ANDAMENTO("Em andamento"),
	CONCLUIDA("Concluída"),
	REMOVIDA("Removida");
	
	private String descricao;

	Estado(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
