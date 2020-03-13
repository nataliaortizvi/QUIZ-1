package View;

import Controller.ScreenController;
import processing.core.PApplet;

public class ScreenView {
	PApplet app;
	ScreenController empezar;
	
	public ScreenView(PApplet app) {
		this.app = app;
		this.empezar = new ScreenController(app);
	}
	
	public void iniciar() {
		empezar.iniciar();
	}

}
