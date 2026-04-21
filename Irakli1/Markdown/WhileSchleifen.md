# While Schleifen in Java
Eine `while-Schleife` sollte verwendet werden, wenn die Anzahl der Wiederholungen nicht im Voraus bekannt ist und die Schleife so lange laufen soll, wie eine bestimmte Bedingung wahr bleibt. Sie ist besonders nützlich, wenn eine unbestimmte Anzahl an Iterationen benötigt wird, z.B. beim Warten auf Benutzereingaben oder das Überprüfen eines Zustands. Wenn die Bedingung von Anfang an nicht erfüllt ist, wird die Schleife gar nicht ausgeführt. Sollte man jedoch eine feste Anzahl an Wiederholungen kennen, ist eine `for-Schleife` oft besser geeignet.
## Beispielcode
```java
    public static void main(String[] args) {
                // 1.
                int i = 0;
        
                // 2. 
                while (i < 5) {
                    
                    // 3. 
                    System.out.println("Aktueller Wert von i: " + i);
        
                    // 4. 
                    i++;
        
                    // 5. 
                    if (i == 4) {
                        System.out.println("Wert von i ist 4, Schleife wird abgebrochen.");
                        break;  // Schleife wird hier vorzeitig verlassen
                    }
        
                    // 6. 
                    if (i == 2) {
                        System.out.println("Wert von i ist 2, überspringe den Rest der Iteration.");
                        i++;
                        continue;  // Überspringt den restlichen Code und fährt mit der nächsten Iteration fort
                    }
        
                    // Hier könnte auch noch zusätzlicher Code stehen, der in den Schleifenblock gehört,
                    // aber in unserem Fall wird dieser Code übersprungen, wenn i == 2 aufgrund von continue.
                }
        
                // 7. 
                System.out.println("Die Schleife ist nun beendet.");
            }
        }
```
## Erklärung
1. Initialisierung: Wir starten mit einer Variable i, die die Schleife steuert.

2. Bedingung: Die Schleife läuft, solange die Bedingung (i < 5) wahr ist.
3. Schleifenblock: Hier führen wir die eigentliche Logik der Schleife aus.
4. Iteration: Nach jedem Schleifendurchlauf erhöhen wir i um 1.
5. Break-Anweisung: Wenn i gleich 4 ist, brechen wir die Schleife vorzeitig.
6. Continue-Anweisung: Wenn i gleich 2 ist, überspringen wir den Rest der aktuellen Iteration.
7. Nach dem Ende der Schleife: Dieser Code wird ausgeführt, wenn die Schleife abgeschlossen oder abgebrochen wurde.


