import javax.inject.Inject;

public class D {
    private final A a;
    private final C c;
    private final F f;

    @Inject
    public D(A a, C c, F f) {


        this.a = a;
        this.c = c;
        this.f = f;
    }

    @Override
    public String toString() {
        return "D(" + a + ", " + c + ", " + f + ")";
    }
}
