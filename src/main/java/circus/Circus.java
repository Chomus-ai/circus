package circus;

<<<<<<< HEAD
import circus.animal.*;
import circus.equipment.*;

import java.util.ArrayList;
import java.util.Arrays;
=======
import circus.animal.Animal;
import circus.animal.Elephant;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.animal.Tiger;
import circus.equipment.Cage;
import circus.equipment.Cannon;
import circus.equipment.Equipment;
import circus.equipment.Ladder;
>>>>>>> upstream/generics_cage

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        ArrayList<Animal> animalArrayList= new ArrayList<>(Arrays.asList(animals));
        System.out.println("Total number of animals " + animals.length);
        System.out.println("Total number of animals with AL " + animalArrayList.size());

        animalArrayList.add(new Elephant("Dumbo"));
        System.out.println("Total number of animals with AL " + animalArrayList.size());
        nameAllAnimals(animalArrayList);

        Parrot Andy = new Parrot("Andy");
        animalArrayList.add(Andy);
        System.out.println("Total number of animals with AL " + animalArrayList.size());
        System.out.println("Position of Andy is " + animalArrayList.indexOf(Andy));
        System.out.println("Pre-sort: \n");
        printAllAnimals();

        Animal candidate = findAnimalRef(animalArrayList, "Polly");
        System.out.println("Position of Andy is " + animalArrayList.indexOf(candidate));


        // makeAnimalsTalk();
        //System.out.println("Total value of animals " + calculateAssetValue(animals));
        // System.out.println("Total value of equipments " + calculateAssetValue(equipments));
=======

        System.out.println("Number of animals: " + animals.length);
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("Number of animals: " + animalArrayList.size());
        animalArrayList.add(new Tiger("Sherkhan"));
        System.out.println("Number of animals: " + animalArrayList.size());

        animalArrayList.add(new Parrot());

        Duck louie = new Duck();
        animalArrayList.add(louie);
        Elephant strongOne = new Elephant("StrongOne");
        animalArrayList.add(strongOne);

        printAllAnimals(animalArrayList);

        Cage<Duck> duckCage = new Cage<>();
        Duck duck = new Duck();
        duckCage.lockUp(duck);
        Parrot parrot = new Parrot();
        Cage<Parrot> parrotCage = new Cage<>();
        parrotCage.lockUp(parrot);

        ArrayList<Cage> cages = new ArrayList<>();
        cages.add(duckCage);
        cages.add(parrotCage);

        for(Cage c: cages) {
            c.release();
        }
>>>>>>> upstream/generics_cage
    }

    private static void nameAllAnimals(ArrayList<Animal> animals) {
        for(Animal A: animals) {
            System.out.println(A);
        }
    }

    private static Animal findAnimalRef(ArrayList<Animal> animals, String nameOfAnimal) {
        for (Animal a: animals){
            if (a.name == nameOfAnimal){
                return a;
            }
        }
    }
    animalArrayList.sort(Animal.animalNameComparator);
}