package bod.dynamic;

public class Money {
    private Integer dollars, cents;
    public Integer localDolls, localCents;

    protected Money(){
        this.dollars = 0;
        this.cents = 0;
    }

    public void setVal(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars(){
        return this.dollars;
    }

    public int getCents(){
        return  this.cents;
    }

    public String getVal(){
        return '$' + this.dollars.toString() + '.' + this.cents.toString();
    }

}
