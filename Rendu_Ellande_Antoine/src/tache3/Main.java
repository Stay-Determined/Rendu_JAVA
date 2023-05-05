package tache3;

import java.io.File;
public class Main {
    public static void main(String[] args) {


       /* NumberPlate oldPlate = new NumberPlate("ABC123");
        EuropeanNumberPlate newPlate = new EuropeanNumberPlate("AB123CD");*/

/*        Car oldCar = new Car("Toyota", oldPlate);
        Car newCar = new Car("Ford", newPlate);*/
        ManipulationFichiers.printFiles(new File("C:\\Users\\ellan\\IdeaProjects\\Rendu_Ellande_Antoine\\src"), "t");
        System.out.println(ManipulationFichiers.totalSizeOfFiles(new File("C:\\Users\\ellan\\IdeaProjects\\Rendu_Ellande_Antoine\\src\\tache3")));
        System.out.println(ManipulationFichiers.mostRecentFile(new File("C:\\Users\\ellan\\IdeaProjects\\Rendu_Ellande_Antoine\\src")).toString());

        String bonnePlaque = "AB123CD";
        String mauvaisePlaque = "aB1z3Cd";
        String anciennePlaque = "1234AAA12";

        EuropeanNumberPlate myPlate = new EuropeanNumberPlate(bonnePlaque);

        //Plaque non Européenne
        EuropeanNumberPlate errorPlate = new EuropeanNumberPlate(mauvaisePlaque);
        EuropeanNumberPlate oldPlate = new EuropeanNumberPlate(anciennePlaque);
        myPlate.checkPlaqueEu(bonnePlaque);
        errorPlate.checkPlaqueEu(mauvaisePlaque);

        myPlate.sortPlaque(bonnePlaque);
        errorPlate.sortPlaque(mauvaisePlaque);
        oldPlate.sortPlaque(anciennePlaque);

        System.out.println(myPlate.costPlate(bonnePlaque, 1));
        System.out.println(errorPlate.costPlate(mauvaisePlaque, 1));
        System.out.println(oldPlate.costPlate(anciennePlaque, 1));


    }
}
