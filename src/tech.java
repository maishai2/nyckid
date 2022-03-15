public class tech extends nyckid {

    private boolean loser;
    private String major;

    public tech(String name, int age)
    {
        super(name, age);
    }

    public void takesElevators()
    {
        System.out.println("You are a loser");
        loser = true;
    }
}
