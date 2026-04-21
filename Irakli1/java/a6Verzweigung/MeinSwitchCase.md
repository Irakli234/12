# Switch Case in Java

## Funktion
Die Switch-Case Umgebung erlaubt eine Mehrfachauswahl eines ganzzahligen Wertes (`int`), eines Strings oder einer enum-Aufzählung. In den runden Klammern der Switch-Anweisung steht der sogenannte `Selektor`. Der Selektor ist i.d.r eine Integer-Variable. Hinter jedem `case` (Fall) steht ein Wert der als Auswahlkriterium dient. Hat also `auswahl` den Wert `0` oder `1`, wird der dahinter stehende Code bis zum `break`-Befehl ausgeführt.
Für den fall, das `auswahl` einen Wert hat, der mit keinem `case:` abgedeckt ist, wird der Code hinter dem Fall `default:` ausgeführt. Nach einem `break`-Befehl, wird der Codeblock der Switch-case-Umgebung verlassen.

## If oder Switch Case
Jede Switch-Case Umgebung kann auch mit einer if-else Struktur realisiert werden. Umgerkehrt jedoch nicht.


## Codebeispiel
```java
  int auswahl = 1;

       
        switch (auswahl) {
            case 0: 
            case 1: System.out.println
            ("auswahl = 0 oder 1");
            break;

            case 1: System.out.println("auswahl = 1");
            break;    
        
            default:
            System.out.println("keine auswahl getroffen");
                break;
        }
```