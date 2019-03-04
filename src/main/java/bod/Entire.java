package bod;

import bod.dynamic.*;
import com.trolltech.qt.core.QTimer;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Entire extends QWidget {
    public UpperBills upperbills;

    public Entire(){
        Globals.ui = new Ui_clickerAppForm();
        Globals.ui.setupUi(this);
        show();


    }

    private void start(){
        Globals.counter = new Counter();
        upperbills = new UpperBills();

        new BestRecord();
        Blind blind = new Blind();

        //update upper counter
        Globals.ui.firstUpperBillPushButton.clicked.connect(this, "updateCounter()");
        Globals.ui.secondUpperBillPushButton.clicked.connect(this, "updateCounter()");

        //swap upper bills
        Globals.ui.firstUpperBillPushButton.clicked.connect(this, "swapBills()");
        Globals.ui.secondUpperBillPushButton.clicked.connect(this, "swapBills()");

        //update speedometer
        Speedometer speedometer = new Speedometer();
        QTimer speedometerTimer = new QTimer(this);
        for(int i = 0; i < Globals.runtime; i++)
        {
            speedometerTimer.start(1000);
            speedometerTimer.timeout.connect(speedometer, "fixVal()");

        }



        //close the blind in the end
        QTimer blindTimer = new QTimer(this);
        blindTimer.start(Globals.runtime * 1000);

        blindTimer.timeout.connect(blind, "closeBlind()");
    }

    private void updateCounter(){
        Globals.counter.incrementVal(1, 0);
    }

    private void swapBills(){
        upperbills.throwing();
    }

    public static void main(String[] args) {
        new Globals();

        QApplication.initialize(args);

        Entire entire = new Entire();
        entire.start();

        QApplication.exec();

    }
}
