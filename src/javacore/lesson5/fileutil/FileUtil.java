package javacore.lesson5.fileutil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public final class FileUtil {
    private static final String resourcesPath = "resources";
    private static final String itemsNamePath = "items-name.csv";
    private static final String itemsPricePath = "items-price.csv";
    private static final String errorsPath = "errors.csv";
    private static final String resultPath = "result.csv";
    private static final String ID = "ID";
    private static final String NAME = "NAME";
    private static final String PRICE = "PRICE";
    private static final int READ_ID = 0;
    private static final int READ_NAME = 1;

    private FileUtil() {

    }

    private static Map<String, String> parsingFile(String fileName) {
        File file = Path.of(resourcesPath, fileName).toFile();
        if (!checkValid(fileName, file)) {
            throw new IllegalArgumentException("Недействительный файл" + fileName);

        }
        Map<String, String> map = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            fileReader.readLine();
            while ((line = fileReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length > 0) {
                    String key = split[READ_ID];
                    String value = (split.length > READ_NAME && !split[READ_NAME].isEmpty()) ? split[READ_NAME] : "Пусто";
                    map.put(key, value);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return Collections.emptyMap();
        }
        return map;
    }

    public static void mergeFiles(String file1, String file2) {
        Map<String, String> name = parsingFile(file1);
        Map<String, String> price = parsingFile(file2);
        File file = Path.of(resourcesPath, resultPath).toFile();
        List<String> emptyId = new ArrayList<>(List.of(ID));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String resLine;
            bufferedWriter.write(ID + "," + NAME + "," + PRICE);
            bufferedWriter.newLine();
            for (String key : name.keySet()) {
                String priceValue = price.get(key);
                String product = name.get(key);

                if (priceValue.equals("Пусто") && product.equals("Пусто")) {
                    emptyId.add(key);
                    continue;
                }
                resLine = (key + " " + product + " " + priceValue).replaceAll("Пусто", "");
                bufferedWriter.write(resLine);
                bufferedWriter.newLine();
            }
            addErrors(emptyId);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }

    }

    private static void addErrors(List<String> error) {
        Path path = Path.of(resourcesPath, errorsPath);
        try {
            Files.write(path, error);
        } catch (IOException e) {
            throw new RuntimeException(e + "Ошибка записи");
        }

    }
    private static boolean checkValid(String fileName, File file) {
        if (!fileName.equals(itemsNamePath) && !fileName.equals(itemsPricePath)) {
            System.err.println("Передан неверный файл!");
            return false;
        }
        if (!file.exists() || !file.isFile()) {
            System.err.println("Файл не существует!");
            return false;
        } else if (file.length() == 0) {
            System.err.println("Файл пуст!");
            return false;
        }
        return true;
    }


}

