def finde_Lagerplatz(pArtikelname):
    idxGefundenerLp = -1
    gefunden = False

    for idx in range(aAnz):
        name = self.derLagerplatz[idx].gibArtikelname()
        if name == pArtikelname:
            gefunden = True 
            idxGefundenerLp = idx
            self.dieGui.melden("Lagerplatz " +str(idxGefundenerLP) + " gefunden")

    if not gefunden:
        for idx in range(aAnz):
            frei = self.derLagerplatz[idx].istFrei()
            if frei == True:
                gefunden = TrueidxGefundenerLp = idxdieGui.melden("Ware wird eingelagert")

    if not gefunden:
        dieGui.melden("Lager voll, einlagern nicht möglich")

    return idxGefundenerLp
                        
    





    
