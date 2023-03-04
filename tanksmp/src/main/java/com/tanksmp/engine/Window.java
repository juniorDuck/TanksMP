package engine;
import javax.swing.JFrame;

public class Window extends JFrame {

	public Renderer renderer;

	public static int DEFAULT_WINDOW_WIDTH = 900;
	public static int DEFAULT_WINDOW_HEIGHT = 900;

	public Window(String name) {
		super(name);
		initialize();
	}

	public void initialize() {
		renderer = new Renderer();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
		setVisible(true);
	}

}
