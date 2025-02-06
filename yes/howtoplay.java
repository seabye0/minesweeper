import greenfoot.*;  

// Clasa "howtoplay" extinde World
// acest cod este pentru ecranul de instrucțiuni al jocului, in timp ce cel anterior a fost doar pentru buton
public class howtoplay extends World
{
    // constructorul pentru ecranul "howtoplay"
    // inițializăm lumea cu dimensiunea 600x400 și celule de 1x1 pixel
    public howtoplay()
    {    
        super(600, 400, 1); 
        prepare();  // Apelează metoda prepare pentru a adăuga butonul "Back"
    }
    
    // Metodă pentru a adăuga obiecte în lume (butoane)
    public void prepare()
    {
        // Crearea și adăugarea butonului "Back"
        back b = new back();  // creăm un nou obiect de tip back (înapoi)
        GreenfootImage c = b.getImage();  // obținem imaginea butonului
        c.scale(90, 30);  // o redimensionăm la 90x30 pixeli
        b.setImage(c);  // aplicăm imaginea redimensionată butonului
        addObject(b, 90, 350);  // plasăm butonul în lume la coordonatele (90, 350)
    }
}
