import greenfoot.*; 

// Clasa "how" extinde Actor
// acesta este codul pentru butonul care deschide panoul cu instrucțiuni (how to play)
public class how extends Actor
{
    public void act()
    {
        // dacă acest buton a fost apăsat de utilizator cu mouse-ul
        if (Greenfoot.mouseClicked(this))
        {
            // schimbă lumea la "howtoplay", care conține instrucțiunile jocului
            Greenfoot.setWorld(new howtoplay());
        }
    }
}
