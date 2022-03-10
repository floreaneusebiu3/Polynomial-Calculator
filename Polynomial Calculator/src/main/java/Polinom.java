import java.util.ArrayList;
import java.util.Collections;
import java.util.function.UnaryOperator;

public class Polinom {
    private ArrayList<Molinom> termeni;

    public ArrayList<Molinom> getTermeni() {
        return termeni;
    }

    public void setTermeni(ArrayList<Molinom> termeni) {
        this.termeni = termeni;
    }

    public Polinom(ArrayList<Molinom> termeni) {
        this.termeni = termeni;
    }
    public Polinom()
    {
         this.termeni= new ArrayList<>();
    }

    public ArrayList<Molinom> getPoli() {
        return termeni;
    }

    public void setPoli(ArrayList<Molinom> termeni) {
        this.termeni = termeni;
    }

    public void adauga(Molinom m)
    {
        this.termeni.add(m);
    }

}
