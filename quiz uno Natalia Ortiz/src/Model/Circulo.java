package Model;

import processing.core.PApplet;

public class Circulo extends Figura{
	public Circulo (int nombre, int posX, int posY, int dir, int tam, PApplet app) {
		super(nombre, posX, posY, dir, tam, app);
	}
	
	public void pintar() {
		app.fill(0,350,0);
		app.ellipse(getPosX(), getPosY(), getTam(), getTam());
	}

}
