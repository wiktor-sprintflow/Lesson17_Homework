package task01;

enum Season {
    WINTER("Zima", new String[]{"Grudzień", "Styczeń", "Luty"}),
    SPRING("Wiosna", new String[]{"Marzec", "Kwiecień", "Maj"}),
    SUMMER("Lato", new String[]{"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUMN("Jesień", new String[]{"Wrzesień", "Październik", "Listopad"});

    private final String name;
    private final String[] months;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    static Season findSeasonByName(String plName) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            if (season.getName().toUpperCase().equals(plName.toUpperCase())) {
                return season;
            }
        }
        throw new NoSeasonFoundException();
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }
}
