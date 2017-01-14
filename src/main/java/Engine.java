import java.awt.image.BufferStrategy;

public class Engine{

  private BufferStrategy screen;
  private Game game;

  public Engine(BufferStrategy screen, Game game){
    this.screen = screen;
    this.game = game;

    this.loop();
  }
  /*
  * Boucle de jeu
  */
  private void loop(){
    while(true){
      game.draw(screen.getDrawGraphics());
      screen.getDrawGraphics().dispose();
      screen.show();
      try{
        Thread.sleep(1000/Config.fps); // ms
      }
      catch(InterruptedException e){
        System.out.println(Config.ex_engine_interrupted);
      }
    }
  }
}
