package bod.dynamic;

import bod.Globals;

import java.sql.SQLOutput;

public class Speedometer extends Counter {
    private int oldDollars;
    private int oldCents;

    public Speedometer(){
        super();

        oldDollars = 0;
        oldCents = 0;
    }

    @Override
    public void showVal(){
        Globals.ui.speedometerLabel.setText(this.getVal());
    }

    int counter = 0;
    public void fixVal(){


        int newDollars = Globals.counter.getDollars();
        int newCents = Globals.counter.getCents();
        
        

        this.localDolls = newDollars - oldDollars;

        if(newCents < oldCents){
            this.localDolls--;
            newCents += 100;
        }
        this.localCents = newCents - oldCents;
        this.setVal(this.localDolls, this.localCents);
        this.showVal();

        
        counter++;
        if(counter == 10) {
            oldDollars = newDollars;
            oldCents = newCents;
            counter = 0;
        }


    }
}
