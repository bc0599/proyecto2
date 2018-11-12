package com.bcm.proyecto2;

public abstract class GameDecorador implements Game {
	
	private Game juego;
	public GameDecorador (Game juego) {
		this.juego=juego;
	}
	protected Game getJuego() {
		return juego;
		
	}
}
