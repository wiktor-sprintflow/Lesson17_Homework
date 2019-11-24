package task01;

class NoSeasonFoundException extends RuntimeException {
    NoSeasonFoundException() {
        super("Nie znaleziono podanej pory roku na liście.");
    }
}
