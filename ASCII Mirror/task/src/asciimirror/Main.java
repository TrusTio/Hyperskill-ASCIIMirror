package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Stage 4/5 completed
 * ASCII Mirror with Java - https://hyperskill.org/projects/260
 * Part of Hyperskill's Java Backend Developer (Spring Boot) course.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        List<String> lineList = new ArrayList<>();

        logger.info("\u001B[33m" + "File information: " +
                    "\n File name: " + file.getName() +
                    "\n File path: " + file.getPath() +
                    "\n Is file: " + file.isFile() +
                    "\n Is directory: " + file.isDirectory() +
                    "\n Exists: " + file.exists() +
                    "\n Parent path: " + file.getParent() +
                    "\n Absolute path: " + file.getAbsolutePath());


        int longestStringLength = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                String nextLine = fileScanner.nextLine();
                lineList.add(nextLine);
                if(nextLine.length() > longestStringLength) {
                    longestStringLength = nextLine.length();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }


        List<String> mirroredList = mirrorList(lineList,longestStringLength);
        for(String str : mirroredList){
            System.out.println(str);
        }
    }

    /**
     * Mirrors the list given a List of String and an int of the longest string length
     * @param lineList
     * @param longestStringLength
     * @return
     */
    public static List<String> mirrorList (List<String> lineList, int longestStringLength){
        List<String> mirroredList = new ArrayList<>() ;

        for(String str : lineList) {
                int lengthDifference = longestStringLength - str.length();
                mirroredList.add(str + " ".repeat(lengthDifference) + " | " + str + " ".repeat(lengthDifference));
        }
        return mirroredList;
    }
}