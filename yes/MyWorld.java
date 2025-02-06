import greenfoot.*;  // am importat biblioteca Greenfoot pentru a lucra cu lumea și obiectele

// Clasa MyWorld extinde clasa World din Greenfoot
// Clasa MyWorld definește mediul de joc și inițializează obiectele din lume
public class MyWorld extends World
{
    // apelăm Constructorul MyWorld când lumea este creată
    public MyWorld()
    {
        // creăm lumea cu dimensiunea de 600x400 pixeli și celule de 1x1 pixel
        super(600, 400, 1);  
        prepare();  // prin apelarea metodei prepare adăugăm obiectele inițiale în lume
    }

    //configurarea inițială a lumii, adăugând pereți, casete invizibile, punctul de start și finish
    public void prepare()
    {
        // adăugam pereții secreți și dacă jucătorul calcă pe unul, va fi teleportat la start
        addSecret(180,100);
        addSecret(220,100);
        addSecret(300,100);
        addSecret(380,100);
        addSecret(460,100);
        addSecret(220,140);
        addSecret(340,140);
        addSecret(380,140);
        addSecret(460,140);
        addSecret(140,180);
        addSecret(140,220);
        addSecret(180,220);
        addSecret(260,220);
        addSecret(340,220);
        addSecret(380,220);
        addSecret(460,220);
        addSecret(220,260);
        addSecret(340,260);
        addSecret(380,260);
        addSecret(420,260);
        addSecret(180,300);
        addSecret(220,300);
        addSecret(260,300);
        addSecret(380,300);
        addSecret(420,300);
        addSecret(500,300);
        // Adăugarea pereților vizibili pentru a construi traseul de joc
        //adăugam pereții vizibili care definesc traseul, respectiv (unii dintre ei) ascund casetele secrete
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 100);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 140);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 180);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 220);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 260);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 300);
        }

        // creăm și adăugăm obiectului de finish (ținta finală a jucătorului)
        // redimensionăm imaginea obiectului finish pentru a se potrivi cu celulele
        // îl plasăm la coordonatele (540, 100)
        finish w = new finish();
        GreenfootImage c = w.getImage();
        c.scale(40,40);  
        w.setImage(c);
        addObject(w, 540, 100); 

        // creăm și adăugăm punctul de start pentru jucător
        // redimensionăm și plasăm la la (100, 340)  imaginea punctului de start
        start q = new start();
        c = q.getImage();
        c.scale(40,40); 
        q.setImage(c);
        addObject(q, 100, 340); 

        // la fel și pentru crearea, redimensionarea și plasarea jucatorului (gândăcelului)
        player a = new player();
        c = a.getImage();
        c.scale(32,40);  
        a.setImage(c);
        addObject(a, 100, 340); 
    }

    // Metodă pentru adăugarea unui perete vizibil la coordonatele specificate
    public void addWall(int x, int y)
    {
        wall b = new wall();
        GreenfootImage c = b.getImage();
        c.scale(40,40);  //redimensionăm imaginea peretului
        b.setImage(c);
        addObject(b, x, y);  // îl adăugăm la coordonatele x, y
    }

    // Metodă pentru adăugarea unui perete secret (care poate reseta sau teleporta jucătorul)
    public void addSecret(int x, int y)
    {
        secret a = new secret();
        addObject(a, x, y);  // îl adăugam la coordnatele x, y
    }
}
