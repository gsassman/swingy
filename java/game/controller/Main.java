package game.controller;

public class Main {

    public static void main(String[] argv) {
        switch(argv[0]) {
            case "CONSOLE" :
                System.out.println(" Console ");
                Game.startGame();
                break;
            case "GUI" :
                System.out.println(" GUI ");
                break;
            case "EXIT" :
                System.out.println(" EXIT ");
                System.exit(1);
                break;
            default :
                System.out.println(" Invalid argument ");
                break;
        }
    }
}