# Methoden in Java
## Definition
Beinhalten einen Codeblock, der bei Rückruf des Methodennamens ausgeführt wird. Übergabeparameter dienen dazu, einer Methode Werte/Objekte zu geben, die zur Lösung einer Aufgabe notwendig sind. Methoden mit Rückgabewert liefern ein Ergebnis, welches i.d.R 


## Synonyme
- Operationen (OOP, UML)
- Funktionen (Funktionale Programmiersprachen)
- Prozeduren (Strukturierte Programmierung  Pascal, Basic)

## Deklaration
```java
public static int addiere(int z1, int z2) {
    return z1+z2
}
```

### Sichtbarkeiten
- public (öffentlich)-> Jeder kann zugreifen
- private (privat)-> Nur die Klasse selbst kann zugreifen
- protected (gesichert)->           ''              und erbende Klassen
- default         -> ähnlich wie public, wenn Sichtbarkeit undefiniert


### Static
Der Zusatz `static` gibt an, dass die Methode/das Attribut über den Klassennamen aufgerufen werden kann, ohne das Objekte notwendig sind.

### Rückgabetyp
- void => M. hat keinen Rückgabewert (kein return im Codeblock)
       => z.B. ausgabeText(`Hallo`)

- int    => return Befehl muss vorhanden sein ... (am Ende der M.)  
(double)  
(char) => hinter dem return Befehl muss ein Wort oder eine Variable stehen, die den gleichen Datentyp hat.  
(String)  
(MeinSchüler)