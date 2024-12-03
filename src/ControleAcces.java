import java.util.Scanner;

public class ControleAcces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String carteValide = "12345";
        String codePinCorrect = "6789";
        int tentatives = 0;
        final int maxTentatives = 3;

        String etat = "ATTENTE_CARTE";

        while (!etat.equals("ALARME")) {
            switch (etat) {
                case "ATTENTE_CARTE":
                    System.out.println("Veuillez entrer votre carte :");
                    String carte = sc.nextLine();

                    if (carte.equals(carteValide)) {
                        etat = "VERIFICATION_CODE";
                    } else {
                        System.out.println("Carte invalide.");
                        etat = "ACCES_REFUSE";
                    }
                    break;

                case "VERIFICATION_CODE":
                    System.out.println("Veuillez entrer votre code PIN :");
                    String codePin = sc.nextLine();

                    if (codePin.equals(codePinCorrect)) {
                        etat = "ACCES_ACCORDE";
                    } else {
                        System.out.println("Code incorrect.");
                        tentatives++;
                        if (tentatives >= maxTentatives) {
                            etat = "ALARME";
                        } else {
                            etat = "ACCES_REFUSE";
                        }
                    }
                    break;

                case "ACCES_ACCORDE":
                    System.out.println("_______________Accès accordé____________. \nBienvenue !");

                    etat = "ATTENTE_CARTE";
                    tentatives = 0;
                    break;

                case "ACCES_REFUSE":
                    System.out.println("_________________Accès refusé_______________. Nouvelle tentative ? (O/N)");
                    String reponse = sc.nextLine();

                    if (reponse.equalsIgnoreCase("O")) {
                        etat = "ATTENTE_CARTE";
                    } else {
                        System.out.println("Processus terminé.");
                        etat = "ATTENTE_CARTE";
                    }
                    break;
            }
        }

        System.out.println("ALERTE ! Trois tentatives incorrectes ont été effectuées.");
        sc.close();
    }
}
