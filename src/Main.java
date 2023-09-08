public class Main {

    public static void main(String[] args) {
        int add2 = add(2, 5);
        System.out.println(add2); //should print 7

        int add4 = add(1, 2, 3, 4);
        System.out.println(add4); //should print 10

        String morning = morningGreeting("me");
        System.out.println(morning); //should print "早上好,  me!"

        String afternoon = afternoonGreeting("me");
        System.out.println(afternoon); //should print "下午好,  me!“

        String what = triple("what");
        System.out.println(what); //should print "what?what?what?"

        double halfed = half(5);
        System.out.println(halfed); //should print 2.5

        int roundedNegative = roundNegativeValueToNearestInteger(-3.4);
        System.out.println(roundedNegative); //print return -3

        int roundedPositive = roundPositiveValueToNearestInteger(3.14);
        System.out.println(roundedPositive); //print return 3

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
