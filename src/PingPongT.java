public class PingPongT extends Thread {
    private String PingPong;
    private boolean running;

    public PingPongT(String PingPong) {
        this.PingPong = PingPong;
        this.running = true;
    }
    @Override
    public void run() {
        while(running) {
            System.out.println(this.PingPong);
            try {
                Thread.sleep(500L); // Verlangsamt Schleife (sleep, pausiert für 500 ms)
            }catch (InterruptedException e) {}
        }
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
}