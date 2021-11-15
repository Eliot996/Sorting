public class Ball  implements Comparable{
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random()*16));
    }

    public Ball(int brightness) {
        this.brightness = brightness%16;
    }

    public boolean brighterThan(Ball otherBall) {
        if(otherBall.brightness < this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }

    public int compareTo(Object o) {
        Ball otherBall = (Ball) o;
        return this.brightness - otherBall.brightness;
    }
}
