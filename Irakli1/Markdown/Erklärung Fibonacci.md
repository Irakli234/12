# Fibonacci Zahlenreihe

Die Fibonacci-Zahlenreihe ist eine Folge von Zahlen, bei der jede Zahl die Summe der beiden vorhergehenden Zahlen ist. Die Reihenfolge beginnt normalerweise mit 0 und 1:

```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

Mathematisch kann die Fibonacci-Folge wie folgt definiert werden:

```
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) für n >= 2
```

## Beispiel in Java

Das folgende Java-Programm soll die Fibonacci-Zahlen bis zu einem angegebenen Endwert mit einer Methode `getFibonacci(int endwert)` berechnen. Implementieren Sie die Methode.

```java
public class Fibonacci {
    public static void main(String[] args) {
        int endwert = 10;
        printFibonacci(endwert);
    }

    public static void printFibonacci(int endwert) {
       //hier Code ergänzen
    }
}
```

## Beschreibung des Codes
1. Die Methode `printFibonacci(int endwert)` berechnet die Fibonacci-Zahlen und gibt sie aus.
2. Sie beginnt mit `0` und `1` und summiert diese iterativ.
3. Die Berechnung endet, sobald der nächste Fibonacci-Wert den angegebenen `endwert` überschreitet.

## Pseudocode
```python
Funktion printFibonacci(endwert)
    a <- 0
    b <- 1
    Ausgabe "Fibonacci Reihenfolge: a, b"
    SOLANGE b <= endwert
        next <- a + b
        WENN next > endwert
            BREAK
        ENDE WENN
        
        Ausgabe ","+next
        a <- b
        b <- next
    ENDE SOLANGE
    Ausgabe neue Zeile
Ende der Funktion
```

