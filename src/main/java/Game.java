import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import objects.*;

public class Game{
/*
* Jeu
* le canvas nous sert a ajouter des écouteurs
*/
  private Canvas canvas;
  private AbstractObject obj;

  public Game(Canvas canvas){
    this.canvas = canvas;
    this.obj = new ConcreteObject(100,100,300,400,1);
  }

  public void draw(Graphics g){
    g.setColor(Color.white);
    g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    obj.draw(g); // on dessine l'objet
  }
}
