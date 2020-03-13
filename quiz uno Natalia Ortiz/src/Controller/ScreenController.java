package Controller;

import Model.Logic;
import processing.core.PApplet;

public class ScreenController {
	Logic iniciarLogica;
	PApplet app;
	
	public ScreenController(PApplet app) {
		this.app = app;
		this.iniciarLogica = new Logic(app);
	}
	
	public void iniciar() {
		iniciarLogica.ejecutar();
	}

	public Logic getIniciarLogica() {
		return iniciarLogica;
	}

	public void setIniciarLogica(Logic iniciarLogica) {
		this.iniciarLogica = iniciarLogica;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
