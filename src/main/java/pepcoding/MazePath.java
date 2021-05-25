package pepcoding;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
    public static void main(String[] args) {
        List<String> paths = path(1, 1, 3, 3);
        System.out.println(paths);
    }

    private static ArrayList<String> path(int startRow, int startColumn, int destinationRow, int destinationColumn) {
        if(startRow == destinationRow && startColumn == destinationColumn) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> horizontalPaths = new ArrayList<>();
        if(startColumn < destinationColumn)
            horizontalPaths = path(startRow, startColumn+1, destinationRow, destinationColumn);

        ArrayList<String> verticalPaths = new ArrayList<>();
        if(startRow < destinationRow)
            verticalPaths = path(startRow+1, startColumn, destinationRow, destinationColumn);

        ArrayList<String> paths = new ArrayList<>();
        for(String path: horizontalPaths)
            paths.add("h"+path);

        for(String path: verticalPaths)
            paths.add("v"+path);

        return paths;
    }
}
