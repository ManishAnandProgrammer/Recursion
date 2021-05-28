package pepcoding;

import java.util.List;
import java.util.stream.Collectors;

public class FloodFill {
    public static void main(String[] args) {
        List<String> inputs = List.of("0 0 0 0 0", "0 0 1 1 0", "1 0 0 1 0", "0 1 0 0 0", "0 1 1 0 0");
        //List<String> inputs = List.of("0 1 1", "0 0 1", "1 0 0", "0 1 0");
        List<int[]> matrixInputs =
        inputs.stream()
                .map(value -> {
                   String[] array = value.split(" ");
                   return array;
                })
                .map(stringArray -> {
                    int[] array = new int[stringArray.length];
                    for(int i = 0; i < stringArray.length; i++) {
                        int value = Integer.parseInt(stringArray[i]);
                        array[i] = value;
                    }
                    return array;
                })
                .collect(Collectors.toList());

        int[][] matrix = new int[inputs.size()][];
        for(int i = 0; i < matrix.length; i++) {
            matrix[i] = matrixInputs.get(i);
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean[][] pathVisited = new boolean[matrix.length][matrix[0].length];
        floodFill(matrix, 0, 0, "", pathVisited);
    }

    private static void floodFill(int[][] matrix, int currentRow, int currentColumn, String path, boolean[][] pathVisited) {
        if(currentRow < 0 || currentColumn < 0
                || currentRow == matrix.length || currentColumn == matrix[0].length
                || matrix[currentRow][currentColumn] == 1
                || pathVisited[currentRow][currentColumn] == true) {
            return;
        }

        if(currentRow == matrix.length - 1  && currentColumn == matrix[currentRow].length - 1) {
            System.out.println(path);
            return;
        }

        pathVisited[currentRow][currentColumn] = true;
        floodFill(matrix, currentRow - 1, currentColumn, path + "t", pathVisited);
        floodFill(matrix, currentRow + 1, currentColumn, path + "d", pathVisited);
        floodFill(matrix, currentRow, currentColumn + 1, path + "r", pathVisited);
        floodFill(matrix, currentRow, currentColumn - 1, path + "l", pathVisited);
        pathVisited[currentRow][currentColumn] = false;
    }


}
