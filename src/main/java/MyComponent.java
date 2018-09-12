import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent {

    D d();
}
