void main() {
    String youMama = "Nette Dame";
    IO.println(youMama);

    String youBigMama = youMama.toUpperCase();
    IO.println(youBigMama);

    char[] charactersYouMama = youMama.toCharArray();
    for (char c : charactersYouMama){
        IO.println(c);
    }

    boolean isYouMamaFat = youMama.contains("fett");
    IO.println(isYouMamaFat);
    boolean isYouMamaNett = youMama.contains("Nett");
    IO.println(isYouMamaNett);

    // Aufruf der Funktion:
    boolean adult1 = isAdult(20);
    boolean adult2 = isAdult(3);
    IO.println(adult1);
    IO.println(adult2);

    // Aufruf der Funktion add():
    int sum = add(13, 47);
    IO.println(sum);
    int sum2 = add(3, 299);
    IO.println(sum2);
}

//Definition der Funktion:
boolean isAdult(int age){
    return age >= 18;
}

int add(int number1, int number2){
    return number1 + number2;
}