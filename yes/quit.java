import greenfoot.*; 

// Clasa "quit" cextinde Actor
//este codul pentru butonul de ieșire din joc
public class quit extends Actor
{
    public void act()
    {
        // Verifică dacă butonul a fost apăsat de utilizator cu mouse-ul
        if (Greenfoot.mouseClicked(this))
        {
            // Dacă butonul a fost apăsat, oprește simularea și închide jocul
            Greenfoot.stop();
        }
    }
}
