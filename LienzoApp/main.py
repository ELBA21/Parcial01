from Acesorio import Acesorio
from Lapiz import Lapiz
from Pincel import Pincel
from Spray  import Spray
if __name__ == "__main__":
    A = Acesorio(0,"","",0,0)
    L = Lapiz(1, "Lapiz", "Rojo", 3,1)
    P = Pincel(2, "Pincel", "Rojo", 3, 1)
    S = Spray(3,"Spray", "Rojo", 3,1)

    print("Seleccione un Accesorio para dibujar")
    print("1) Lapiz")
    print("2) Pincel")
    print("3) Spray")
