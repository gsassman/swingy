package game.controller;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.NoSuchElementException;
import javax.xml.stream.events.Characters;*/

import java.lang.NumberFormatException;
import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

import game.model.Hero;

public class Game {

    public static Scanner scanner = null;
    public static int[][] map = null;
    protected static Hero hero;
    
    public static void startGame() {
        try {
            scanner = new Scanner(System.in);
            System.out.println(" *** Game start *** ");
            heroMenu();

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
        map = new int[LonMax][LatMax];

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

    public void heroMenu() {
        int iInput = -1;
        while (iInput < 0 || iInput > 3) {
            
            System.out.println("Please choose Hero : \n 1 : Create Hero \n 2 : Select Hero \n 0 : Exit");
            iInput = Integer.parseInt(game.Game.scanner.nextLine());
            
            switch  (iInput) {       
                case 0:
                    System.out.println(" Exit ");
                    System.exit(1);
                    break;
                case 1:
                    System.out.println(" Create Hero ");
                    createNewHero();
                    break;
                case 2:
                    System.out.println(" Select Hero ");
                    selectHero();
                    break;
                default :
                    System.out.println(" Invalid argument ");
            }
        }
    }

    public int moveMenu() {
        
    }

    public int levelExit() {
        System.out.println(" You will have to restart this level. \n Are you sure you want to leave now? \n 1 : Back \n 0 : EXIT ");

        String type = null;
        int iInput = -1;
        while (iInput < 0 || iInput > 3) {
            System.out.println(" Please choose a Hero type : \n 1 : Warrior \n 2 : Knight \n 3 : Barbarian \n 0 : EXIT ");
            iInput = Integer.parseInt(game.Game.scanner.nextLine());

            switch (iInput) {
                case 0 :
                    System.out.println(" EXIT ");
                    System.exit(1);
                    break;
                case 1 :
                    System.out.println(" Warrior ");
                    type = "Warrior";
                    break;
                case 2 :
                    System.out.println(" Knight ");
                    type = "Knight";
                    break;
                case 3 :
                    System.out.println(" Barbarian ");
                    type = "Barbarian";
                    break;
                default :
                    System.out.println(" Invalid argument ");
            }
        }
        
        Game.model.characters.Hero.saveHero();
        
    }

}