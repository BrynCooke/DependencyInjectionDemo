import dagger.Component;

@Component(modules = TopLevelModule.class)
public interface TopLevelComponent {

    D d();

    SubComponent.Builder subComponentBuilder();
}
