import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List cats = new ArrayList();

        for(int i = 0; i < 7; i++)
            cats.add(new Cat(i));

        cats.add(new Dog(7));

        for(int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getClass() == Cat.class)
                ((Cat)cats.get(i)).id();
            else if (cats.get(i).getClass() == Dog.class)
                ((Dog)cats.get(i)).id();
        }
    }
}
