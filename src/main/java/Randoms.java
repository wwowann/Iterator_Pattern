import java.util.Iterator;

import static java.lang.Math.random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;

    }

    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }

    protected static class RandomsIterator implements Iterator<Integer> {
        protected Randoms randoms;

        public RandomsIterator(Randoms randoms) {
            this.randoms = randoms;
        }

        public boolean hasNext() {
            return randoms != null;
        }

        public Integer next() {

            if (hasNext()) return randoms.valueRandom(randoms.min, randoms.max);
            return null;
        }

        public void remove() {

        }
    }

    public int valueRandom(int min, int max) {
        return (int) (random() * (max - min)) + min + 1;
    }
}

