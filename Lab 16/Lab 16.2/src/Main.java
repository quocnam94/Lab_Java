import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\A315-57G\\IdeaProjects\\Lab 16\\src\\2022";
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        Map<String, List<String>> folderMap = new HashMap<>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String fileName = file.getName();
                if (checkFileNameValid(fileName)) {
                    System.out.println("Check item: " + fileName + "--- File valid!" );
                    // Tách phần tên thư mục
                    String newFolder = fileName.substring(0, fileName.lastIndexOf("-"));
                    List<String> listFileInFolder = new ArrayList<>();
                    // Nếu thư mục đã tồn tại thì lấy ra danh sách tên các tệp hiện có sau đó add tên mới vào danh sách
                    if (folderMap.containsKey(newFolder)){
                        listFileInFolder = folderMap.get(newFolder);
                    }
                    listFileInFolder.add(fileName);
                    folderMap.put(newFolder, listFileInFolder);
                }
                else {
                    System.out.println("Check item: " + fileName + "--- File invalid will be removed !" );
                    try {
                        Files.delete(file.toPath());
                    } catch (Exception e) {
                        System.out.println("Error deleting file: " + e.getMessage());
                    }
                }
            }
        }
        createFolderAndMoveFile(folderPath, folderMap);
    }
    private static boolean checkFileNameValid(String fileName) {
        Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])(.txt)$");
        Matcher m = p.matcher(fileName);
        return m.matches();
    }
    public static void createFolderAndMoveFile(String rootFolder, Map<String, List<String>> folderMap){
        // Đọc dữ liệu từ map để tạo thư mục và di chuyển tệp vào thư mục
        for (String newFolder : folderMap.keySet()){
            Path newFolderPath = Paths.get(rootFolder, newFolder);
            try {
                // Tạo thư mục mới
                Files.createDirectory(newFolderPath);
                for (String fileName: folderMap.get(newFolder)){
                    // Di chuyển thư mục
                    Path oldFilePath = Paths.get(rootFolder, fileName);
                    Path newFilePath = newFolderPath.resolve(fileName);
                    Files.move(oldFilePath, newFilePath);
                    System.out.println("Move file :" + oldFilePath + " ===>  :" + newFilePath);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}