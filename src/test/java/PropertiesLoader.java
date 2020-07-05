import com.pl.home.ValueReplacer;
import org.junit.Test;

public class PropertiesLoader {

    @Test
    public void loaderTest() throws IllegalAccessException {
        Example example = new Example();
        System.out.println("Field value Before reflection " + example.getSomeField());
        ValueReplacer vr = new ValueReplacer();
        vr.replaceValue(example);
        System.out.println("Field value After reflection " + example.getSomeField());
    }
}

