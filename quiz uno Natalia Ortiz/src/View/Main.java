package View;

import processing.core.PApplet;

public class Main extends PApplet {
	ScreenView inicio;
	
	String[] text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(600,600);
		
	}
	
	public void setup() {
		inicio = new ScreenView(this);
		text = loadStrings("../data/0.txt");
		
		/*for(int i = 0; i < text.length; i++) {
			String [] cortar = split(" ");
		}*/
		
	}
	
	public void draw() {
		background(231,134,145);
		
	}
	
	public void mousePressed() {
		
		
	}

}
