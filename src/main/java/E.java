public class E {
    private final B b;
    private final C c;

    public E(B b, C c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "E(" + b + ", " + c + ")";
    }
}
