package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class AbstractObject{

  protected Point position; // position de l'objet dans l'espace carthésien
  protected Point speed; // vitesse de l'objet
  protected int weight; // poids de l'objet
  protected Rectangle box; // volume de l'objet (pour les collisions )
  protected int zindex; // sur quel plan se trouve l'objet ?

  public AbstractObject(int x, int y, int width, int height, int zindex){
    this.position = new Point(x,y);
    this.box = new Rectangle(width, height);
    this.speed = new Point(0,0);
    this.weight = 0;
    this.zindex = zindex;
  }

  // Dessiner l'objet
  // de base on dessine la boundingbox
  public void draw(Graphics g){
    g.setColor(Color.green);
    g.drawRect(position.x, position.y, box.width, box.height);
  }

  /**
  * Est-ce qu'on a une collision avec un autre objet ?
  */
  public boolean isCollideWith(AbstractObject obj){
    return getBoundingBox().intersects(obj.getBoundingBox());
  }

  public Rectangle getBoundingBox(){
    return new Rectangle(position.x, position.y, box.width, box.height);
  }

	/**
	* Returns value of position
	* @return
	*/
	public Point getPosition() {
		return position;
	}

	/**
	* Sets new value of position
	* @param
	*/
	public void setPosition(Point position) {
		this.position = position;
	}

	/**
	* Returns value of speed
	* @return
	*/
	public Point getSpeed() {
		return speed;
	}

	/**
	* Sets new value of speed
	* @param
	*/
	public void setSpeed(Point speed) {
		this.speed = speed;
	}

	/**
	* Returns value of weight
	* @return
	*/
	public int getWeight() {
		return weight;
	}

	/**
	* Sets new value of weight
	* @param
	*/
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	* Returns value of box
	* @return
	*/
	public Rectangle getBox() {
		return box;
	}

	/**
	* Sets new value of box
	* @param
	*/
	public void setBox(Rectangle box) {
		this.box = box;
	}

	/**
	* Returns value of zindex
	* @return
	*/
	public int getZindex() {
		return zindex;
	}

	/**
	* Sets new value of zindex
	* @param
	*/
	public void setZindex(int zindex) {
		this.zindex = zindex;
	}

}
