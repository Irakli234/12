# Verzweigung

Eine Verzweigung wird in Java mit dem `if`-Befehl erzeugt.

## Einfach Verzweigung
Nach dem If-Befehl kann in den Klammern eine Bedingung formuliert werden, die als Ergebnis `wahr` oder `falsch` liefert. Dies können `boolsche`-Variablen oder Bedingungen mit den Operatoren `>`,`<`,`>=`,`<=`,`==` oder `!=` sein.

> Liefert die Bedingung das Ergebnis `false` wird der Codeblock übersprungen.
```java
if(<Bedingung>) {
    //führe aus wenn Bedingung wahr
}
```

## Zweifach Verzweigung
>Es kann immer nur einer der beiden Codeblöcke ausgeführt werden 

## Mehrfachverzweigung

```java
if(<Bedingung1>) {
    //führe aus wenn Bedingung1 wahr
}
else if(<Bedingung2>) {
    //führe aus wenn Bedingung1 falsch und Bedingung2 wahr ist
}
else {
    //führe aus wenn alle obigen Bedingungen nicht wahr sind
}
```