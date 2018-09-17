import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SubComponent.class)
public class TopLevelModule {

    private String name;

    public TopLevelModule(String name) {
        this.name = name;
    }

    @Provides
    public B b(A a) {
        return new B(a, name);
    }

}
