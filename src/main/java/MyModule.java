import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    private String name;

    public MyModule(String name) {
        this.name = name;
    }

    @Provides
    public B b(A a) {
        return new B(a, name);
    }

}
