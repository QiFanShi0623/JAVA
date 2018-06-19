package Practice;



public class food {
    public static void main(String[] args) {
        food good=new food();
        apple appleob=new apple();
        tuna tunaob=new tuna();
        Pie pieob=new Pie();
        good.test(appleob);
        good.test(tunaob);
        good.test(pieob);

    }
    public void test(apple Anapple)
    {
        Anapple.eat();
        if (Anapple instanceof tuna)
        {
            ((tuna) Anapple).fish();
        }
        if (Anapple instanceof Pie) {
            ((Pie) Anapple).tree();
        }

    }

}

