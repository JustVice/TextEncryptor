package PopUpMessages;

import Logic.Static;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PopUpThread extends Thread {

    private final String Message;
    private final int time;

    public PopUpThread(String Message, int time) {
        this.Message = Message;
        this.time = time;
    }

    @Override
    public void run() {
        if (Static.data.getUserData().isPopUpMessagesOnOff()) {
            PopUp popUp = new PopUp(Message);
            popUp.setVisible(true);
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(PopUpThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            popUp.dispose();
        }
    }

}
