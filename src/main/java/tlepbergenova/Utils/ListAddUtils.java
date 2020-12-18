package tlepbergenova.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This class includes functions for adding items to a list
 */
public class ListAddUtils {
    public static List<String> addLines() {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.isEmpty()) {
            list.add(line);
            line = scanner.nextLine();
        }
        return list;
    }

    public static List<String> addLines(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            return ListAddUtils.addLines();
        }
    }
}