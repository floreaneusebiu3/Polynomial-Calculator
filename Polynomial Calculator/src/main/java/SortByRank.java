import java.util.Comparator;

public class SortByRank implements Comparator<Molinom> {

    public int compare(Molinom m1, Molinom m2)
    {
        return  m2.getRank()- m1.getRank();
    }

}
