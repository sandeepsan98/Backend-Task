package day13_11_24;

import java.util.regex.*;

public class FileUploadValidator {

    private static final String IMAGE_FILE_REGEX = "^(.*\\.(jpg|jpeg|png|gif|bmp))$";

    public static void main(String[] args) {
        String[] uploadedFiles = {
                "profile_pic.jpg",
                "assignment.pdf",
                "photo.png",
                "profile_image.gif",
                "document.txt",
                "photo.bmp",
                "image.JPG",
                "notes.docx"
        };


        for (String fileName : uploadedFiles) {
            System.out.println("File: " + fileName + " -> " + (isValidImageFile(fileName) ? "Valid Image" : "Invalid Image"));
        }
    }


    public static boolean isValidImageFile(String fileName) {

        Pattern pattern = Pattern.compile(IMAGE_FILE_REGEX, Pattern.CASE_INSENSITIVE);


        Matcher matcher = pattern.matcher(fileName);

        return matcher.matches();
    }
}
