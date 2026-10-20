// Main-Methode
void main() {

    methode2();
}
// Direkt Code außerhalb Main-Methode
// int i = 3;

void methode2() {
    // Code der nicht immer sinnvoll ist
    IO.println("Hi");
    IO.println("Hi 2");
    IO.println("Hi 3");
    String ergebnis = kaesebrot();
    // Aufruf ist so, als ob wir das hier schreiben würden:
    // String ergebnis = "Käsebrot";
    // Ergebnis können wir wie einen normalen String weiterverarbeiten:
    IO.println(ergebnis.toUpperCase() + " ist lecker.");
    int ergebnisZahl = ganzeZahl(120.00000003);
    IO.println(ergebnisZahl * 2);
}

String kaesebrot() {
    return "Käsebrot";
}

// Methode, die eine Kommazahl (double) in eine Ganzzahl umwandelt (int)
int ganzeZahl(double kommazahl){
    // Explizite Typkonvertierung: double zu int
    // Dafür benutzen wir Cast-Operator: (int)
    int ganzeZahl = (int) kommazahl;
    return ganzeZahl;
}