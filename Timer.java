import java.util.concurrent.TimeUnit;

public class Timer {
    private static long startTime;
    private static long endTime;
    private static long elapsedTime;

    public void PlayerStartTimer(){
        startTime = System.currentTimeMillis();
    }

    public void PlayerFinishTimer() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }

    public String getElapsedTime() {
        long elapsedSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
        long elapsedMinutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        return "You have finished in " + elapsedMinutes + " minutes and " + (elapsedSeconds % 60) + " seconds";
    }

    public static String timeEachPlayer(){
        long elapsedSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
        long elapsedMinutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        return String.format(" "+ elapsedMinutes + "m " + (elapsedSeconds % 60) + "s");
    }
}
