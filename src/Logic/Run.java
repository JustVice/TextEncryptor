package Logic;

import UIFrame.Logo;
import UIFrame.Frame;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Run {

    public Run() {
        Static.data.LoadData();
        buildManual();
        if (Static.data.getUserData().isShowStartLogo()) {
            runLogov2();
        }
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    public void resetData() {
        Static.data.DeleteData();
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    private void buildManual() {
        Static.data.BuildTxtFile(Static.DataFolderPath, "USER MANUAL", Static.textKeeper.USERMANUALTEXT());
    }

    public boolean prohibitedCharCheck(String str) {
        String str1 = str;
        StringBuilder sb = new StringBuilder(str);
        boolean boo = true;/*true means that theres no Special Char presence */
        for (int i = 0; i < str1.length(); i++) {
            if (sb.charAt(0) == Static.data.getUserData().getDarkCharSeparator().charAt(0)) {
                boo = false;
                JOptionPane.showMessageDialog(null, "Sorry, \"" + Static.data.getUserData().getDarkCharSeparator() + "\" is not allowed.", "Special Char precense", 0);
                break;
            } else {
                sb.deleteCharAt(0);
            }
        }
        return boo;
    }

    private void runLogov2() {
        Logo logo = new Logo();
    }

    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

    public String generateID() {
        String str = "";
        int n = 0;
        int random = 0;
        random = (int) (Math.random() * 10000);
        str = "" + random + randomLetter() + (int) (Math.random() * 1000);
//        System.out.println("Random generated: " + str);
        return str;
    }

    private String randomLetter() {
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "O", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Z", "X", "Y"};
        String result = "";
        int randomLetterIndex = 0;
        while (true) {
            randomLetterIndex = ((int) (Math.random() * 100));
            if (randomLetterIndex <= 25) {
                break;
            }
        }
        result = alfabeto[randomLetterIndex];
        return result;
    }

    private boolean IsRegexMatch(String regex, String text) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
            return true;
        }
        return false;
    }

    private boolean keysSyntaxCheck() {

        return true;
    }

    //Opens a link on the internet browser
    public static void openLink(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
