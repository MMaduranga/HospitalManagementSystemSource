
package Classes;

import java.io.File;
import javax.swing.JFileChooser;


public class SimpleMethods {
    public File fileChooser(){
      JFileChooser choosefile=new JFileChooser();
      choosefile.showOpenDialog(null);
      File file=new File(choosefile.getSelectedFile().getAbsolutePath());
      return file;
    }
}
