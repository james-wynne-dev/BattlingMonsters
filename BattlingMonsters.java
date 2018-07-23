/**
* Assignment 2: Battling Monsters
* James Wynne - 3/10/17
*/

import java.util.*;

public class BattlingMonsters
{


    public static void main(String argv[])
    {

        // create Scanner for input
        Scanner input = new Scanner(System.in);

        // create Monster variables
        Monster beast1;
        Monster beast2;
        Monster beast3;
        Monster beast4;



        System.out.println("");
        System.out.println("*******************************************************************");
        System.out.println("Hello, welcome to Battling Monsters!!! Please create your fighters.");
        System.out.println("*******************************************************************");



        // get input and create monster
        beast1 = makeMonster(input, "first");
        beast2 = makeMonster(input, "second");
        beast3 = makeMonster(input, "third");
        beast4 = makeMonster(input, "fourth");



        // "create a BattleQueen object, passing it references to the four monsters" (as specified in question)
        BattleQueen event = new BattleQueen(beast1, beast2, beast3, beast4);


        // start BattleQueen tournament method
        event.tournament();

        // closing message
        System.out.println("");
        System.out.println("Goodbye and thanks for playing.");
        System.out.println("");


    }


    // gets input from the player and sets Monster variables
    private static Monster makeMonster(Scanner input, String num)
    {
        // variables to hold input values from user
        String name;
        int strength;
        int wrath;
        Monster beast;

        // get the name
        System.out.println("");
        System.out.print("Enter the name of your " + num + " Monster: ");
        name = input.next();


        // get the strength
        System.out.print("Enter a number between 1 and 10 for the strength of your " + num + " Monster: ");
        strength = input.nextInt();

        if(strength < 1 || strength > 10)
            {
                System.out.print("Sorry! Your animals strength must be between 1 and 10, please"
                    + " re-enter a new value between 1 and 10: ");
                strength = input.nextInt();
            }



        // get the wrath
        System.out.print("Enter a number between 0 and 10 for the wrath of "
            + "your " + num + " Monster: ");
        wrath = input.nextInt();

        if(wrath < 0 || wrath > 10)
        {
            System.out.print("Sorry! Your animals wrath must be between 1 and 10,"+
                " please re-enter a new value between 1 and 10: ");
            wrath = input.nextInt();
            System.out.println("");
        }

        beast = new Monster(name, strength, wrath);
        return beast;





    }
}
