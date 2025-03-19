package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Stage 3/5 completed
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


        logger.info("\u001B[33m" + "File information: " +
                    "\n File name: " + file.getName() +
                    "\n File path: " + file.getPath() +
                    "\n Is file: " + file.isFile() +
                    "\n Is directory: " + file.isDirectory() +
                    "\n Exists: " + file.exists() +
                    "\n Parent path: " + file.getParent() +
                    "\n Absolute path: " + file.getAbsolutePath());
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {

                System.out.println(fileScanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}