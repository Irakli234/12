class Klasse:
    # Klassenattribut
    klassen_attribut = 0  # wird von allen Instanzen geteilt

    #Konstruktoren
    def __init__(self, p_parameter=None):
        # -privatesAttribut:Typ
        self.__privates_attribut = 0

        # #geschütztesAttribut:Typ
        self._geschuetztes_attribut = "intern"

        # +öffentlichesAttribut:Typ
        self.oeffentliches_attribut = 0.0

        # -attributMitZusicherung:Typ {Zusicherung: > 0}
        self.__attribut_mit_zusicherung = 1  # Standardwert

        # -attributMitAnfangswert:Typ = Anfangswert
        self.attribut_mit_anfangswert = True

        # -attributKollektion:Typ[anzElemente]
        self.attribut_kollektion = []

        # Optionaler Parameter für die Zusicherung
        if p_parameter is not None:
            self.__attribut_mit_zusicherung = p_parameter  # über Property

        # Klassenattribut erhöhen
        Klasse.klassen_attribut += 1

    # ---------------- Operationen ----------------

    def __private_operation(self):
        # nur intern nutzbar
        self.__privates_attribut += 1

    def _geschuetzte_operation(self) -> str:
        # alle Buchstaben in Grossbuchstaben umwandeln
        return self._geschuetztes_attribut.upper()

    def oeffentliche_operation(self):
        # private und geschützte Operation aufrufen
        self.__private_operation()
        self._geschuetzte_operation()

    def operation1(self, p_parameter):
        # Liste genau p_parameter-mal mit 0 füllen
        self.attribut_kollektion = [0] * p_parameter

    def operation2(self):
        # gibt zusammengefasste Info über Attribute zurück
        return (f"privat={self.__privates_attribut}, "
                f"privat mit Zusicherung={self.attribut_mit_zusicherung}, "
                f"geschuetzt='{self._geschuetztes_attribut}', "
                f"oeffentlich={self.oeffentliches_attribut}, "
                f"liste_len={len(self.attribut_kollektion)}")

    @classmethod
    def klassen_operation(cls):
        return cls.klassen_attribut

    def __set_zusicherungswert(self, wert):
        if wert <= 0:
            raise ValueError("Zusicherungswert muss > 0 sein")
        self.__attribut_mit_zusicherung = wert

    def __get_zusicherungswert(self):
        return self.__attribut_mit_zusicherung

    # Property für attribut_mit_zusicherung
    attribut_mit_zusicherung = property(__get_zusicherungswert, __set_zusicherungswert)


# Standard-Konstruktor
x = Klasse()
x.oeffentliche_operation()
x.operation1(3)
print(x.operation2())
print("Klassenzähler:", Klasse.klassen_operation())

# Konstruktor mit Parameter
y = Klasse(5)
print("Zusicherung y:", y.attribut_mit_zusicherung)

# Fehlerbeispiel (Zusicherung verletzt):
try:
    y.attribut_mit_zusicherung = 0  # darf nicht
except ValueError as e:
    print("Fehler:", e)








