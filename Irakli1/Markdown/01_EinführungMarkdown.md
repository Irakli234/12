# Einführung in Markdown 

## Ueberschriften
Mit dem `#`- Symbol können Überschriften erzeugt werden. 
### Beispielcode:

```markdown 
# Überschrift1
text...
## Überschrift2
text...
### Überschrift3
text...
```

## Nummerierungen
1. Erste Nummerierung
    - Zweite Nummerirungsebene

    - Erster Strichpunkt
        -Unterstrichpunkt
            -Unterstrichpunkt

1. Erste Nummer

wird erstellt mit:
```markdown
## Nummerierungen
1. Erste Nummerierung
    - Zweite Nummerirungsebene

    - Erster Strichpunkt
        -Unterstrichpunkt
            -Unterstrichpunkt2
1. Erste Nummerierung
    - Zweite Nummerirungsebene

    - Erster Strichpunkt
        -Unterstrichpunkt
            -Unterstrichpunkt2
```
## Mathematische Formeln

### Einfache Formeln

### Formel im Text
Der Satz des Phythagoras lautet: a^2+b^2=c^2$. Formeln im Text wie hier werden in Markdown in `$`-Zeichen eingefasst. Die obige Formel wird in  Markdown also so geschrieben:
`text...$a^2+b^2=c^2...text`
<>**Beispiel:**
>die erste binomische Formel lautet $(a+b)^2$ wurde mit `$(a+b)^2$` erstellt

### Formel als absatz
Soll eine Formel zwischen zwei Absätzen formatiert angezeigt werden, wird die Formel in doppelten Dollarzeichen `$$` eingefasst.
Hier die Formel von oben abgesetzt vom Text `$$(a+b)^2$$` erzeugt:

$$(a+b)^2$$

$$(\Omega+b)^2$$  

---

### Griechische Buchstaben
Alle griechische Buchstaben können über eine mathematische Formel und einem vorangestellten Backslash angezeigt werden.

#### Beispiele
- $\alpha$ wird erstellt mit `$\alpha$`
- $\Omega$ wird mit `$\Omega$`
- $\Delta$ wird mit `$\Delta$`
---
### Indizes
In Markdown können Ziffern und Text hoch- und tiefgestellt angezeigt werden.

#### Beispiel Tiefgestellt:
Die Spannung $U_{eff}$ ist die Effektivspannung und wird mit dem Code `$U_{eff}$` erstellt

#### Beipiel Hochgestellt:
Die komplexe Zahl $e^{j\omega t}$ wird mit dem Code `$e^{j\omega t}$` erstellt 
---
### Brüche
Brüche werden mit dem Befehl `$\frac{}{}$` oder `$\dfrac{}{}$` dargestellt werden. `$\dfrac{}{}$` wird größer dargestellt als `$\frac{}{}$`.

- $\frac{a^2}{x^5}$ wird dargestellt mit `$\frac{a^2+b^2=c^2}{x^5-7x+3}$`
- $\dfrac{a^2}{x^5}$ wird dargestellt mit `$\dfrac{a^2}{x^5}$`

---

### Wurzel
Bei der Wurzel werden das erste mal eckige Klammern `[]` verwendet. Diese beinhalten optionale Parameter. Die Notation stammt aus der Skriptsprache Latex.

- $\sqrt{2}$ wird mit `$\sqrt{2}$` erstellt
- $\sqrt[3]{81}=3$ wird mit `$\sqrt[3]{81}=3$` erstellt.

---
### Integral
Integral beschreibt das aussummieren vieler kleiner Teilen. Die Integralrechnung kann z.B. genutzt werden um die Flächen unter Kurven zu berechnen.
Der Befehl `\limits` sorgt dafür, dass die Integrationsgrenzen $a$ und $b$ über dem Summensymbol des Integrals angezeigt werden.

Die Formel:
- $$\int_a^b \limits f(x) \cdot dx$$

wird mit`$\int_a^b \limits f(x) \cdot dx$` erstellt.
