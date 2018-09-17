import org.junit.Test;

public class TestComponents {
    @Test
    public void testSingleComponent() {

        TopLevelComponent component = DaggerTopLevelComponent.builder().topLevelModule(new TopLevelModule("Dobby")).build();

        D d = component.d();

        System.out.println(d);

    }


    @Test
    public void testNestedComponent() {

        TopLevelComponent component = DaggerTopLevelComponent.builder().topLevelModule(new TopLevelModule("Dobby")).build();

        SubComponent golumnSubComponent = component.subComponentBuilder().module(new SubModule("Golumn")).build();

        G golumn = golumnSubComponent.g();
        System.out.println(golumn);

        SubComponent yodaSubComponent = component.subComponentBuilder().module(new SubModule("Yoda")).build();
        G yoda = yodaSubComponent.g();
        System.out.println(yoda);



    }
}
