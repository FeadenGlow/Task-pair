public class Pair<T, R> {
    private T first;
    private R second;

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
    public static <T, R> Pair of(T first, R second){
        return  new Pair<T,R>(first, second);
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
