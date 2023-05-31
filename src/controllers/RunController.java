package controllers;

import interfaces.KorposzczurInterface;
import models.Shrek;
import models.Osiol;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController {
    /**
     * Class to run program
     */
    public void run() {
        System.out.println("Witaj przybyszu,");
        System.out.println("Tutaj twa historia się zaczyna.");
        System.out.println("Wybierz jedną z poniższych klas.");
        System.out.println("* | Shrek");
        System.out.println("* | Osioł");
        System.out.println("Podaj nazwę ścieżki życia: ");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "Shrek" -> {
                Shrek shrek = new Shrek();
                shrek.welcome(decision);
                shrek.breakLine();
                System.out.println("Podaj imię postaci");
                shrek.setName(scanner.nextLine());
                System.out.println("Podaj wiek postaci (5 - 80)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 5 || age > 80) {
                    System.out.println("Nieprawidłowy wiek. Tworzenie postaci anulowane.");
                    return;
                }
                shrek.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (Paker, Daddy Body, Thick, Grubcio)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                shrek.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (Czarne, Blond, Siwe, Łysy)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                shrek.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (czerwone, pomarańczowe, białe, czarne)");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;
                }
                shrek.setEyeColor(eyeColor);
                System.out.println("Czy ma tatuaż? (tak / nie)");
                String hasTattoo = scanner.nextLine();
                if (!isValidTattoo(hasTattoo)) {
                    System.out.println("Nieprawidłowa odpowiedź. Tworzenie postaci anulowane.");
                    return;
                }
                shrek.setHasTattoo(hasTattoo);
                System.out.println("Czy chcesz stworzyć postać? (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(shrek.ShrekData()));
                } else {
                    System.out.println("Tworzenie postaci anulowane");
                }
            }
            case "Osioł" -> {
                Osiol osiol = new Osiol();
                osiol.welcome(decision);
                osiol.breakLine();
                System.out.println("Podaj imię postaci");
                osiol.setName(scanner.nextLine());
                System.out.println("Podaj wiek postaci (5 - 80)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 5 || age > 80) {
                    System.out.println("Nieprawidłowy wiek. Tworzenie postaci anulowane.");
                    return;
                }
                osiol.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (Paker, Daddy Body, Thick, Grubcio)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                osiol.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (Czarne, Blond, Siwe, Łysy)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                osiol.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (czerwone, pomarańczowe, białe, czarne)");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;
                }
                osiol.setEyeColor(eyeColor);
                System.out.println("Podaj kolor oczu (czerwone, pomarańczowe, białe, czarne)");
                String hasTattoo = scanner.nextLine();
                if (!isValidTattoo(hasTattoo)) {
                    System.out.println("Nieprawidłowa odpowiedź. Tworzenie postaci anulowane.");
                    return;
                }
                osiol.setHasTattoo(hasTattoo);
                System.out.println("Czy ma tatuaż? (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(osiol.OsiolData()));
                } else {
                    System.out.println("Tworzenie postaci anulowane");
                }
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Zakończono Tworzenie Postaci Witamy w Zasiedmiogórogrodzie");
    }

    private boolean isValidHairColor(String hairColor) {
        // Add your validation logic for hair color here
        // Return true if hair color is valid, false otherwise
        String[] validHairColors = {"Czarne", "Blond", "Siwe", "Łysy"};
        return Arrays.asList(validHairColors).contains(hairColor);
    }

    private boolean isValidBodyBuild(String bodyBuild) {
        // Add your validation logic for body build here
        // Return true if body build is valid, false otherwise
        String[] validBodyBuilds = {"Paker", "Daddy Body", "Thick", "Grubcio"};
        return Arrays.asList(validBodyBuilds).contains(bodyBuild);
    }

    private boolean isValidEyeColor(String eyeColor) {
        // Add your validation logic for eye color here
        // Return true if eye color is valid, false otherwise
        String[] validEyeColors = {"czerwone", "pomarańczowe", "białe", "czarne"};
        return Arrays.asList(validEyeColors).contains(eyeColor);
    }

    private boolean isValidTattoo(String hasTattoo) {
        // Add your validation logic for tattoo here
        // Return true if tattoo value is valid, false otherwise
        return hasTattoo.equalsIgnoreCase("tak") || hasTattoo.equalsIgnoreCase("nie");
    }

    private void breakLine() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        RunController controller = new RunController();
        controller.run();
    }
}