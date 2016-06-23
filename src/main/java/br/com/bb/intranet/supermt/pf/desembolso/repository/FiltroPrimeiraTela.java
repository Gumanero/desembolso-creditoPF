package br.com.bb.intranet.supermt.pf.desembolso.repository;

import java.io.Serializable;

public class FiltroPrimeiraTela extends Filtro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private char grupo;

	protected char getGrupo() {
		return grupo;
	}

	protected void setGrupo(char grupo) {
		this.grupo = grupo;
	}
	
	
}
