/* *
 * 目标：数字华容道的初始化和随机
 */

package games.n.puzzle;

public class npuzzle {
    public static void main(String[] args) {
        int[][] puzzleTable = randomPuzzleTable(5,100);
        printPuzzleTable(puzzleTable);
    }

    public static void printPuzzleTable(int[][] puzzleTable){
        for (int i = 0; i < puzzleTable.length; i++) {
            for (int j = 0; j < puzzleTable[i].length; j++) {
                System.out.print(puzzleTable[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] initPuzzleTable(int size){
        int[][] puzzleTable = new int[size][size];
        int num = 1;
        for (int i = 0; i < puzzleTable.length; i++) {
            for (int j = 0; j < puzzleTable[i].length; j++) {
                puzzleTable[i][j] = num++;
            }
        }
        puzzleTable[size-1][size-1] = 0;

        return puzzleTable;
    }

    public static int[][] randomPuzzleTable(int size, int randomTimes){
        int[][] puzzleTable = initPuzzleTable(size);

        while(randomTimes-->0){
            int x1 = (int)(Math.random() * size);
            int y1 = (int)(Math.random() * size);
            int x2 = (int)(Math.random() * size);
            int y2 = (int)(Math.random() * size);
            int tmp = puzzleTable[x1][y1];
            puzzleTable[x1][y1] = puzzleTable[x2][y2];
            puzzleTable[x2][y2] = tmp;
        }

        return puzzleTable;
    }
}
