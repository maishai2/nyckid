public class stuy extends nyckid {

    private boolean nerd;
    private double gpa;


    public stuy(String name, int age)
    {
        super(name,age);
    }
    public void takenSAT()
    {
        System.out.println("youre a nerd");
        nerd = true;
    }
}
