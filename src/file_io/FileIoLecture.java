package file_io;

import java.io.IOException;
//import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileIoLecture
{

    public static void readFileAndOutput(Path pathToFile)
    {
        List<String> lines = new ArrayList<>();
        try
        {
            lines = Files.readAllLines(pathToFile);
        }
        catch (IOException iox)
        {
            iox.printStackTrace();
        }

        for(String line : lines)
        {
            System.out.println(line);
        }
    }

    public static void main(String[] args)
    {
//        Path path = Paths.get("src");
//        System.out.println(path);
//
//        Path pathToThisFile = Paths.get("src/file_io", "FileIoLecture");
//        System.out.println(pathToThisFile);
        Path dataDirecteory = Paths.get("src/data");
        try
        {
            if(Files.notExists(dataDirecteory))
            {
                Files.createDirectories(dataDirecteory);
            }
            else
            {
                System.out.println("The directory already exists");
            }
        }
        catch(IOException iox)
        {
            iox.printStackTrace();
        }

        Path pathToMyList = Paths.get("src/data/list.txt");
        try
        {
            if(Files.notExists(pathToMyList))
            {
                Files.createFile(pathToMyList);
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException iox)
        {
            System.out.println("Couldn't create the file :(");
        }


        List<String> spices = Arrays.asList("cardamom", "ginger", "saffron", "nutmeg", "black pepper", "salt");

        try
        {
            Files.write(pathToMyList, spices);
        }
        catch(IOException iox)
        {
            iox.printStackTrace();
        }

//        List<String> currentList = new ArrayList<>();
//        try
//        {
//            currentList = Files.readAllLines(pathToMyList);
//        }
//        catch (IOException iox)
//        {
//            iox.printStackTrace();
//        }
//        for(String spice : currentList)
//        {
//            System.out.println(spice);
//        }


        readFileAndOutput(pathToMyList);
        System.out.println("------------------");


        try
        {
            Files.writeString(pathToMyList, "vanilla\n", StandardOpenOption.APPEND);
        }
        catch(IOException iox)
        {
            iox.printStackTrace();
        }
        readFileAndOutput(pathToMyList);

        List<String> currentList = new ArrayList<>();

        try
        {
            currentList = Files.readAllLines(pathToMyList);
        }
        catch(IOException iox)
        {
            iox.printStackTrace();
        }

        Iterator<String> listIterator = currentList.iterator();
//        while(listIterator.hasNext())
//        {
//            String item = listIterator.next();
//            if(item.equals("ginger"))
//            {
//                listIterator.remove();
//            }
//        }

        currentList.removeIf(item -> item.equals("ginger"));


        try
        {
            Files.write(pathToMyList, currentList);
        }
        catch(IOException iox)
        {
            iox.printStackTrace();
        }
        System.out.println("-----------");
        readFileAndOutput(pathToMyList);

    }
}
