package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	PApplet app;
	ArrayList<Figura> formas;
	
	//String[] texto;
	
	
	public Logic (PApplet app) {
		this.app = app;
		formas = new ArrayList <Figura>();
		//this.texto = loadStrings("../data/0.txt");
	}
	
	public void ejecutar() {
		
		if (this.nombre == cuadrado) {
			formas.add(new Cuadrado(getPosX(), getPosY(), getTam(), getTam())
		}
		if (this.nombre == triangulo) {
			formas.pintar();
		}
		if (this.nombre == circulo) {
			formas.pintar();
		}
		
		
	
		
		
	}
	

}
