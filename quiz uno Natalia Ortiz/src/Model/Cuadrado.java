package Model;

import processing.core.PApplet;

public class Cuadrado extends Figura{
	public Cuadrado (int nombre, int posX, int posY, int dir, int tam, PApplet app) {
		super(nombre, posX, posY, dir, tam, app);
	}
	
	public void pintar() {
		app.fill(355,0,0);
		app.rect(getPosX(), getPosY(), getTam(), getTam());
	}

}
