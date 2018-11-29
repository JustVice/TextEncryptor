 package PopUpMessagesDeprecated;

import UIFrame.Logo;
import UIFrame.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogoThread extends Thread {

    private int time;

    public LogoThread(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        Logo logo = new Logo();
        logo.setVisible(true);
        try {
            Thread.sleep(time);
            logo.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(LogoThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
