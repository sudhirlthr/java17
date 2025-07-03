package io.sudhir.log.ctci.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        new SpiralPrintMatrix().printMatrixInSpiralForm(matrix);
    }
    public List<Integer> printMatrixInSpiralForm(int[][] matrix){
        int left = 0, right = matrix.length-1, top = 0, bottom = matrix[0].length-1;
        List<Integer> resultList = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i=left;i <= right; i++){
                resultList.add(matrix[top][i]);
                System.out.println(matrix[top][i]+" ");
            }
            top++;
            for(int i=top;i <= bottom; i++){
                resultList.add(matrix[i][right]);
                System.out.println(matrix[i][right]+" ");
            }
            right--;

            if (left <= right){
                for(int i=right;i >= left; i--){
                    resultList.add(matrix[bottom][i]);
                    System.out.println((matrix[bottom][i]+" "));
                }
                bottom--;
            }

            if (top <= bottom){
                for(int i=bottom;i >= top; i--){
                    resultList.add(matrix[i][left]);
                    System.out.println((matrix[i][left]+" "));
                }
                left++;
            }
        }
        return resultList;
    }
}
