package Model;

import processing.core.PApplet;

public abstract class Figura {
	//atributos
	
	int nombre;
	int posX;
	int posY;
	int vel;
	int dir;
	int tam;
	PApplet app;
	
	//constructor
	public Figura(int nombre, int posX, int posY, int dir, int tam, PApplet app) {
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
		this.vel = 4;
		this.dir = dir;
		this.tam = tam;
		this.app = app;
	}
	
	//metodos
	public abstract void pintar();
	
	
	
	public void mover() {
		this.posX += this.vel;
		if(this.posX > 600) {
			this.vel *= this.dir;
		}
	}

	
	//getters y setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}


}
