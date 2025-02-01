public class Main {
    public static void main(String[] args) {
        PingPongR pingpongr = new PingPongR("Ping");
        PingPongT pingpongt = new PingPongT("Pong");

        Thread tr1 = new Thread(pingpongr);
        Thread tr2 = new Thread(pingpongr);

        Thread tt1 = new Thread(pingpongt);
        Thread tt2 = new Thread(pingpongt);

        tr1.start();
        tr2.start();

        tt1.start();
        tt2.start();

        try {
            Thread.sleep(1000L);
        }catch(InterruptedException e) { }

        pingpongr.setRunning(false);
        pingpongt.setRunning(false);
    }
}
