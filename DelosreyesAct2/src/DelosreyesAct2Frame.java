import java.awt.*;
import java.awt.event.*;

/**
 * Sample application using Frame.
 *
 * @author 
 * @version 1.00 19/08/14
 */
public class DelosreyesAct2Frame extends Frame {
    
    /**
     * The constructor.
     */  
     public DelosreyesAct2Frame() {
                
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu();
        MenuItem menuFileExit = new MenuItem();
        
        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");
        
        // Add action listener.for the menu button
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    DelosreyesAct2Frame.this.windowClosed();
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("DelosreyesAct2");
        setMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    DelosreyesAct2Frame.this.windowClosed();
                }
            }
        );  
    }
    
    
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
    	
    	// TODO: Check if it is safe to close the application
    	
        // Exit application.
        System.exit(0);
    }
}