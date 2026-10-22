void main() {
    int number = 3;
    IO.println(isEven(number));
}

boolean isEven(int number){
    if (number % 2 == 0){
        return true;
    }
    return false;
}

// PAP: Siehe Bilddatei "Ist Zahl Gerade.png"
//Pseudocode:
/*
Funktion isEven(number):
    Teile number mit Rest durch 2
    Wenn Rest gleich 0:
        Gib wahr zurück
    Sonst:
        Gib falsch zurück
Ende Funktion

ODER:

Wenn Zahl modulo 2 gleich 0:
    Zahl ist gerade
Sonst:
    Zahl ist ungerade
 */