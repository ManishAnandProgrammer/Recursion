package pepcoding;

import java.util.ArrayList;
import java.util.List;

public class StairsPath {
    public static void main(String[] args) {
        System.out.println(path(4));
    }

    private static List<String> path(int numberOfStairs) {
        if(numberOfStairs == 0) {
            return List.of("");
        } else if(numberOfStairs < 0) {
            return List.of();
        }

        List<String> paths1 = path(numberOfStairs - 1);
        List<String> paths2 = path(numberOfStairs - 2);
        List<String> paths3 = path(numberOfStairs - 3);

        List<String> allPaths = new ArrayList<>();
        for(String path: paths1)
            allPaths.add(1 + path);

        for(String path: paths2)
            allPaths.add(2 + path);

        for(String path: paths3)
            allPaths.add(3 + path);

        return allPaths;
    }
}
