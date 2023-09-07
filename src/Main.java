public class Main {

    public static void main(String[] args) {
        System.out.println(add(2, 3)); //should return 5
        System.out.println(add(1, 2, 3, 4)); //should return 10
        System.out.println(morningGreeting("me")); //should return "早上好,  me!"
        System.out.println(afternoonGreeting("me")); //should return "下午好,  me!“
        System.out.println(triple("what?")); //should return "what?what?what?"
        System.out.println(half(5)); //should return 2.5
        System.out.println(roundNegativeValueToNearestInteger(-3.4)); //should return -3
        System.out.println(roundPositiveValueToNearestInteger(3.14)); //should return 3

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
