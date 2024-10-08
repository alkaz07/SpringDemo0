package functions;

public class Manager {
    public Context getContext1(){
        Context context= new Context();
        context.watchman = new Watchman("Иванов");
        context.park = new Park(1);
        context.watchman.setPark(context.park);
        context.park.setWatchman(context.watchman);
        return context;
    }

    public Context getContext2(){
        Context context= new Context();
        context.watchman = new Watchman("Петров");

        context.park = new Park(2);
        context.watchman.setPark(context.park);
        context.park.setWatchman(context.watchman);
        return context;
    }
}
