package game.model.character;

import game.*;

public class Hero extends Character {

    protected int XP;
    protected int LVL;
    protected String name;

    /*
    Hero(String name, int lon, int lat, int hp, int exp, int atk, int def) {
        super(name, lon, lat, hp);
        this.exp = exp;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
    }
    */

    Hero() {
    }

    public void move (int input) {

        switch (iInput) {
            case 1 :
                this.lon = --lon;
                break;
            case 2 :
                this.lon = ++lat;
                break;
            case 3 :
                this.lon = ++lon;
                break;
            case 4 :
                this.lon = --lat;
                break;
        }

    }

    public static void heroMenu() {
        int iInput = 0;
        while (iInput < 1 || iInput > 3) {
            
            System.out.println("Please choose Hero : \n 1 : Create Hero \n 2 : Select Hero \n 0 : Exit");
            iInput = Integer.parseInt(scanner.nextLine());
            
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

    public static void createNewHero() {
        try {
            System.out.println(" Please enter your name: \n 0 : EXIT");
            String name = scanner.nextLine();
            
            if (name.equals("0")) {
                System.out.println(" EXIT ");
                System.exit(1);
            } else if (name != null) {
                String type = null;
                int iInput = -1;
                while (iInput < 0 || iInput > 3) {
                    System.out.println(" Please choose a Hero type : \n 1 : Warrior \n 2 : Knight \n 3 : Barbarian \n 0 : EXIT ");
                    iInput = Integer.parseInt(scanner.nextLine());

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
                createHero(name, type, 0, 0, 0, 0);
            }
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatexception " + e);
        } catch (NoSuchElementException e) {
            System.out.println(" NumberFormatexception " + e);
        } catch (IllegalStateException e) {
            System.out.println(" NumberFormatexception " + e);
        }
    }

    public static void selectHero() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Heroes.txt"));   
    
            String line = bufferedReader.readLine();
            if (line != null) {

                int lineCount = 1;
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                    lineCount++;
                }   
            
                int iInput = -1;
                while (iInput < 0 && iInput > lineCount) {
                    System.out.println(" Please select Hero (1 - " + lineCount + "), 0 to EXIT :");
                    iInput = Integer.parseInt(scanner.nextLine());

                    if (iInput == 0) {
                        System.out.println(" EXIT ");
                        System.exit(1);
                    }
                }
                    
                if(iInput > 0 && iInput <= lineCount) {
                    int lineNum = 0;
                    while (lineNum != iInput) {
                        line = bufferedReader.readLine();
                        lineNum++;
                    }

                    if (line != null){
                        System.out.println(line);
                        String[] input = line.split(",");
                        createHero(input[0], input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]), Integer.parseInt(input[4]), Integer.parseInt(input[5]));
                    }
                } else {
                    System.out.println(" Invalid argument ");
                }
            }
            bufferedReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(" FileNotFoundException " + e);
        }
    }
        
    
    public static void createHero(String name, String type, int xp, int weapon, int armour, int helm) {
        super(name, type, xp, weapon, armour, helm);
        //Entity v = new Villain();
        //obervers.add();
        //obervers.add(new Artefact());
        //System.out.println(observers.name);
        
    }
    
    public static void saveHero() {
        try {
            FileWriter fileWriter = new FileWriter("Heroes.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            
            //bufferedWriter.write(input);
            //bufferedWriter.write(this.name + "," + this.type + "," + this.xp + "," + this.weapon + "," + this.armour + "," + this.helm);

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(" IOException: " + e); 
    }

    public void fight(Character Villain) {
        System.out.println(Villain.CLASS); 
    }

    public void run(Villain Villain) {
        int r = numGen(0, 10);

        if (r > 5) {
            this.fight(Villain);
        }

    }

}