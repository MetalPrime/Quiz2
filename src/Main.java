import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Rect[][] ArrayCuadrados;
	int cols = 20;
	int rows = 20;
	private boolean isMoving;
	private boolean isDead;
	
	public void settings() {
		size(600,400);
	}
	
	public void setup() {
		background(150);
		ArrayCuadrados = new Rect[cols][rows];
		for(int i=0; i<cols;i++) {
			for(int j=0; j<rows;j++) {
				ArrayCuadrados[i][j] = new Rect(this, i*30, j*20, 30, 20,i,j);
			}
		}
	}
	
	public void draw() {
		for(int i=0; i<cols;i++) {
			for(int j=0; j<rows;j++) {
				ArrayCuadrados[i][j].draw();
				System.out.println(ArrayCuadrados.length);
				if(isMoving) {
					new Thread(ArrayCuadrados[i][j]).start();
				}
				  
			}
		}
	}
	
	public void mouseClicked() {
		isMoving=true;
		
		isDead=true;
	}
	
	public void valitedMovement() throws FinishedInteractionException {
		
			for(int i=0; i<cols;i++) {
				for(int j=0; j<rows;j++) {
					if(mouseX>ArrayCuadrados[i][j].getPosX())
					throw new FinishedInteractionException("No puedes mover este rectangulo");
				}
			}
			
		
	}
	

}
