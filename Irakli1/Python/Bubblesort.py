import random

i = int (input("Bitte geben Sie die Länge der Tabelle an:"))
liste = [random.randint(0, 100) for _ in range(10)]
print(f"Vorherige Tabelle: {liste}")
def bubble_sort(liste):
    n = len(liste)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if liste[j] > liste[j+1]:
                liste[j], liste[j+1] = liste[j+1], liste[j]
    return liste      

ergebnis = bubble_sort(liste)
print(ergebnis)
