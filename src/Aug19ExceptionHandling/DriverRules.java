package Aug19ExceptionHandling;

public class DriverRules {

    int age;
    String name;

    public void votingAge(int age) throws AgeLimitException {
        if (age<18) throw new AgeLimitException("UnderAge");
    }
}
