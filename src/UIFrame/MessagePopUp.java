package UIFrame;

import Logic.Static;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessagePopUp extends javax.swing.JFrame implements Runnable {

    public MessagePopUp(String message) {
        setIconImage(Static.getIconImage());
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        Message.setText(message);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        this.setVisible(true);
        try {
            Thread.sleep(Static.defaultTimeForPopUpMessage);
        } catch (InterruptedException ex) {
            Logger.getLogger(MessagePopUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Message.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Message.setText("message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    // End of variables declaration//GEN-END:variables
}
