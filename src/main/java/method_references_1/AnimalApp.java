package method_references_1;

public class AnimalApp {

    public static void main( String[] args ) {

        // Method Reference of Instance Method
        Mammal cat = new Mammal();
        Animal tabbyCat = cat::meow;

        tabbyCat.sound("Meow!");

        // Method Reference of Static Method
        Animal poodleDog = Mammal::woof;

        poodleDog.sound("Woof!");

    }

}
