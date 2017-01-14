import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class UI{

  private JFrame frame;
  private Canvas canvas;
  private BufferStrategy strategy;

/**
* Affichage du jeu 
*/
  public UI(){

    // Fenêtre principale
    frame = new JFrame(Config.title);

    /* La différence avec setPreferredSize c'est que le getter renvoie
     la taille actuelle de frame - si la taille change alors
     on aura des valeurs différentes*/
    JPanel panel = (JPanel) frame.getContentPane();
    panel.setPreferredSize(new Dimension(Config.width, Config.height));
    // Suppression du layout par defaut
    panel.setLayout(null);

    // Canvas qui contiendra le jeu
    canvas = new Canvas();
    canvas.setBounds(0,0,Config.width, Config.height);
    panel.add(canvas); // on ajoute notre canvas au panel

    frame.pack(); // on dimensionne la fenêtre en fonction du contenu
    frame.setResizable(false); // pas redimensionnable
    // Qu'est ce qu'il arrive si on ferme la fenêtre
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    // Aprés avoir ajouté le canvas ? TODO pk ?
    canvas.requestFocus(); // Pour les listeners directement sur le canvas
    canvas.createBufferStrategy(2); // Pour gérer au mieux les graphiques
    strategy = canvas.getBufferStrategy();
    canvas.setIgnoreRepaint(true); // On va gérer le repaint

    /* test
    Graphics g = strategy.getDrawGraphics();
    g.setColor(Color.pink);
    g.fillRect(0,0,Config.width, Config.height);
    g.dispose();
    strategy.show();*/
  }


	/**
	* Returns value of frame
	* @return
	*/
	public JFrame getFrame() {
		return frame;
	}

	/**
	* Returns value of canvas
	* @return
	*/
	public Canvas getCanvas() {
		return canvas;
	}

	/**
	* Returns value of strategy
	* @return
	*/
	public BufferStrategy getStrategy() {
		return strategy;
	}

}
