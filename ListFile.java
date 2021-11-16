import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ListFile {

    public File[] ThisFile(String inputPath){

        File directoryPath = new File(inputPath);
        File[] contents = directoryPath.listFiles();
        return contents;

    }

    public void SearchFiles(File[] Files, String SearchString){

        StrCmp Compare = new StrCmp();
        SimpleDateFormat Date = new SimpleDateFormat();
        if(Files != null){
            for (File current : Files){
                if(current.isDirectory()){
                    SearchFiles(ThisFile(current.getAbsolutePath()), SearchString);
                }else{
                    if (Compare.Cmp(SearchString.toLowerCase(), current.getName().toLowerCase()) > 0.5){
                        System.out.println("Found: " + current.getPath());
                        System.out.println("Size: " + Size(current.length()));
                        System.out.println("Last Modified: " + Date.format(current.lastModified()));
                        System.out.println("Parent: " + current.getParent());
                        // try {
                        //     Desktop.getDesktop().open(current);
                        // } catch (IOException e) {
                        //     e.printStackTrace();
                        // }
                    }
                }
            }
        }
    }

    public String Size(double numBytes){

        double FileSize = 1024.0;
        int i;
        for(i = 4; i >= 1; i--){
            if(numBytes / Math.pow(FileSize, i) >= 1){
                FileSize = numBytes / Math.pow(FileSize, i);
                break;
            }
        }
        
        final String[] units = { "bytes", "KB", "MB", "GB", "TB" };
        String unit = units[i];

        if(numBytes < 1024){
            FileSize = numBytes;
        }

        return String.format("%.4f", FileSize) + " " + unit;
    }


}