package Controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ChangeFileDestination {

    public void copydir(File sourceFile, File duplicateFile) {

        try {
            if (sourceFile.isDirectory()) {// if directory not exists, create it
                if (!duplicateFile.exists()) {
                    duplicateFile.mkdir();
                }
                // list all the directory contents
                String files[] = sourceFile.list();

                for (String fileName : files) {
                    // construct the src and dest file structure
                    File srcFile = new File(sourceFile, fileName);
                    File destFile = new File(duplicateFile, fileName);
                    // recursive copy
                    copydir(srcFile, destFile);
                }

            } else {
                // If file, then copy it
                try {

                    InputStream in = null;
                    OutputStream out = null;

                    try {
                        // If file, then copy it
                        in = new FileInputStream(sourceFile);
                        out = new FileOutputStream(duplicateFile);

                        byte[] buffer = new byte[1024];

                        int length;
                        // Copy the file content in bytes
                        while ((length = in.read(buffer)) > 0) {
                            out.write(buffer, 0, length);
                        }

                    } finally {
                        if (in != null) {
                            in.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    }
                } catch (IOException e) {
                }
            }
        } catch (Exception e) {
        }
    }

}
