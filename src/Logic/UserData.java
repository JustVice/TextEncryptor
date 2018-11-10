package Logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private final long serialVersionUID = 2883991000023476147L;
    private String txtFileWithCharactersDefaultNameUserData = "characters";
    private String DarkCharSeparator = Static.defaultDarkCharSeparator;
    private boolean saveLogs = false;
    private boolean copyToClipboardEncrypt = true;
    private boolean copyToClipboardUnencrypt = true;
    private boolean PopUpMessagesOnOff = true;

    public UserData() {
    }

    public String getTxtFileWithCharactersDefaultNameUserData() {
        return txtFileWithCharactersDefaultNameUserData;
    }

    public void setTxtFileWithCharactersDefaultNameUserData(String txtFileWithCharactersDefaultName) {
        this.txtFileWithCharactersDefaultNameUserData = txtFileWithCharactersDefaultName;
    }

    public String getDarkCharSeparator() {
        return DarkCharSeparator;
    }

    public void setDarkCharSeparator(String DarkCharSeparator) {
        this.DarkCharSeparator = DarkCharSeparator;
    }

    public boolean isSaveLogs() {
        return saveLogs;
    }

    public void setSaveLogs(boolean saveLogs) {
        this.saveLogs = saveLogs;
    }

    public boolean isCopyToClipboardEncrypt() {
        return copyToClipboardEncrypt;
    }

    public void setCopyToClipboardEncrypt(boolean copyToClipboardEncrypt) {
        this.copyToClipboardEncrypt = copyToClipboardEncrypt;
    }

    public boolean isCopyToClipboardUnencrypt() {
        return copyToClipboardUnencrypt;
    }

    public void setCopyToClipboardUnencrypt(boolean copyToClipboardUnencrypt) {
        this.copyToClipboardUnencrypt = copyToClipboardUnencrypt;
    }

    public boolean isPopUpMessagesOnOff() {
        return PopUpMessagesOnOff;
    }

    public void setPopUpMessagesOnOff(boolean PopUpMessagesOnOff) {
        this.PopUpMessagesOnOff = PopUpMessagesOnOff;
    }
    
    

}