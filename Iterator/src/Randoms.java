import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int a;
    private int b;
    private Random random = new Random();


    public Randoms(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return a + random.nextInt(b - a + 1);
            }
        };
    }
}
