import processing.core.PApplet;

public class Rect implements Runnable{
	private PApplet app;
	private int sizeX;
	private int sizeY;
	private float posX;
	private float posY;
	private int move;
	private int color;
	private int i;
	private int j;
	private int firstPos;
	private float finalPos;

	public Rect(PApplet app,float posX,float posY,int sizeX,int sizeY,int i,int j){
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.i = i;
		this.j = j;
		this.move = 1;
		this.firstPos = (int) (this.sizeY+ this.posY);
		this.finalPos = this.posY;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		move();
		
	}
	public void draw() {
		///////////colores
		if(this.i%2==0) {
			if(this.j%2==0) {
				this.color = 0;
			}
			if(this.j%2==1) {
				this.color = 255;
			}
		}
		if(this.i%2==1) {
			if(this.j%2==1) {
				this.color = 0;
			}
			if(this.j%2==0) {
				this.color = 255;
			}
		}
		///////////////pintar
		app.fill(this.color);
		app.rect(this.posX, this.posY, this.sizeX, this.sizeY);
	}
	
	public void move() {
		
		if(this.posY==this.firstPos || this.posY==this.finalPos ) {
			this.move*=-1;
		}
		if(this.i%2==1) {
			if(this.j%2==1) {
				
				this.posY+=this.move;
				
			}
		}
		
	}
	/**
	 * @return the sizeX
	 */
	public int getSizeX() {
		return sizeX;
	}
	/**
	 * @param sizeX the sizeX to set
	 */
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	/**
	 * @return the sizeY
	 */
	public int getSizeY() {
		return sizeY;
	}
	/**
	 * @param sizeY the sizeY to set
	 */
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	/**
	 * @return the posX
	 */
	public float getPosX() {
		return posX;
	}
	/**
	 * @param posX the posX to set
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}
	/**
	 * @return the posY
	 */
	public float getPosY() {
		return posY;
	}
	/**
	 * @param posY the posY to set
	 */
	public void setPosY(float posY) {
		this.posY = posY;
	}
	/**
	 * @return the move
	 */
	public int getMove() {
		return move;
	}
	/**
	 * @param move the move to set
	 */
	public void setMove(int move) {
		this.move = move;
	}
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * @return the j
	 */
	public int getJ() {
		return j;
	}
	/**
	 * @param j the j to set
	 */
	public void setJ(int j) {
		this.j = j;
	}
	/**
	 * @return the firstPos
	 */
	public int getFirstPos() {
		return firstPos;
	}
	/**
	 * @param firstPos the firstPos to set
	 */
	public void setFirstPos(int firstPos) {
		this.firstPos = firstPos;
	}
	/**
	 * @return the finalPos
	 */
	public float getFinalPos() {
		return finalPos;
	}
	/**
	 * @param finalPos the finalPos to set
	 */
	public void setFinalPos(float finalPos) {
		this.finalPos = finalPos;
	}
	
	
	
	


	
	
}
