import random
 
eingabe = input("Gebe eine natürliche Zahl ein:")

wert = int(eingabe)
 
print(f"dein Wert ist: {wert} \n")
 


liste = [random.randint(0, 100) for _ in range(1000)]


liste.sort()
 


def binaere_suche(liste, wert):

    kleiner = 0

    größer = len(liste) - 1

    while kleiner <= größer:

        mitte = (kleiner + größer) // 2

        if liste[mitte] == wert:

            return mitte  

        elif liste[mitte] < wert:

            kleiner = mitte + 1  

        else:

            größer = mitte - 1  

    return -1  
 


index = binaere_suche(liste, wert)
 
if index != -1:

    print(f"Der Wert {wert} wurde an Index {index} gefunden.")

else:

    print(f"Der Wert {wert} ist nicht in der Liste enthalten.")

