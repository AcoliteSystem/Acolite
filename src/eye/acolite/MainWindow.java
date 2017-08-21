/*
 * MainWindow.java
 *
 */

package eye.acolite;

import java.awt.Image;

/**
 * The main window is not a JFrame, but a JDialog, because dialogs are not
 * shown in the Windows taskbar.
 * @author  Bernhard Jenny, Institute of Cartography, ETH Zurich.
 */
public class MainWindow extends javax.swing.JDialog {
    
    private eye.acolite.ImageDisplayWithPanel imageDisplayWithPanel;

    /** Creates new form MainWindow */
    public MainWindow(java.awt.Frame parent, boolean modal, Acolite acolite) {
        super(parent, modal);
        
        this.setUndecorated(true);
        this.setResizable(false);
        
        // add a component to display the image.
        imageDisplayWithPanel = new ImageDisplayWithPanel(acolite);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        getContentPane().add(imageDisplayWithPanel, java.awt.BorderLayout.CENTER);

        pack();
    }
    
    /**
     * Set the image to display.
     */
    public void setImage(Image image) {
        this.imageDisplayWithPanel.setImage(image);
        this.validate();
        this.pack();
    }
    
    Image getImage() {
        return this.imageDisplayWithPanel.getImage();
    }
    
    /**
     * Set the image panel to draw over the image set by setImage().
     */
    public void setPanel(Image panel) {
        this.imageDisplayWithPanel.setPanel(panel);
        this.repaint();
    }
    
}