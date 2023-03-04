package engine;

public class Game implements Runnable {

    public static Window window;
    Thread renderThread;

    public static boolean renderNext = true;
    public static boolean stepNext = true;

    public Game() {
        window = new Window("TanksMP");

        renderThread = new Thread(this);
    }

    public void runLoop() throws InterruptedException {
        while(stepNext) {


            Thread.sleep(16);
        }
    }

    public void render() throws InterruptedException {
        while(renderNext) {
            window.renderer.repaint();
            Thread.sleep(16);
        }
    }

    @Override
    public void run() {
        try {
            render();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
