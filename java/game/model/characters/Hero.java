package game.model.characters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import game.*;

public class Hero extends Characters {
    public static BufferedReader bufferedReader = null;
    public static BufferedWriter bufferedWriter;

    protected int XP;
    protected int LVL;
    protected int HP;

    protected int WEAPON = 0;
    protected int ARMOUR = 0;
    protected int HELM = 0 ;

    protected String NAME;

    Hero() {
    }

    public int getLVL() {
		return this.LVL;
	}

	public void setLVL(int LVL) {
		this.LVL = LVL;
    }
    
    public int getXP() {
		return this.XP;
	}

	public void setXP(int XP) {
		this.XP = XP;
    }
    
    public int getHP() {
		return this.HP;
	}
    
    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getWEAPON() {
        return this.WEAPON;
    }

	public void setWEAPON(int WEAPON) {
        this.WEAPON = WEAPON;
    }

    public int getARMOUR() {
        return this.ARMOUR;
    }

	public void setARMOUR(int ARMOUR) {
        this.ARMOUR = ARMOUR;
    }

    public int getHELM() {
		return this.HELM;
	}

	public void setHELM(int HELM) {
        this.HELM = HELM;
    }

	public void move (int iInput) {
        int tempLON = this.LON;
        int tempLAT = this.LAT;

        switch (iInput) {
            case 1 :
                tempLON = (this.LON - 1);
                break;
            case 2 :
                tempLAT = (this.LAT + 1);
                break;  
            case 3 :
                tempLON = (this.LON + 1);
                break;
            case 4 :
                tempLAT = (this.LAT - 1);
                break;
            case 0 :
                System.out.println(" EXIT ");
                System.exit(1);
                break;
        }

        switch (Game.map[tempLON][tempLAT]) {
            case 1 :
                break;
            case 2 :
                break;
            case 0 :
                break;
            case -1 :
                break;
                case 1 :
                break;

        }


        switch (iInput) {
            case 1 :
                tempLON = (this.LON - 1);
                switch (Game.map[tempLON][tempLAT]) {
                    case 2 :
                        collision();
                        break;
                    case -1 :
                        Game.map[tempLON][tempLAT] = 0;
                        break;
                    default :
                        Game.map[tempLON][tempLAT] = 0;
                        this.LON = tempLON;
                        tempLON = (this.LON + 1);
                }
                break;
            case 2 :
                tempLAT = (this.LAT + 1);
                switch (Game.map[tempLON][tempLAT]) {
                    case 2 :
                        collision();
                        break;
                    case -1 :
                        Game.map[tempLON][tempLAT] = 0;
                        break;
                    default :
                        Game.map[tempLON][tempLAT] = 0;
                        this.LAT = tempLAT;
                        tempLAT = (this.LAT - 1);
                }
                break;
            case 3 :
                tempLON = (this.LON + 1);
                switch (Game.map[tempLON][tempLAT]) {
                    case 2 :
                        collision();
                        break;
                    case -1 :
                        Game.map[tempLON][tempLAT] = 0;
                        break;
                    default :
                        Game.map[tempLON][tempLAT] = 0;
                        this.LON = tempLON;
                        tempLON = (this.LON - 1);
                }
                break;
            case 4 :
                tempLAT = (this.LAT - 1);
                switch (Game.map[tempLON][tempLAT]) {
                    case 2 :
                        collision();
                        break;
                    case -1 :
                        Game.map[tempLON][tempLAT] = 0;
                        break;
                    default :
                        Game.map[tempLON][tempLAT] = 0;
                        this.LAT = tempLAT;
                        tempLON = (this.LAT + 1);
                }
                break;
        }
    }

    public void heroMenu() {
        int iInput = 0;
        while (iInput < 1 || iInput > 3) {
            
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

    public void createNewHero() {
        try {
            System.out.println(" Please enter your name: \n 0 : EXIT");
            String name = game.Game.scanner.nextLine();
            
            if (name.equals("0")) {
                System.out.println(" EXIT ");
                System.exit(1);
            } else if (name != null) {
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

    public void selectHero() {
        try {
            
            bufferedReader = new BufferedReader(new FileReader("Heroes.txt"));   
    
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
                    iInput = Integer.parseInt(game.Game.scanner.nextLine());

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
        } catch (IOException e) {
            System.out.println(" IOException " + e);
        }
    }
         
    public Hero createHero(String NAME, String CLASS, int XP, int WEAPON, int ARMOUR, int HELM) {
        
        int LVL = 0;
        if (XP <= 1000) {
            LVL = 1;
        } else if (XP <= 2450) {
            LVL = 2;
        } else if (XP <= 4800) {
            LVL = 3;
        } else if (XP <= 8050) {
            LVL = 4;
        } else if (XP <= 12200) {
            LVL = 5;
        } else  {
            System.out.println(" GAME OVER ");
        }
        
        /*int ATKMAX = XP;
        int ATKMIN = LVL;
        if (WEAPON != 0) {
            this.WEAPON = WEAPON;
            ATKMAX = ((XP + (WEAPON * WEAPON) / 10));
            ATKMIN = ((WEAPON * XP) / 20);
        }
        int ATK = numGen(ATKMIN , ATKMAX);

        int DEFMAX = XP;
        int DEFMIN = LVL;
        if (ARMOUR != 0) {
            this.ARMOUR = ARMOUR;
            DEFMAX = (XP + (ARMOUR * ARMOUR) / 10);
            DEFMIN = ((ARMOUR * XP) / 20);
        }
        int DEF = numGen(DEFMIN, DEFMAX);

        int HP = 100;
        if (HELM != 0) {
            HP = (100 + HELM);
        }*/

        int BORDER = 0;
        switch (LVL) {
            case 1 :
                BORDER = 9;
                break;
            case 2 :
                BORDER = 15;
                break;
            case 3 :
                BORDER = 19;
                break;
            case 4 :
                BORDER = 25;
                break;
            case 5 :
                BORDER = 35;
                break;
            default :
                BORDER = 50;
                break;
        }

        /////////////
        int HP = 10;
        int ATK = 10;
        int DEF = 10;
        /////////////

        int LON = (BORDER / 2);
        int LAT = (BORDER / 2);

        super(CLASS, ATK, DEF, LON, LAT);
        this.NAME = NAME;
        this.HP = HP;
        this.XP = XP;
        
        return this;
    }
    
    public void saveHero() {
        try {
            bufferedReader = new BufferedReader(new FileReader("Heroes.txt"));

            if (bufferedReader == null) {
                FileWriter fileWriter = new FileWriter("Heroes.txt");
                bufferedWriter = new BufferedWriter(fileWriter);
            }
            
            /*bufferedWriter.write(this.NAME + "," + this.CLASS + "," + this.XP + "," + this.WEAPON + "," + this.ARMOUR + "," + this.HELM);
            bufferedWriter.close();*/
        } catch (IOException e) {
            System.out.println(" IOException: " + e);  
        }
    }

    public void fight(Character Villain) {
        System.out.println(" FIGHT "); 
    }

    public void run(Villain Villain) {
        int r = numGen(0, 10);

        if (r > 5) {
            this.fight(Villain);
        }
    }

    public void collision(){

    }
}