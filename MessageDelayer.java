public class MessageDelayer {
    private static final int delayed= 1000;

    public static void waiting() {
        try {
            Thread.sleep(delayed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPress Enter to continue...");
        System.console().readLine();
    }
}
