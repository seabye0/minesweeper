import greenfoot.*; 

// Clasa "player" extinde Actor și permite jucătorului să interacționeze cu lumea
public class player extends Actor
{
    int ok1 = 1;  // Variabilă care controlează dacă jucătorul se poate mișca (1 = activ, 0 = oprit)
    int ok2 = 1;  // Variabilă care controlează dacă se afișează insigna la final (1 = activ, 0 = oprit)
    int i = 0;    // Contor pentru numărul de resetări ale jucătorului

    public void act()
    {
        // Referințe către diferite tipuri de obiecte din lume
        Actor wall;//perete vizibil
        Actor badge;//insigna
        Actor finish;//punctul de finish
        Actor secret;//perete invizibil

        // Obținem referința la lumea actuală
        MyWorld world = (MyWorld) getWorld();

        // Afișăm numărul de resetări pe ecran
        world.showText("Resets: " + i, 50, 25);

        // Verificăm dacă jucătorul se poate mișca (ok1 == 1)
        if (ok1 == 1)
        {
            // Obținem tasta apăsată de jucător, care este una dintre săgețile de la tastatură
            String key = Greenfoot.getKey();

            // Mișcare în sus
            if ("up".equals(key))
            {
                wall = getOneObjectAtOffset(0, -40, wall.class);  // Verifică peretele de sus
                finish = getOneObjectAtOffset(0, -40, finish.class);  // Verifică dacă este linia de finish
                secret = getOneObjectAtOffset(0, -40, secret.class);  // Verifică dacă este un perete secret

                // dacă exista finish sau doar perete vizibil, se muta pe casetă. Dar daca este un perete invzibil (secret) nu se ve mișca
                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX(), getY() - 40); // Se mută în sus
                        setRotation(0);  // Se rotește cu fața în sus
                    }
                    else
                    {
                        world.removeObject(wall);  // Elimină peretele secret
                        setLocation(100, 340);  // Resetează poziția jucătorului
                        i++;  // Crește contorul de resetări
                        setRotation(0);
                    }
                }
            }

            // Mișcare în jos
    
