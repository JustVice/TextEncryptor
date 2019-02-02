package Logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private final long serialVersionUID = 2883991000023476147L;
    private String keysName = Static.defaultKeysName;
    private String DarkCharSeparator = Static.defaultDarkCharSeparator;
    private boolean saveLogs = false;
    private boolean copyToClipboardEncrypt = true;
    private boolean copyToClipboardUnencrypt = true;
    private boolean PopUpMessagesOnOff = true;
    private boolean showStartLogo = true;

    public UserData() {
    }

    public String getKeysName() {
        return keysName;
    }

    public void setKeysName(String keysName) {
        this.keysName = keysName;
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

    public boolean isShowStartLogo() {
        return showStartLogo;
    }

    public void setShowStartLogo(boolean showStartLogo) {
        this.showStartLogo = showStartLogo;
    }

}
