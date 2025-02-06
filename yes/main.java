import greenfoot.*; 

// Clasa "main" extinde World
// acesata este meniul principal al jocului
public class main extends World
{
    // construim meniul principal
    // inițializaăm lumea cu dimensiunea 600x400 și celule de 1x1 pixel
    public main()
    {    
        super(600, 400, 1);
        prepare();  // apelează metoda pentru a adăuga butoanele
    }
    
    public void prepare()
    {
        // Crearea și adăugarea butonului "Play"
        play b = new play();  // Creează un nou obiect de tip "play"
        GreenfootImage c = b.getImage();  // Obține imaginea butonului
        c.scale(90, 30);  // Redimensionează imaginea la 90x30 pixeli
        b.setImage(c);  // Aplică imaginea redimensionată
        addObject(b, 110, 210);  // Plasează butonul în lume la coordonatele (110, 210)
        
        // la fel ca mai sus pentru butonul  "How to Play"
        how a = new how();  
        c = a.getImage();  
        c.scale(90, 30);  
        a.setImage(c);  
        addObject(a, 110, 250); 
        
        // la fel și pentru butonul "Quit"
        quit d = new quit();  
        c = d.getImage();  
        c.scale(90, 30);  
        d.setImage(c);  
        addObject(d, 110,290);
    }
}
