package file_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIoLecture
{
    public static void main(String[] args)
    {
        Path path = Paths.get("src");
        System.out.println(path);

        Path pathToThisFile = Paths.get("src/file_io", "FileIoLecture");
        System.out.println(pathToThisFile);
    }
}
