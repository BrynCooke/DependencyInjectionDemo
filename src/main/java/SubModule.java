import dagger.Module;
import dagger.Provides;

@Module
public class SubModule {

    private String name;

    public SubModule(String name) {
        this.name = name;
    }

    @Provides
    public G g(A a, E e) {
        return new G(name, a, e);
    }
}
