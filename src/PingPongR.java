public class PingPongR implements Runnable {
    private boolean running;
    private String PingPong;
    public PingPongR(String PingPong) {
        this.PingPong = PingPong;
        this.running = true;
    }
    @Override
    public void run() {
        while(running) {
            System.out.println(this.PingPong);
        }
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
}
