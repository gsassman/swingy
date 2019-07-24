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

import game.*;
import game.model.character.Hero;

public class Game {

    protected static Hero hero;
    
    public static Scanner scanner = null;
    //protected static List<Entity> observers = new ArrayList<Entity>();

    public static int maxlon;
    
    public static void main(String[] argv) {
        try {
            scanner = new Scanner(System.in);
            System.out.println(" *** Game start *** ");
            hero.heroMenu();
            genMap();

            int game = 1;
            while (game > 0) {

                int iInput = -1;
                while ( iInput < 0 || iInput > 4) {
                    System.out.println(" Please select a direction to move in : ");
                    System.out.println(" 1 : left \n 2 : up \n 3 : right \n 4 : left \n 0 : EXIT ");
                    String sInput = scanner.nextLine();
                    iInput = Integer.parseInt(sInput);
                }
                /*if (iInput > 0 && iInput < 4) {
                    hero.move(iInput);
                }*/
                    
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

    
}