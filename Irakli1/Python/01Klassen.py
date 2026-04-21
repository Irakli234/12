class TShirt:
    def __init__(self, marke="Jeep", größe="M", preis="150"):
        self.marke = marke
        self.größe = größe
        self.preis = preis
        



    @property
    def größe(self):
        return self._größe

    @größe.setter
    def größe(self, value):
        if value != ("L", "M", "S"): 
            raise ValueError("Ungültige Größe")
        elif not value: raise ValueError("Ungültige Größe")
        self.__größe = value


    @property
    def preis(self):
        return self.__preis

    @preis.setter
    def preis(self, value):
        if not (120 <= value <= 480):
            raise ValueError("Ungültiges Preis")
        self.__preis = value

    def __str__(self):
        return f"Das T-Shirt von {self.marke} in der größe {self.__größe} kostet {self.__preis} Euro."

# Test
TShirt1 = TShirt()
print(TShirt1)

TShirt2 = TShirt("Nike", "L", "670")
print(TShirt2)


