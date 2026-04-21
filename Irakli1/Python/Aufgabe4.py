import random
liste = [random.randint(0, 20) for _ in range(10)]
print (liste)
while True:

 eingabe = input("Gebe eine natürliche Zahl ein:")
 wert = int(eingabe)
    
 print (f"dein Wert ist: {wert} \n")

 if wert == -1:
    break

def lineareSuche(liste, wert):

    gefunden = 0

    for index, element in enumerate(liste):
        if element == wert:



            print(f"Wert gefunden an Index: {index}")
            gefunden += 1
    print(f"Dein Wert wurde {gefunden} Mal gefunden.")            



lineareSuche(liste, wert)
