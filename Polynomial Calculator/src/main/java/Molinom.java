class Molinom {
    private int coef;
    private int rank;

    public Molinom(int coef, int rank) {
        this.coef = coef;
        this.rank = rank;
    }

    public Molinom() {
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return coef + "x^" + rank;
    }
}
