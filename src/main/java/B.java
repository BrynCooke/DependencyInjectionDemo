public class B {

    private A a;
    private String name;

    public B(A a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public String toString() {
        return "B(" + name + "," + a + ")";
    }
}
