void main() {
    // leeres Array der Größe 5
    double[] grades = new double[5];

    for (int i=0; i < grades.length; i++){
        String userInput = IO.readln("Note " + (i + 1) + ": ");
        grades[i] = Double.parseDouble(userInput);
    }
    // Summierung:
    double sum = 0;
    for (int i=0; i < grades.length; i++){
        sum = sum + grades[i];
        // Verkürzte Schreibweise:
        //sum += grades[i];
    }
    IO.println("Summe: " + sum);

    // Durchschnittsberechnung:
    double average = sum / grades.length;
    IO.println("Durchschnitt: " + average);

    // Gute Noten zählen:
    int goodGrades = 0;
    for (int i=0; i < grades.length; i++){
        if (grades[i] <= 2.5){
            goodGrades++;
        }
    }
    IO.println("Anzahl gute Noten: " + goodGrades);


    IO.println("Noten:");
    for (int i=0; i < grades.length; i++){
        IO.println(grades[i]);
    }
}