

public class BattleQueen
{

    // Monster variables
    private Monster beast1;
    private Monster beast2;
    private Monster beast3;
    private Monster beast4;


    // constructor: takes 4 Monster variables as arguments
    public BattleQueen(Monster b1, Monster b2, Monster b3, Monster b4)
    {
        beast1 = b1;
        beast2 = b2;
        beast3 = b3;
        beast4 = b4;
    }


    // tournament method call 6 battles & instruct Monsters to print results
    public void tournament()
    {
        System.out.println("");
        System.out.println("*****The Monsters are ready, the tournament begins!");
        System.out.println("");


        fight(beast1, beast2);
        fight(beast1, beast3);
        fight(beast1, beast4);
        fight(beast2, beast3);
        fight(beast2, beast4);
        fight(beast3, beast4);

        System.out.println("The results were as follows.");
        System.out.println("");
        beast1.printResults();
        beast2.printResults();
        beast3.printResults();
        beast4.printResults();
    }


    // fight method: determines the result of a match and changes Monter variables
    private void fight(Monster contender1, Monster contender2)
    {
        // highest strength wins, if same strength highest wrath wins, if wrath also equal it's a draws
        System.out.println(contender1.getName() + " and " + contender2.getName() + " begin the fight.");
        if (contender1.getStrength() > contender2.getStrength())
            {
            contender1.addWin();
            contender2.addLoss();
            System.out.println(contender1.getName() + " wins!");
            System.out.println("");
            }
        else if (contender1.getStrength() < contender2.getStrength())
            {
            contender2.addWin();
            contender1.addLoss();
            System.out.println(contender2.getName() + " wins!");
            System.out.println("");
            }
        // in the case of same strength need to compare wrath to determine outcome
        else if (contender1.getStrength() == contender2.getStrength())
        {
            if (contender1.getWrath() > contender2.getWrath())
                {
                contender1.addWin();
                contender2.addLoss();
                System.out.println(contender1.getName() + " wins!");
                System.out.println("");
                }
            else if (contender1.getWrath() > contender2.getWrath())
                {
                contender2.addWin();
                contender1.addLoss();
                System.out.println(contender2.getName() + " wins!");
                System.out.println("");
                }
            else if (contender1.getWrath() == contender2.getWrath())
                {
                contender1.addDraw();
                contender2.addDraw();
                System.out.println("They draw");
                System.out.println("");
                }

        }
    }


}
