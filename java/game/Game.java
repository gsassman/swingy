package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;

import java.io.BufferedWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

import game.*;
import game.model.characters.*;


public class Game {

    public static int[][] map = null;
    protected static Hero hero;

    public static Scanner scanner = null;
    
    public static void main(String[] argv) {
        try {
            scanner = new Scanner(System.in);
            System.out.println(" *** Game start *** ");
            Hero.heroMenu();
            map = mapGen(hero.getLVL());

            int game = 1;
            while (game > 0) {

                int iInput = -1;
                while ( iInput < 0 || iInput > 4) {
                    System.out.println(" Please select a direction to move in : ");
                    System.out.println(" 1 : left \n 2 : up \n 3 : right \n 4 : left \n 0 : EXIT ");
                    String sInput = scanner.nextLine();
                    iInput = Integer.parseInt(sInput);
                }

                hero.move(iInput);
                
                }
                scanner.close();
    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ArrayIndexOutOfBoundsException: " + e);
        } catch (NullPointerException e) {
            System.out.println(" NullPointerException: " + e);
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException: " + e);
        } finally {
            System.out.println(" Game Over ");
        }
    }

    public static int[][] mapGen(int LVL) {
        int LonMax = (LVL - 1) * 5 + 10 - (LVL % 2);
        int LatMax = LonMax;
        int[][] map = new int[LonMax][LatMax];

        for (int j = 0; j < LatMax; j++){
            for (int i = 0; i < LonMax; i++) {
                map[i][j] = -1;

                int r = game.model.characters.Characters.numGen(0 , 10);
                if(r == 1) {
                    map[i][j] = 2;
                }
            }
        }
        map[LonMax / 2][LatMax / 2] = 1;
        //printmap(map, LonMax, LatMax);
        return map;
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