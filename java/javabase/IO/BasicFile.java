import java.io.*;
import java.util.regex.*;

public class BasicFile {
    public static void main(final String argv[]) {
        File f = new File(".");
        
        String [] files;
        if (argv.length < 1) {
            files = f.list();
        }
        else {
            files = f.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(argv[0]);

                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }


            });
            
        }
            
        

        for (String fileName : files) {
            System.out.printf("%s \n", fileName);
        }
    }
}
