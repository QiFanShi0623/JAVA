package Practice.testing;

public class Leopard extends Cat {

    Cat aCat;

    public void speak(){

        System.out.println("Grrrrr");
    }

    public void climb(){

        System.out.println("Climb the tree");
    }


    public String toString() {

        return "Leopard name is " + super.toString();
    }

    public void toString(Cat aCat){

        System.out.println("The type of Cat family animal is a Leopard by name " + aCat);
    }

}
