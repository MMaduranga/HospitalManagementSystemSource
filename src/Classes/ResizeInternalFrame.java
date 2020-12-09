
package Classes;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JDesktopPane;

//ResizeInternalFrame.java
public class ResizeInternalFrame{
  
    public ResizeInternalFrame(javax.swing.JInternalFrame internalFrame, JDesktopPane jDesktopPane1) {//to create resizeable j internal frames
      jDesktopPane1.setOpaque(true);
        
        internalFrame.setSize(jDesktopPane1.getSize());
        
        jDesktopPane1.addComponentListener(new ComponentListener() {
            public void componentResized(ComponentEvent e) {
                
                internalFrame.setSize(jDesktopPane1.getSize());
            }
            
            public void componentMoved(ComponentEvent e) {
            }
            
            public void componentShown(ComponentEvent e) {
            }
            
            public void componentHidden(ComponentEvent e) {
            }
        });
        
        jDesktopPane1.add(internalFrame).setVisible(true);
     
    }
}
