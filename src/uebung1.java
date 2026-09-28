void main() {
    // Aufgabe 1
    int[] numbers1 = {10, 20, 30, 40, 50};

//    int[] numbers2Alt = new int[5];
//    numbers2Alt[0] = 10;
//    numbers2Alt[1] = 20;
//    numbers2Alt[2] = 30;
//    numbers2Alt[3] = 40;
//    numbers2Alt[4] = 50;
    IO.println(numbers1[0]); // erste Stelle
    IO.println(numbers1[2]); // dritte Stelle
    IO.println(numbers1[4]); // fünfte Stelle
//    IO.println(numbers1[5]); // ArrayIndexOutOfBounds Exception

    // Aufgabe 2
    int[] numbers2 = {10, 20, 30, 40, 50, 60};
    numbers2[1] = 99;
    IO.println(numbers2.length); // Länge des Arrays: 6
    numbers2[numbers2.length-1] = 77; // Letzter Index: Länge minus 1

    // Aufgabe 3
    int[] numbers3 = {4, 7, 2, 9, 1};

    for (int i=0; i<numbers3.length; i++){
        IO.println(numbers3[i]);
    }

    // Aufgabe 4
    int[] numbers4 = {4, 7, 2, 9, 1};

    for (int i=0; i<numbers4.length; i++){
        IO.println("Index " + i + ": " + numbers4[i]);
    }

    String[] myFavourites = {"Star Wars", "Dune", "Terminator", "Star Trek"};
    for (int i=0; i<myFavourites.length; i++){
        IO.println("Index " + i + ": " + myFavourites[i]);
    }

}