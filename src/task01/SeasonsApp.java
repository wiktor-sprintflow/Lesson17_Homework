package task01;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        try {
            String season = readSeason();
            Season seasonName = Season.findSeasonByName(season);
            System.out.println("Wartość typu Season dla wczytanej nazwy \"" + season + "\" to: " + seasonName + ".");
            System.out.println("Miesiące wchodzące w skład " + season + " to: " + printMonths(seasonName));
        } catch (NoSeasonFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static String readSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        String season = scanner.nextLine();
        scanner.close();
        return season;
    }

    private static String printMonths(Season season) {
        String[] months = season.getMonths();
        return months[0] + ", " + months[1] + " i " + months[2] + ".";
    }
}
