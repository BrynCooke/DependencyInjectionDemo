import javax.inject.Inject;

public class F {

    private B b;

    @Inject
    public F(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "F(" + b + ")";
    }
}
