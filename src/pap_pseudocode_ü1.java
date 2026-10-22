void main() {
    int[] myNumbers = {4, 6, 10, 2, 8};
    int biggest = getBiggestNumber(myNumbers);
    IO.println(biggest);
}

int getBiggestNumber(int[] array){
    int biggestNumber = array[0];
    for (int i = 0; i < array.length; i++){
        if (array[i] > biggestNumber){
            biggestNumber = array[i];
        }
    }
    return biggestNumber;
}

// PAP: Siehe Bilddatei Größte Zahl im Array finden
// Pseudocode
/*
Funktion biggestNumber(A):
    bN = A an Stelle 1
    Für jedes Element x in A:
        Wenn x > bN:
            bN = x
    Ausgabe bN
Ende Funktion

Größte Zahl gleich Erste Zahl im Array
Für jede Zahl im Array:
    Wenn Zahl größer als Größte Zahl:
        Größte Zahl gleich Zahl
Gib Größte Zahl zurück

Start
Funktion = größteZahl(Array)
    Max = Erste Zahl im Array
    Gehe alle anderen Zahlen durch
        Wenn eine Zahl größer als Max ist:
            Max = diese Zahl
    Gib Max zurück
Ende
*/