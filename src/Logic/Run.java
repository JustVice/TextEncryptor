package Logic;

import UIFrame.Logo;
import UIFrame.Frame;
import PopUpMessagesDeprecated.LogoThread;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Run {

    public Run() {
        Static.data.LoadData();
        buildTxtFiles();
        runLogov2();
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    public void resetData() {
        Static.data.DeleteData();
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    private void buildTxtFiles() {
        Static.data.BuildTxtFile(Static.DataFolderPath, "USER MANUAL", USERMANUALTEXT());
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

//    private void runLogo() {
//        LogoThread lt = new LogoThread(Static.defaultTimeForLogo);
//        lt.start();
//        try {
//            lt.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    private void runLogov2() {
        Logo logo = new Logo();
    }

    public static String USERMANUALTEXT() {
        return Static.title + ". Version " + Static.version + "\n"
                + "\n"
                + "User manual.\n"
                + "1- How to create your own encrypted patron.\n"
                + "2- Separator Char.\n"
                + "3- About the author.\n"
                + "\n"
                + "------------------------------------O------------------------------------\n"
                + "\n"
                + "1 - HOW TO CREATE YOUR OWN ENCRYPTED PATRON.\n"
                + "\n"
                + "Please read all the following lines before making your own file.\n"
                + "\n"
                + "Open the Data Folder either clicking the button \"Data Folder\" or \n"
                + "going by your on. Path: " + Static.DataFolderPath + "\n"
                + "Look for a .txt file called \"characters\".\n"
                + "MAKE A COPY OF IT AND START WORKING IN THAT FILE. Everytime\n"
                + "you start the program the \"characters.txt\" file is created again\n"
                + "because of program malfunction control. If you make changes on\n"
                + "\"characters.txt\" all will be deleted next time you run the program.\n"
                + "Rename the copy of \"characters.txt\" to, for example, \"chars2.txt\";\n"
                + "you can name it with any name you want.\n"
                + "\n"
                + "Inside the file you will find all the letters of the alphabet 2 times\n"
                + "(uppercase and lowercase), some vowels with accent mark and symbols.\n"
                + "Just next of any letter/simbol you'll see an \"=\" and next to it the\n"
                + "encrypted equivalent of the letter before seen. Example:\n"
                + "\n"
                + "a=xcd;\n"
                + "\n"
                + "Syntax: LETTER=ENCRYPTEDEQUIVALENT;\n"
                + "\n"
                + "To change the encryption of the, for example, letter \"a\"\n"
                + "you only have to change the encrypted text contained between the\n"
                + "\"=\" and the \";\" with any other text that you want. Example:\n"
                + "\n"
                + "a=ExampleText;\n"
                + "\n"
                + "So, keeping in mind that \"p=www;\", \"l=awq;\", \"e=ppz;\" and the\n"
                + "Separator Char is \"°\", you will get from the word \"apple\" the\n"
                + "encryption of \"ExampleText°www°www°awq°ppz°\". Change all the \n"
                + "encrypted equivalents that you want with no length limitation.\n"
                + "\n"
                + "To load the file \"chars2.txt\":\n"
                + "1-Make sure that the chars file is inside the Data folder.\n"
                + "2-Run the program.\n"
                + "3-Go to options and seek for \"Custom Char file\".\n"
                + "4-Type the name of the edited chars file (without \".txt\") and click\n"
                + "on \"Load and save\".\n"
                + "5-You will see a \"Success!\" popup message (if it's enabled) indicating\n"
                + "that \"chars2.txt\" has been successfully loaded, saved and settled as \n"
                + "default. You will see as well the program indicating that \"chars2\" is\n"
                + "the current file of characters.\n"
                + "\n"
                + "If there is something wrong syntax inside your file, the program \n"
                + "will crash, close, and will set the default characters next time \n"
                + "you start the program.\n"
                + "\n"
                + "If the file is not at the correct path or you have mistaken the name \n"
                + "of the file, there will appear a error message.\n"
                + "\n"
                + "RULES OF THE CHARACTERS FILE, not following the next rules will result\n"
                + "in program malfunction:\n"
                + "\n"
                + "- DO NOT CHANGE THE SYNTAX OF \"letter=encrypt;\". If there is a missing\n"
                + "\"=\", \";\", letter or encrypted equivalent it will result in a program crash.\n"
                + "\n"
                + "- Do not leave a space between two different syntaxes settings. Example:\n"
                + "\"a=abc; b=cvb;c=kei;\". It must be like: \"a=abc;b=cvd;c=kei;\". \n"
                + "Not doing so will result in a program crash.\n"
                + "\n"
                + "- Do not leave a space at the beginning or at the end of the txt file.\n"
                + "There shouldn't be any space. If it is so, it will result in a program crash.\n"
                + "\n"
                + "-After reading the previus rule, you may wonder of a syntax letter that appears as\n"
                + "\" = ;\". That's the syntax to encrypt the space (\" \"). You can encrypt the space,\n"
                + "though. Example: \" =spaceExample;\".\n"
                + "\n"
                + "Take in consideration: \n"
                + "\n"
                + "1-YOU CAN ADD EVEN MORE CHARS. If there is a letter/simbol that does not exist inside\n"
                + "the file like \"&\". The program will \"encrypt\" it as \"&\". If you want to encrypt that\n"
                + "letter just follow the syntax of \"letter=EncryptedEquivalent;\" and add it at the\n"
                + "beginning/middle/end of your custom file. For example, inside the default txt \n"
                + "characters you may find: \"q=rr3;w=kks;e=ppz;r=000;t=lxm;y=nam;\" you can add it\n"
                + "as the following:\n"
                + "\n"
                + "Syntax: \"&=EncryptExample;\".\n"
                + "Structure: \"Beginning... middle... end\".\n"
                + "\n"
                + "\n"
                + "\"&=EncryptExample;q=rr3;w=kks;e=ppz;r=000;t=lxm;y=nam;\"\n"
                + "\"q=rr3;w=kks;e=ppz;r=000;&=EncryptExample;t=lxm;y=nam;&=EncryptExample;\"\n"
                + "\"q=rr3;w=kks;e=ppz;r=000;t=lxm;y=nam;&=EncryptExample;\"\n"
                + "\n"
                + "-Do not create of edit letters like them were a letter composed of two or more letters.\n"
                + "Example: \"ab=asn;\" or \"ImALetter=dm4;\". Doing so MAY result in program malfunction.\n"
                + "The program will not recognize \"ImALetter\" and encrypt it as \"dm4\". It has been\n"
                + "designed to state the first letter at the syntax as the \"Normal text\" or LightChar and\n"
                + "everything after THE FIRST LETTER as its encrypted equivalent.\n"
                + "\n"
                + "\n"
                + "- It is recommended to store your custom characters file in a safe place\n"
                + "out of Data Folder. It WILL be safe inside the Data Folder, but it is up\n"
                + "to you save a copy at other place. Remember, if you lose it, you won't be able\n"
                + "to unencrypt text without it.\n"
                + "\n"
                + "------------------------------------O------------------------------------\n"
                + "\n"
                + "2-SEPARATOR CHAR\n"
                + "\n"
                + "The default Separator Char of the program is = \"" + Static.defaultDarkCharSeparator + "\".\n"
                + "\n"
                + "The program needs a simbol or letter that allows it to difference a part of encrypted\n"
                + "text to another. For example, if \"a=abc;\", the Separator Char is \"" + Static.defaultDarkCharSeparator + "\" and you try to\n"
                + "encrypt \"aaa\" you will get: \"aaa" + Static.defaultDarkCharSeparator + "aaa" + Static.defaultDarkCharSeparator + "aaa" + Static.defaultDarkCharSeparator + ". \n"
                + "\n"
                + "It is prohibided to include the Separator Char inside \"Normal text\" because it will\n"
                + "make an incorrect morph of encrypted text to Normal Text. Even though, if you need to\n"
                + "include \"" + Static.defaultDarkCharSeparator + "\" in the text, you can change it inside the tab of options of the program with\n"
                + "whichever simbol, letter or even number you want; but you won't be able to write that \n"
                + "character at the encrypt  to box.\n"
                + "\n"
                + "It is recommended to keep the Separator Char as \"" + Static.defaultDarkCharSeparator + "\" because it is quite rarely used\n"
                + "in both Spanish or English languages.\n"
                + "\n"
                + "Take in consideration: \n"
                + "\n"
                + "-If you change the Separator Char, it will be remembered by the program. If you want\n"
                + "to reset it, you can do so at the options tab.\n"
                + "\n"
                + "-There is a log txt file called \"Separator Char changes\" inside the Data Folder where \n"
                + "you can find the changes the user have made to the Separator Char with date and hour.\n"
                + "\n"
                + "------------------------------------O------------------------------------\n"
                + "\n"
                + "3-ABOUT THE AUTHOR\n"
                + "\n"
                + "I go on Internet with the name of Just Vice.\n"
                + "I'm a person who loves to create.\n"
                + "This is just one more of my creations.";
    }

}
