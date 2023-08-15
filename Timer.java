import java.util.concurrent.TimeUnit;

/**
 * This class represent time elapsed for each player from start to end of the game
 */
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

    /**
     * This method turns the milis of time into minute and second format
     * @return telling a player how many minutes and seconds taken for a game
     */
    public String getElapsedTime() {
        long elapsedSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
        long elapsedMinutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        return "You have finished in " + elapsedMinutes + " minutes and " + (elapsedSeconds % 60) + " seconds";
    }

    //This static method is to tie time to Player object
    public static String timeEachPlayer(){
        long elapsedSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
        long elapsedMinutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        return String.format(elapsedMinutes + "m " + (elapsedSeconds % 60) + "s");
    }
}
