package game.controller;

public class gameController {

    public static int[][] mapGen(int LVL) {

        int LonMax = (LVL - 1) * 5 + 10 - (LVL % 2);
        int LatMax = LonMax;
        int[][] map = new int[LonMax][LatMax];

        for (int j = 0; j < LatMax; j++){
            for (int i = 0; i < LonMax; i++) {
                map[i][j] = -1;
            }
        }
        map[LonMax / 2][LatMax / 2] = 1;
        //printmap(map, LonMax, LatMax);        
    }

    public static void printmap (int[][] map, int LonMax, int LatMax) {
        for (int j = 0; j < LatMax; j++){
            for (int i = 0; i < LonMax; i++) {
                System.out.print(" " + map[i][j] );
            }
            System.out.print("\n");
        }
    }
}