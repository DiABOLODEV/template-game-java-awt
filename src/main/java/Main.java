public class Main{

  public static void main(String[] args){

    UI ui = new UI();
    Game game = new Game(ui.getCanvas());
    new Engine(ui.getStrategy(), game);

  }
}
