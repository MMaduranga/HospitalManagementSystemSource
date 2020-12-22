package Controllers;

import java.io.File;


public class FileSecurity {
    
    private String strFilePath;
    private String strFilePathTxt;
    
    public FileSecurity(String strFilePath) {
        this.setFilePath(strFilePath);
    }
    
    public void setFilePath(String FilePath) {
        this.strFilePath = FilePath;
    }
    
    public String getFilePath() {
        return this.strFilePath;
    }
    
    public void setFilePathTxt(String FilePathTxt) {
        this.strFilePathTxt = FilePathTxt;
    }
    
    public String getFilePathTxt() {
        return this.strFilePathTxt;
    }
    
    public String setFilePathToTxt() {
        
        this.setFilePathTxt(this.getFilePath().split("[.]")[0] + ".txt");
        new File(this.getFilePath()).renameTo(new File(this.getFilePathTxt()));
        
        return this.getFilePathTxt();
        
    }
    
    public void setFilePathMOV() {
        new File(this.getFilePathTxt()).renameTo(new File(this.getFilePath()));
        
    }
    
   
}
