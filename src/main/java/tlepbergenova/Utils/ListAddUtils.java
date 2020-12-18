package tlepbergenova.Utils;

import java.io.*;
import java.nio.charset.Charset;
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

    public static List<String> addLines(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader.lines().collect(Collectors.toList());
    }
}