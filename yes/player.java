import greenfoot.*; 

// Clasa "player" extinde Actor și permite jucătorului să interacționeze cu lumea
public class player extends Actor
{
    int ok1 = 1;  // Variabilă care controlează dacă jucătorul se poate mișca (1 = activ, 0 = oprit)
    int ok2 = 0;  // Variabilă care controlează dacă se afișează insigna la final (1 = activ, 0 = oprit)
    int i = 0;    // Contor pentru numărul de resetări ale jucătorului

    public void act()
    {
        // Referințe către diferite tipuri de obiecte din lume
        Actor wall;//perete vizibil
        Actor badge;//insigna
        Actor finish;//punctul de finish
        Actor secret;//perete invizibil
        Actor retry;//butonul de reincercare.

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
            if ("down".equals(key))
            {
                wall = getOneObjectAtOffset(0, 40, wall.class);
                finish = getOneObjectAtOffset(0, 40, finish.class);
                secret = getOneObjectAtOffset(0, 40, secret.class);

                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX(), getY() + 40);
                        setRotation(180); // Se rotește cu fața în jos
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100, 340);
                        i++;
                        setRotation(0);
                    }
                }
            }

            // Mișcare la dreapta
            if ("right".equals(key))
            {
                wall = getOneObjectAtOffset(40, 0, wall.class);
                finish = getOneObjectAtOffset(40, 0, finish.class);
                secret = getOneObjectAtOffset(40, 0, secret.class);

                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX() + 40, getY());
                        setRotation(90); // Se rotește spre dreapta
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100, 340);
                        i++;
                        setRotation(0);
                    }
                }
            }

            // Mișcare la stânga
            if ("left".equals(key))
            {
                wall = getOneObjectAtOffset(-40, 0, wall.class);
                finish = getOneObjectAtOffset(-40, 0, finish.class);
                secret = getOneObjectAtOffset(-40, 0, secret.class);

                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX() - 40, getY());
                        setRotation(-90); // Se rotește spre stânga
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100, 340);
                        i++;
                        setRotation(0);
                    }
                }
            }
        }

        // Verificăm dacă jucătorul a ajuns la finish
        finish = getOneObjectAtOffset(0, 0, finish.class);
        
        if (finish != null)
        {
            ok1 = 0;  // Oprește mișcarea jucătorului

            if (ok2 == 0)  // Dacă insigna și efectele finale nu au fost afișate încă
            {
                // creăm efectul de overlay la final
                secret c = new secret();
                GreenfootImage q = c.getImage();
                q.scale(600, 400);  // cu ajutorul  măririi imaginii pentru a acoperi întregul ecran

                world.addObject(c, 300, 200);  // AdaugăM efectul de finish

                // Creăm o tranziție prin creșterea treptată a transparenței
                for (int i = 1; i <= 9; i++)
                {
                    q.setTransparency(i * 25);  // Crește transparența (maxim 255)
                    Greenfoot.delay(5);  // Pauză pentru efect vizual
                }

                // Adaugă insigna de victorie în mijlocul ecranului
                badge a = new badge();
                GreenfootImage b = a.getImage();
                b.scale(b.getWidth() - 320, b.getHeight() - 320);  // Redimensionează insigna
                world.addObject(a, 300, 200);

                ok2 = 1;  // Setează variabila pentru a indica afișarea finală
                retry z=new retry();
                GreenfootImage u = z.getImage();  // obținem imaginea butonului
                u.scale(90, 30);  // o redimensionăm la 90x30 pixeli
                z.setImage(u);  // aplicăm imaginea redimensionată butonului
                world.addObject(z, 90, 350);  // plasăm butonul în lume la coordonatele (90, 350)
            }
            // Ștergem afișajul cu numărul de resetări
            world.showText(" ", 50, 25);
        }
    }
}
