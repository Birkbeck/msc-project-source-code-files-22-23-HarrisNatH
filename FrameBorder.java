public class FrameBorder {

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

    public static void printResponse(String response) {
        int titleLength = response.length();

        int frameWidth = titleLength + 6;
        String frameLine = "-".repeat(frameWidth);

        System.out.println(frameLine);
        System.out.println(response);
        System.out.println(frameLine);
    }
}
