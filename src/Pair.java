public class Pair<T, R> {
    T first;
    R second;
    Pair pair;

    private Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }
    public static Pair of(int first, String second){
        return  new Pair(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pair p = (Pair) obj;
        return first == p.first
                && second.equals(p.second);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + first.hashCode();
        result = prime * result + second.hashCode();
        return result;
    }

}
