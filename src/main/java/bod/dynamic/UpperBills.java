package bod.dynamic;

import bod.Globals;
import com.trolltech.qt.core.QByteArray;
import com.trolltech.qt.core.QPropertyAnimation;
import com.trolltech.qt.core.QRect;
import com.trolltech.qt.gui.QFrame;
import com.trolltech.qt.gui.QPushButton;

public class UpperBills {
    private QPushButton upperBill = Globals.ui.firstUpperBillPushButton;
    private QPushButton lowerBill = Globals.ui.secondUpperBillPushButton;
    private QPushButton temp;

    public void throwing(){
        //move from 270 to -430 smoothly
        QPropertyAnimation animation = new QPropertyAnimation(upperBill, new QByteArray("geometry"));
        animation.setDuration(100);
        animation.setStartValue(new QRect(90, 270, 281, 571));
        animation.setEndValue(new QRect(90, -430, 281, 571));

        animation.start();

        lowerBill.setGeometry(90, 270, 281, 571);

        temp = upperBill;
        upperBill = lowerBill;
        lowerBill = temp;

    }
}
