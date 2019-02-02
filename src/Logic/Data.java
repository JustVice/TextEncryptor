package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Data {

    private UserData userData = new UserData();

    /**
     * Fills the list_dir with the current data storaged on hard drive, also the
     * data will be saved and loaded from a folder.
     */
    public void LoadData() {
        globalDir();
        dirFiles(Static.folderForDataName);
        File path = new File(Static.DataPath);
        if (!path.exists()) {
            try {
                BuildTxtFile(Static.DataFolderPath, Static.defaultKeysName, Static.textKeeper.defaultKeysDistribution());
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Static.DataPath));
                writeFile.writeObject(userData);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error creating data file.");
                e.printStackTrace();
            }
        } else {
            try {
                System.out.print("loading data... ");
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(Static.DataPath));
                userData = (UserData) getFile.readObject();
                System.out.println("success");
            } catch (IOException localIOException1) {
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        }
        LoadKeys(Static.DataFolderPath + "\\" + Static.data.getUserData().getKeysName());
    }

    private void programNotCompatible() {
        String message = "The program is not currently compatible with your system.\nSupported systems: Windows 7\\8\\8.1\\10.";
        JOptionPane.showMessageDialog(null, message, "NOT COMPATIBLE", 0);
        System.exit(0);
    }

    /**
     * Updates the data file with the new info that user provided and stored on
     * the LinkedList.
     */
    public void updateInfo() {
        File path = new File(Static.DataPath);
        if (path.exists()) {
            try {
                System.out.print("saving data... ");
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Static.DataPath));
                writeFile.writeObject(userData);
                writeFile.close();
                Static.charactersList.clear();
                LoadKeys(Static.DataFolderPath + "\\" + Static.data.userData.getKeysName());
                System.out.println("success");
            } catch (IOException e) {
                System.out.println("Error updating data");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    public UserData getUserData() {
        return userData;
    }

    public void DeleteData() {
        userData = new UserData();
        updateInfo();
    }

    private void dirFiles(String folderName) {
        String path = System.getenv("APPDATA") + "\\"+Static.globalFolderForData+"\\" + folderName;
        File file = new File(path);
        if (!file.exists()) {
            boolean created = file.mkdir();
            if (created) {
                System.out.println("Folder on AppData created...");
            } else {
                programNotCompatible();
            }
        }
    }

    public void createDir(String pathName, String folderName) {
        File file = new File(pathName + "\\" + folderName);
        file.mkdir();
    }

    public void BuildTxtFile(String path, String txtFileName, String content) {
        /*"\r\n" to jump between lines*/
        File file = new File(path + "\\" + txtFileName + ".txt");
        try {
            String frase = content;
            if (frase.equals("")) {
                frase = "No content.";
            }
            FileWriter escritura = new FileWriter(file.getPath());
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error\n" + ex);
        }
    }
    
    
    private boolean LoadKeys(String pathName) {
        try {
            File file = new File(pathName + ".txt");
            FileReader entrada;
            if (file.exists()) {
                System.out.println("Keys loaded");
                entrada = new FileReader(pathName + ".txt");
            } else {
                System.out.println("keys not found. Default keys loaded");
                BuildTxtFile(Static.DataFolderPath, Static.defaultKeysName, Static.textKeeper.defaultKeysDistribution());
                Static.data.getUserData().setKeysName(Static.defaultKeysName);
                Static.data.updateInfo();
                entrada = new FileReader(Static.defaultKeysPath);
            }
            BufferedReader buffer = new BufferedReader(entrada);
            String linea = "";
            while (linea != null) {
                linea = buffer.readLine();
                if (linea != null) {
                    StringBuilder sb = new StringBuilder(linea);
                    String lightChar = linea.charAt(0) + "", darkChar = "";
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    while (true) {
                        try {
                            if (sb.charAt(0) != ';') {
                                darkChar += sb.charAt(0) + "";
                                sb.deleteCharAt(0);
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("PROGRAM MALFUNCTION");
                            String str = "Custom char name: " + Static.data.getUserData().getKeysName()+ "\n"
                                    + "Your custom char file has a wrong syntax. Please follow the instructions inside\n"
                                    + "the user manual and review syntax.\nThe program will set the default characters and close now.";
                            JOptionPane.showMessageDialog(null, str, "WRONG SYNTAX", 0);
                            Static.data.getUserData().setKeysName(Static.defaultKeysName);
                            Static.data.updateInfo();
                            System.exit(0);
                        }

                    }
                    Static.charactersList.add(new Character(lightChar, darkChar));
                }
            }
            entrada.close();
            buffer.close();
        } catch (IOException ex) {
            System.out.println("File does not exist.");
            BuildTxtFile(Static.DataFolderPath, Static.defaultKeysName, Static.textKeeper.defaultKeysDistribution());
            LoadKeys(Static.defaultKeysPath);
//            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean verifyCustomCharsTxt(String str) {
        File file = new File(Static.DataFolderPath + "\\" + str + ".txt");
        if (file.exists()) {
            System.out.println("File " + str + "exists.");
        } else {
            System.out.println("File " + str + "does not exists.");
        }
        return file.exists();
    }
    
    private void globalDir() {
        String path = System.getenv("APPDATA") + "\\" + Static.globalFolderForData;
        File file = new File(path);
        if (!file.exists()) {
            boolean created = file.mkdir();
            if (created) {
                System.out.println("Global data folder on AppData created...");
            } else {
                programNotCompatible();
            }
        }
    }
    
}
