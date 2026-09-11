package Array_2D_Chapter;

public class Spiral_Matrix {
    public static void printSpiral(int [][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(startRow <= endRow && startCol<= endCol) {
        for(int i = startCol; i<=endCol; i++) {
            System.out.print(arr[startRow][i]+" ");
        }
        for(int i = startRow+1; i<=endRow; i++) {
            System.out.print(arr[i][endCol]+" ");
        }
        for(int i = endCol-1; i>=startCol; i--) {
            if(startRow == endRow) {
                break;
            }
            System.out.print(arr[endRow][i]+" ");
        }
        for(int i = endRow-1; i>=startRow+1; i--) {
            if(startCol == endCol) {
                break;
            }
            System.out.print(arr[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
        System.out.println();
}
    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
        int [][]matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }
}
