package Logic;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class Static {

    public static Run run;
    public static TextKeeper textKeeper = new TextKeeper();
    public static String defaultDarkCharSeparator = "°";
    public static String version = "BETA 0.8.3", title = "Text Encrypter";
    public static LinkedList<Character> charactersList = new LinkedList<Character>();
    public static String folderForDataName = "TextEncrypter";
    public static String globalFolderForData = "Just Vice";
    public static String DataPath = System.getenv("APPDATA") + "\\"+globalFolderForData+"\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\"+globalFolderForData+"\\" + folderForDataName;
    public static Data data = new Data();
    public static String charactersTXTdefaultPath = DataFolderPath + "\\characters";
    public static String charactersTXTdefaultName = "characters";
    public static int defaultTimeForPopUpMessage = 750;
    public static int defaultTimeForLogo = 1170;
    public static String logsDefaultName = "Logs";
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
