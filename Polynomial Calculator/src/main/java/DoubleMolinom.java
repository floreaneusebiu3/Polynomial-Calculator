public class DoubleMolinom {
    private double coef;
    private double rank;
    public DoubleMolinom(double coef, double rank)
    {
        this.coef = coef;
        this.rank = rank;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
