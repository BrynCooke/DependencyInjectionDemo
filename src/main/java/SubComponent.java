import dagger.Subcomponent;

@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    G g();

    @Subcomponent.Builder
    interface Builder {

        Builder module(SubModule subModule);

        SubComponent build();
    }
}
