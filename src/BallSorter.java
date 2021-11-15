import java.util.Arrays;

public class BallSorter {

    public void start() {
        Ball[] balls = new Ball[10];
        for(int i=0; i < balls.length; i++) {
            balls[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(balls));
        Arrays.sort(balls);
        System.out.println("Efter sortering: " + Arrays.toString(balls));
    }

    public static void main(String[] args) {
        BallSorter app = new BallSorter();
        app.start();
    }
}
