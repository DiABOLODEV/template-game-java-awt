package objects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ConcreteObject extends AbstractObject {


  public ConcreteObject(int x, int y, int width, int height, int zindex){
    super(x,y,width,height,zindex);
    System.out.println("ConcreteObject created");
  }


/* Key listener */

  public void keyPressed(KeyEvent arg0) {

    if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
      position.x--;
    }
    else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
      position.x++;
    }
    else if(arg0.getKeyCode() == KeyEvent.VK_UP){
      position.y--;
    }
    else if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
      position.y++;
    }

  }

  public void keyReleased(KeyEvent arg0) {

  }

  public void keyTyped(KeyEvent arg0) {

  }



}
