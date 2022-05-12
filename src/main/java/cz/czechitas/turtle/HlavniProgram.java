package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliCtverecek(zofka,100.0);
        zofka.setLocation(600,600);

        Turtle leonardo;
        leonardo = new Turtle();
        leonardo.setPenColor(Color.MAGENTA);
        leonardo.setLocation(200,200);
        nakresliCtverecek(leonardo,200.0);
        nakresliMnohouhelnik(zofka,50,6);

        zofka.setLocation(200,200);
        nakresliKolecko(zofka,50);
    }

    private void nakresliCtverecek(Turtle turtle,double delkaStrany) {
        nakresliMnohouhelnik(turtle,delkaStrany,4);
        }
    private void nakresliKolecko(Turtle turtle,double delkaStrany) {
        nakresliMnohouhelnik(turtle,delkaStrany,24);
    }

    private void nakresliMnohouhelnik(Turtle turtle,double delkaStrany, int pocetStran) {
        double uhel = 360.0/pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }

    }
}
