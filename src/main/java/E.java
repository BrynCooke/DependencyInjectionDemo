import javax.inject.Inject;

public class E {
    private final B b;
    private final C c;

    @Inject
    public E(B b, C c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "E(" + b + ", " + c + ")";
    }
}
