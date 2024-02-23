package groupname.util;


public class BasicCounter implements Counter {
    int count;
    int start;

    public BasicCounter(int start) {
        this.count = start;
        this.start = start;
    }

    public BasicCounter() {
        this.count = 0;
        this.start = 0;
    }

    public void increment()  {
        count++;
    }

    public void reset() {
        count = start;
    }

    public String toString() {
        return "[" + count + "]";
    }

    public int get() {
        return count;
    }
}
