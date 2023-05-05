package tache3;

import java.util.List;

public class EuropeanNumberPlate  {

    private String plaqueEU;

    List<String> parcVoitures;

    public EuropeanNumberPlate(String plaqueEU) {
        this.plaqueEU = plaqueEU;
    }

    public boolean checkPlaqueEu(String plaqueEU) {
        if (plaqueEU == null || plaqueEU.length() != 7) {
            System.out.println("La plaque ne respecte pas la nouvelle norme européene");
            return false;
        }

        if (!Character.isUpperCase(plaqueEU.charAt(0)) || !Character.isUpperCase(plaqueEU.charAt(1)) ||
                !Character.isUpperCase(plaqueEU.charAt(5)) || !Character.isUpperCase(plaqueEU.charAt(6))) {
            System.out.println("La plaque ne respecte pas la nouvelle norme européene");
            return false;
        }

        for (int i = 2; i <= 4; i++) {
            if (!Character.isDigit(plaqueEU.charAt(i))) {
                System.out.println("La plaque ne respecte pas la nouvelle norme européene");
                return false;
            }
        }
        System.out.println("La plaque respecte la nouvelle norme européene");
        return true;
    }

    public boolean checkPlaqueOld(String plaqueOLD) {
        if (plaqueEU == null || plaqueEU.length() != 9) {
            System.out.println("La plaque ne respecte pas à l'ancienne norme");
            return false;
        }

        if (!Character.isUpperCase(plaqueEU.charAt(4)) || !Character.isUpperCase(plaqueEU.charAt(5)) || !Character.isUpperCase(plaqueEU.charAt(6))) {
            System.out.println("La plaque ne respecte pas l'ancienne norme");
            return false;
        }

        for (int i = 0; i <= 3; i++) {
            if (!Character.isDigit(plaqueEU.charAt(i))) {
                System.out.println("La plaque ne respecte pas l'ancienne norme");
                return false;
            }
        }

        for (int i = 7; i <= 8; i++) {
            if (!Character.isDigit(plaqueEU.charAt(i))) {
                System.out.println("La plaque ne respecte pas l'ancienne norme");
                return false;
            }
        }
        System.out.println("La plaque respecte l'ancienne norme");
        return true;
    }
    
    public boolean sortPlaque (String plaque){
        if (plaque != null){
            if (checkPlaqueEu(plaque) == true){
                // plaque europeenne
                parcVoitures.add(plaque);
                System.out.println("Nouvelle plaque ajoutée");
                return true;
            } else if (checkPlaqueOld(plaque) == true) {
                // ancienne plaque
                parcVoitures.add(plaque);
                System.out.println("Ancienne plaque ajoutée");
                return true;
            } else {
                System.out.println("la plaque ne respecte aucune norme.");
                return false;
            }
        }
        return false;
    }


    public int costPlate(String plate,int letterPrice) {
        if (sortPlaque(plate) == true) {
        int totalPrice = 0;
            for (int i = 0; i < plate.length(); i++) {
                totalPrice += letterPrice;
            }
            System.out.println("Le coût total de cette plaque est de :");
            return (totalPrice);
        }else {return 0;}
    }
}
