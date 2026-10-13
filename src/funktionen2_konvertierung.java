void main() {
    //int seconds = toSeconds(1.5);
    //IO.println(seconds);

    double kommazahl = 5.9;
    int ganzzahl = (int) kommazahl; // explizite Typkonvertierung (muss von uns hingeschrieben werden)
    IO.println(kommazahl);
    IO.println(ganzzahl);
    // auch: downcasting, narrowing casting, explicit type casting
    // Gefahr: Informationsverlust!
    // Konvertierung erfolgt mit Cast-Operator: (zieltyp)

    int a = 3;
    double b = a; // implizite Typkonvertierung (erfolgt automatisch)
    IO.println(b);
    // auch: upcasting, widening casting, implicit type casting

}
// Schreiben Sie eine Funktion, die Minuten in Sekunden umrechnet.
// Beispiel:
// Eingabe double: 1.5
// Ausgabe int: 90
int toSeconds(double minutes){
    double seconds = 60 * minutes;
    return (int) seconds;
}