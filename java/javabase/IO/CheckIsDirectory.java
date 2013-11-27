import java.io.*;

public class CheckIsDirectory {
    public static void main(String args[]) {
        File file = new File("~/Documents");

        File[] files = file.listFiles();

        if (files == null) {
            System.out.println("Files is null.");
        }

        for (File tempFile : files) {
            System.out.printf("%s  is %s\n", tempFile.getName(), getFileTypeString(tempFile));
        }
    }

    public static String getFileTypeString(File file) {
        if (file.isDirectory()) {
            return "directory";
        }

        return "normal file";

    }

}
