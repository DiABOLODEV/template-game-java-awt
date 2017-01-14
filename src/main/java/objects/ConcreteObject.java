package objects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ConcreteObject extends AbstractObject implements KeyListener{


  public ConcreteObject(int x, int y, int width, int height, int zindex){
    super(x,y,width,height,zindex);
  }


/* Key listener */

  public void keyPressed(KeyEvent arg0) {

    if(arg0.getKeyCode() == KeyEvent.VK_LEFT){

    }
    else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){

    }
    else if(arg0.getKeyCode() == KeyEvent.VK_UP){

    }
    else if(arg0.getKeyCode() == KeyEvent.VK_DOWN){

    }

  }

  public void keyReleased(KeyEvent arg0) {

  }

  public void keyTyped(KeyEvent arg0) {

  }



}
