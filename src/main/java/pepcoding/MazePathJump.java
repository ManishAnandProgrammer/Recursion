package pepcoding;

import java.util.ArrayList;
import java.util.List;

public class MazePathJump {
    public static void main(String[] args) {
        List<String> paths = paths(1,1,4,4);
        System.out.println(paths);
    }

    private static List<String> paths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        if(sourceRow > destinationRow || sourceColumn > destinationColumn)
            return List.of();

        if(sourceRow == destinationRow && sourceColumn == destinationColumn) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        List<String> diagonal_1 = paths(sourceRow + 1, sourceColumn + 1, destinationRow, destinationColumn);
        List<String> diagonal_2 = paths(sourceRow + 2, sourceColumn + 2, destinationRow, destinationColumn);
        List<String> diagonal_3 = paths(sourceRow + 3, sourceColumn + 3, destinationRow, destinationColumn);

        List<String> horizontal_1 = paths(sourceRow, sourceColumn + 1, destinationRow, destinationColumn);
        List<String> horizontal_2 = paths(sourceRow, sourceColumn + 2, destinationRow, destinationColumn);
        List<String> horizontal_3 = paths(sourceRow, sourceColumn + 3, destinationRow, destinationColumn);

        List<String> vertical_1 = paths(sourceRow + 1, sourceColumn, destinationRow, destinationColumn);
        List<String> vertical_2 = paths(sourceRow + 2, sourceColumn, destinationRow, destinationColumn);
        List<String> vertical_3 = paths(sourceRow + 3, sourceColumn, destinationRow, destinationColumn);

        List<String> paths = new ArrayList<>();

        for(String path: diagonal_1)
            paths.add("d1"+path);

        for(String path: diagonal_2)
            paths.add("d2"+path);

        for(String path: diagonal_3)
            paths.add("d3"+path);

        for(String path: horizontal_1)
            paths.add("h1"+path);

        for(String path: horizontal_2)
            paths.add("h2"+path);

        for(String path: horizontal_3)
            paths.add("h3"+path);

        for(String path: vertical_1)
            paths.add("v1"+path);

        for(String path: vertical_2)
            paths.add("v2"+path);

        for(String path: vertical_3)
            paths.add("v3"+path);

        return paths;
    }
}
