package Logic;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class Static {

    public static String defaultKeysName = "DefaultKeys";
    public static Run run;
    public static TextKeeper textKeeper = new TextKeeper();
    public static String defaultDarkCharSeparator = "°";
    public static String version = "0.9.1", title = "Text Encryptor";
    public static LinkedList<Character> charactersList = new LinkedList<Character>();
    public static String folderForDataName = "TextEncryptor";
    public static String globalFolderForData = "SPLIT VICE";
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    public static Data data = new Data();
    public static String defaultKeysPath = DataFolderPath + "\\"+defaultKeysName + ".txt";
    public static int defaultTimeForPopUpMessage = 750;
    public static int defaultTimeForLogo = 1170;
    public static String logsDefaultName = "Logs";
    public static String BAR_MESSAGE = title + " " + version;

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
