

public class Monster
{

    // Monster variables
    private String name;
    private int strength;
    private int wrath;
    private int wins = 0;
    private int loses = 0;
    private int draws = 0;

    //constructor
    public Monster(String n, int s, int w)
    {
        name = n;
        strength = s;
        wrath = w;
    }

    // setter methods
    public void setName(String n)
    {
        name = n;
    }

    public void setStrength(int s)
    {
        strength = s;
    }

    public void setWrath(int w)
    {
        wrath = w;
    }

    public void addWin()
    {
        wins++;
    }

    public void addLoss()
    {
        loses++;
    }

    public void addDraw()
    {
        draws++;
    }



    // getter methods
    public int getStrength()
    {
        return strength;
    }

    public int getWrath()
    {
        return wrath;
    }

    public String getName()
    {
        return name;
    }



    // print name and results
    public void printResults()
    {
        System.out.println(name + " got " + wins + " wins, "
            + loses + " loses, and " + draws + " draws.");
    }




}
