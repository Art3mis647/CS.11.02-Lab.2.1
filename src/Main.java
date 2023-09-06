public class Main {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));

    }

    public static String morningGreeting(String greetedPerson) {
        return "早上好, " + greetedPerson + "!";
    }
    public static String afternoonGreeting(String greetedPerson) {
        return "下午好, " + greetedPerson + "!";
    }

    public static String triple(String thingToTriple) {
        String doubled = new String(thingToTriple + thingToTriple);
        return doubled + thingToTriple;

    }

    public static double half(int thingToHalf) {
        double doubled = thingToHalf;
        return doubled/2;

    }
    public static int roundPositiveValueToNearestInteger(double thingToRound) {
        thingToRound = thingToRound + 0.5;
        int inted = (int)thingToRound;
        return inted;
    }

    public static int roundNegativeValueToNearestInteger(double thingToRound) {
        thingToRound = thingToRound - 0.5;
        int inted = (int)thingToRound;
        return inted;

    }
}
