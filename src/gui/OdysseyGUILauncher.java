package gui;

import javax.swing.*;

class OdysseyGUILauncher {

    /**
     * Runs the program.
     */
    public static void main(String[] args) {
        OdysseyGUI log = new OdysseyGUI();
        SwingUtilities.invokeLater(log);
    }
}
