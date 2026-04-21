import random
liste = [random.randint(0, 20) for _ in range(10)]
print (liste)


eingabe = input("Gebe eine natürliche Zahl ein:")
wert = int(eingabe)
print (f"dein Wert ist: {wert} \n")

def lineareSuche(liste, wert):
    gefunden = 0
    for index, element in enumerate(liste):
        if element == wert:
            print(index+1)
            gefunden = 1

    if gefunden == 0:
        print("kein Wert gefunden")

lineareSuche(liste, wert)