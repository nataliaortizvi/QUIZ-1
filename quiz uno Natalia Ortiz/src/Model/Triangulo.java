package Model;

import processing.core.PApplet;

public class Triangulo extends Figura{
	public Triangulo (int nombre, int posX, int posY, int dir, int tam, PApplet app) {
		super(nombre, posX, posY, dir, tam, app);
	}
	
	public void pintar() {
		app.fill(0,0,350);
		app.triangle(getPosX()-getTam(),getPosY()+getTam(), 
						getPosX(), getPosY()-getTam(),
							getPosX()+getTam(), getPosY()+getTam());
	}

}
