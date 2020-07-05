import com.pl.home.AssignValue;

public class Example {

    @AssignValue(key = "someKey")
    private String someField;

    public String getSomeField() {
        return someField;
    }
}

