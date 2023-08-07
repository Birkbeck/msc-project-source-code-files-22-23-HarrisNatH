/**
 * This class is responsible to print out bordered to a String
 */
public class FrameBorder {
    
    /**
     * This method prints out a border with title in middle
     */
    public static void printTitleIntro() {
        String title = "PERSONALITY TEST IF GAME";
        int titleLength = title.length();

        int frameWidth = titleLength + 6;
        String frameLine = "*".repeat(frameWidth);

        System.out.println(frameLine);
        System.out.println("*" + " ".repeat(frameWidth - 2) + "*");
        System.out.println("*  " + title + "  *");
        System.out.println("*" + " ".repeat(frameWidth - 2) + "*");
        System.out.println(frameLine);
    }

    /**
     * This method prints out a line to the top and bottom of the given response.
     */
    public static void printResponse(String response) {
        int responseLength = response.length();

        int lineWidth = responseLength + 6;
        String singleLine = "-".repeat(lineWidth);

        System.out.println(singleLine);
        System.out.println(response);
        System.out.println(singleLine);
    }
}
