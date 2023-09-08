package Aug19ExceptionHandling;

public class DriverMain {
    public static void main(String[] args) throws AgeLimitException {

        DriverRules driverRules = new DriverRules();

        driverRules.votingAge(21);

    }
}
