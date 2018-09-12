public class Main {
    public static void main(String[] args) {

        MyComponent component = DaggerMyComponent.builder().myModule(new MyModule("Dobby")).build();

        D d = component.d();

        System.out.println(d);

    }
}
