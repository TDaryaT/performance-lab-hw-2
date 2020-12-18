package tlepbergenova.Utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class includes functions for adding items to a list
 */
public class ListAddUtils {
    public static List<String> addLines(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader.lines().collect(Collectors.toList());
    }
}