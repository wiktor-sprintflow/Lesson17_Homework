package task01;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        try {
            String seasonName = readSeason();
            Season season = Season.findSeasonByName(seasonName);
            System.out.println("Wartość typu Season dla wczytanej nazwy \"" + seasonName + "\" to: " + season + ".");
            System.out.println("Miesiące wchodzące w skład " + seasonName + " to: " + Season.getMonthsInSeason(season));
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
}
