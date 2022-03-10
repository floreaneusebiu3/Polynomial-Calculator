import java.util.ArrayList;
import java.util.Collections;

public class Model {

    public Model() {
    }

    public void printPolinom(Polinom p) {
        for (Molinom m : p.getTermeni()) {
            if (p.getTermeni().indexOf(m) == 0)
                System.out.print(m);
            else
                System.out.print(" + " + m);
        }
    }


    public String makeStringfromDouble(ArrayList<DoubleMolinom> rez) {
        String rezultat = new String();

        for (DoubleMolinom r : rez) {

            if (rez.indexOf(r) == 0) {
                if (r.getRank() == 0)
                    rezultat = rezultat + r.getCoef();
                else if (r.getCoef() == 0)
                    rezultat = rezultat;
                else
                    rezultat = Double.toString(r.getCoef()) + "x^" + Double.toString(r.getRank());
            } else {
                if (r.getRank() == 0)
                    rezultat = rezultat + " + " + r.getCoef();
                else if (r.getCoef() == 0)
                    rezultat = rezultat;
                else
                    rezultat = rezultat + " + " + Double.toString(r.getCoef()) + "x^" + Double.toString(r.getRank());
            }
        }
        return rezultat;
    }

    public String makeString(ArrayList<Molinom> rez) {
        String rezultat = new String();

        for (Molinom r : rez) {

            if (rez.indexOf(r) == 0) {
                if (r.getRank() == 0)
                    rezultat = rezultat + r.getCoef();
                else if (r.getCoef() == 0)
                    rezultat = rezultat;
                else
                    rezultat = Integer.toString(r.getCoef()) + "x^" + Integer.toString(r.getRank());
            } else {
                if (r.getRank() == 0)
                    rezultat = rezultat + " + " + r.getCoef();
                else if (r.getCoef() == 0)
                    rezultat = rezultat;
                else
                    rezultat = rezultat + " + " + Integer.toString(r.getCoef()) + "x^" + Integer.toString(r.getRank());
            }
        }
        return rezultat;
    }

    public String sum(Polinom polinom1, Polinom polinom2) {
        ArrayList<Molinom> rez = new ArrayList<>();
        Boolean ok = false;
        if (polinom1.getTermeni().size() < polinom2.getTermeni().size()) {
            ArrayList<Molinom> au = new ArrayList<Molinom>();
            au = polinom1.getTermeni();
            polinom1.setTermeni(polinom2.getTermeni());
            polinom2.setTermeni(au);
        }
        ArrayList<Molinom> deSters = new ArrayList<>();
        //primul polinom iterat va fi polinomul cu mai multi termeni
        for (Molinom m1 : polinom1.getTermeni()) {
            ok = false;
            Molinom aux = new Molinom(1, 1);
            for (Molinom m2 : polinom2.getTermeni()) {
                if (m1.getRank() == m2.getRank()) {
                    aux.setRank(m1.getRank());
                    aux.setCoef(m1.getCoef() + m2.getCoef());
                    rez.add(aux);
                    deSters.add(m2);
                    ok = true;
                    break;
                }
            }
            if (ok == false)
                rez.add(m1);
        }
        for (Molinom m : deSters)
            polinom2.getTermeni().remove(m);
        for (Molinom m : polinom2.getTermeni())
            rez.add(m);
        Collections.sort(rez, new SortByRank());
        String rezultat = new String();
        rezultat = makeString(rez);
        return rezultat;
    }

    public String min(Polinom polinom1, Polinom polinom2) {
        ArrayList<Molinom> rez = new ArrayList<>();
        Boolean ok = false;
        ArrayList<Molinom> deSters = new ArrayList<>();
        if (polinom1.getTermeni().size() < polinom2.getTermeni().size()) {
            ArrayList<Molinom> au = new ArrayList<Molinom>();
            au = polinom1.getTermeni();
            polinom1.setTermeni(polinom2.getTermeni());
            polinom2.setTermeni(au);
        }
        for (Molinom m1 : polinom1.getTermeni()) {
            ok = false;
            Molinom aux = new Molinom(1, 1);
            for (Molinom m2 : polinom2.getTermeni()) {
                if (m1.getRank() == m2.getRank()) {
                    aux.setRank(m1.getRank());
                    aux.setCoef(m1.getCoef() - m2.getCoef());
                    rez.add(aux);
                    deSters.add(m2);
                    ok = true;
                    break;
                }
            }
            if (ok == false) {
                rez.add(m1);
            }
            // P1 si P2 polinoame
            //practic daca avem P1 - P2 si P2 este mai mare
        }
        for (Molinom m : deSters)
            polinom2.getTermeni().remove(m);
        for (Molinom m : polinom2.getTermeni()) {
            m.setCoef(-m.getCoef());
            rez.add(m);
        }
        Collections.sort(rez, new SortByRank());
        String rezultat = new String();
        rezultat = makeString(rez);
        return rezultat;
    }

    public String mul(Polinom p1, Polinom p2) {
        ArrayList<Molinom> rez = new ArrayList<>();
        Polinom fin;
        for (Molinom m1 : p1.getTermeni())
            for (Molinom m2 : p2.getTermeni()) {
                Molinom aux = new Molinom();
                aux.setCoef(m1.getCoef() * m2.getCoef());
                aux.setRank(m1.getRank() + m2.getRank());
                rez.add(aux);
            }
        fin = new Polinom(rez);
        Polinom fin1 = new Polinom();
        String s = sum(fin1, fin);
        return s;
    }

    public String derivate(Polinom p1) {
        ArrayList<Molinom> rez = new ArrayList<>();
        for (Molinom m : p1.getTermeni()) {
            Molinom aux = new Molinom();
            aux.setCoef(m.getCoef() * m.getRank());
            aux.setRank(m.getRank() - 1);
            rez.add(aux);
        }
        Collections.sort(rez, new SortByRank());
        String rezultat = new String();
        rezultat = makeString(rez);
        return rezultat;
    }

    public String integer(Polinom p) {
        ArrayList<DoubleMolinom> rez = new ArrayList<>();
        for (Molinom m : p.getTermeni()) {
            double aux1 = 0, aux2 = 0;
            aux1 = (double) m.getCoef() / (m.getRank() + 1);
            aux2 = (double) (m.getRank() + 1);
            DoubleMolinom mo = new DoubleMolinom(aux1, aux2);
            rez.add(mo);
        }
        String rezultat = new String();
        rezultat = makeStringfromDouble(rez);
        return rezultat;
    }
}
