class Auto:
    __anzahl_autos = 0
    __baujahr_max = 2025

    def __init__(self, marke, baujahr):
        if baujahr > Auto.__baujahr_max:
            raise ValueError(f"Baujahr {baujahr} ist größer als {Auto.__baujahr_max}")
        self.marke = marke
        self.baujahr = baujahr
        Auto.__anzahl_autos += 1

    @classmethod
    def get_anzahl(cls):
        return cls.__anzahl_autos

    @classmethod
    def get_baujahr_max(cls):
        return cls.__baujahr_max


    @classmethod
    def von_string(cls, auto_string):
        marke, baujahr = auto_string.split(";")
        return cls(marke, int(baujahr))

# Testcode
a1 = Auto("VW", 2010)
a2 = Auto("BMW", 2015)
a3 = Auto.von_string("Tesla;2020")

print("Gesamtanzahl Autos:", Auto.get_anzahl())
print("Max Baujahr erlaubt:", Auto.get_baujahr_max())




