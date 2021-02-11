package AssesmesntPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assessment {
    public static Integer half(int num){
        return num/2;
    }
    public static String shout(String num){
        return num.toUpperCase() + "!!!" ;
    }
    public static ArrayList removeCats(ArrayList animals){
        Iterator<String> ani = animals.iterator();
        while(ani.hasNext()){
            String animal = (String)ani.next();
            if(animal.contains("Felis catus")){
                ani.remove();
            }
        }
//        System.out.println(animals);
        return  animals;
    }

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat type 1");
        animals.add("Felis catus 1");
        animals.add("Felis catus 2");
        animals.add("Cat type 2");
        animals.add("Cat type 3");
        animals.add("Felis catus 3");
        System.out.println(animals);

        System.out.println(half(8));
        System.out.println(shout("Hello"));
        System.out.println(removeCats(animals));

        animal cat = new animal();
        cat.setName("haba");
        System.out.println(cat.getName());
        System.out.println(cat.roar());
    }
}
