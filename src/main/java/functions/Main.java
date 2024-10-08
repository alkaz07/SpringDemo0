package functions;

public class Main {
    public static void main(String[] args) {
        example0();
    }

    private static void example0() {
        Manager m = new Manager();
        Context context = m.getContext2();

        Park p = context.getPark();
        System.out.println("p = " + p);
        Watchman w = context.getWatchman();
        System.out.println("w = " + w);

        p.doNoise();
        p.walkOnTheGrass();
    }
}