class Fach:
    def_init_(self,fach_id,name):
    self.fach_id = fach_id
    self.name = name
    
    def getName(self):
        return self.name
        
    def getFachID(self):
        return self.fach_id

class Note:
    def_init_(self,fach_id,punkte,ist_schriftlich):
    self.fach_id = fach_id
    self.punkte = punkte
    self.ist_schriftlich = ist_schriftlich
    
    def getFachID(self):
        return self.fach_id
        
    def get.IstSchriftlich(self):
        return self.ist_schriftlich
        
    def getPunkte (self):
        return self.punkte
        
class Schueler:
    
    def_init_(self):
    self.faecher = []
    self.noten = []
    
    def berechnenDurchschnittSchriftlich(self,pFach):
        fach_id = -1
        for fach in self.faecher:
            if fach.getName()== pFach:
                fach_id = fach.getFachID()
        summe = 0
        anzahl = 0
        
        for note in self.noten:
            if note.getFachID() == fach_if and note.getIstSchriftlich() == True:
                summe = summe + note.getPunkte()
                anzahl = anzahl + 1
                
        if anzahl == 0:
            return 0.0
        else:
            return summe / anzahl
            