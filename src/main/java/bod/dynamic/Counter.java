package bod.dynamic;

import bod.Entire;
import bod.Globals;

public class Counter extends Money {
    public Counter(){
        super();
    }

    public void incrementVal(int toDolls, int toCents){
        localDolls = this.getDollars() + toDolls;
        localCents = this.getCents() + toCents;
        this.setVal(localDolls, localCents);

        //normalize
        localCents = this.getCents();
        if(localCents >= 100){
            this.setVal(localCents /100, localCents % 100);
        }

        this.showVal();
    }

    public void showVal(){
        Globals.ui.counterLabel.setText(this.getVal());
    }
}
