public class G {
    private String name;
    private final A a;
    private final E e;

    public G(String name, A a, E e) {
        this.name = name;

        this.a = a;
        this.e = e;
    }

    @Override
    public String toString() {
        return "G(" + name + ", " + a + ", " + e +")";
    }
}
