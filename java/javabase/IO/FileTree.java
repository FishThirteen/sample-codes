import java.io.*;

public class FileTree {

    public static void main(String args[]) {
        File dir;
        String rootPath = ".";
        if (args.length >= 1) {
            rootPath = args[0];
        }

        dir = new File(rootPath);

        try {
            if (!dir.getCanonicalFile().isDirectory()) {
                 dir = dir.getParentFile();
            }

        } catch (IOException ex) {
        }



        
        recursivelyTraverse(dir, 0);
    }

    public static void recursivelyTraverse(File dir, int indent) {

        printFileName(dir, indent);

        File[] files = dir.listFiles(new FilenameFilter() {
            public boolean  accept(File innerDir, String name) {
                try {
                    return !innerDir.getCanonicalFile().isDirectory();
                }  catch (IOException ex) {
                }
                return false;
            }
        });

        File[] directories = dir.listFiles(new FilenameFilter() {
            public boolean accept(File innerDir, String name) {
                try {
                    return innerDir.getCanonicalFile().isDirectory();
                } catch (IOException ex) {
                    
                }

                return false;
            }
        });
 
        if (directories != null) {

            for (File directory : directories) {
                recursivelyTraverse(directory, indent + 2);
            }
        }
 
        if (files != null) {
            for (File f : files) {
                printFileName(f, indent + 2);
            }
        }
 
    }


    public static void printFileName(File file, int indent) {
        StringBuilder sb = new StringBuilder(40);
        for (int i = 0; i < indent; i++) {
            sb.append(" ");
        }

        sb.append(file.getName());
        sb.append("\n");

        System.out.printf("%.80s", sb.toString());
    }


}

