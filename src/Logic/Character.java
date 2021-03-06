package Logic;

public class Character {

    private String lightChar;
    private String darkChar;

    public Character(String lightChar, String darkChar) {
        this.lightChar = lightChar;
        this.darkChar = darkChar;
    }

    @Override
    public String toString() {
        return "Character{" + "lightChar=" + lightChar + ", darkChar=" + darkChar + '}';
    }
    
    public String getLightChar() {
        return lightChar;
    }

    public void setLightChar(String lightChar) {
        this.lightChar = lightChar;
    }

    public String getDarkChar() {
        return darkChar;
    }

    public void setDarkChar(String darkChar) {
        this.darkChar = darkChar;
    }

}
