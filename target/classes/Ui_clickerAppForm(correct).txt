package bod;
/********************************************************************************
 ** Form generated from reading ui file 'layout.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_clickerAppForm implements com.trolltech.qt.QUiForm<QWidget>
{
    public QFrame speedometerFrame;
    public QLabel speedometerLabel;
    public QLabel bestRecordLabel;
    public QFrame moneyPackFrame;
    public QFrame headerFrame;
    public QLabel counterLabel;
    public QFrame blindFrame;
    public QPushButton firstUpperBillPushButton;
    public QPushButton secondUpperBillPushButton;

    public Ui_clickerAppForm() { super(); }

    public void setupUi(QWidget clickerAppForm)
    {
        clickerAppForm.setObjectName("clickerAppForm");
        clickerAppForm.resize(new QSize(461, 871).expandedTo(clickerAppForm.minimumSizeHint()));
        clickerAppForm.setMinimumSize(new QSize(461, 871));
        clickerAppForm.setMaximumSize(new QSize(461, 871));
        clickerAppForm.setStyleSheet("background: lightblue;");
        speedometerFrame = new QFrame(clickerAppForm);
        speedometerFrame.setObjectName("speedometerFrame");
        speedometerFrame.setGeometry(new QRect(130, 120, 191, 61));
        QFont font = new QFont();
        font.setPointSize(11);
        speedometerFrame.setFont(font);
        speedometerFrame.setStyleSheet("color: #000; \n"+
"background: lightgrey;\n"+
"border: 1px solid lightgrey; \n"+
"border-radius: 16px;");
        speedometerFrame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        speedometerFrame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        speedometerLabel = new QLabel(speedometerFrame);
        speedometerLabel.setObjectName("speedometerLabel");
        speedometerLabel.setGeometry(new QRect(20, 30, 61, 21));
        QFont font1 = new QFont();
        font1.setPointSize(11);
        speedometerLabel.setFont(font1);
        speedometerLabel.setStyleSheet("background: grey;\n"+
"border: 1px solid grey;\n"+
"color: #fff;\n"+
"border-radius: 8px;\n"+
"");
        bestRecordLabel = new QLabel(speedometerFrame);
        bestRecordLabel.setObjectName("bestRecordLabel");
        bestRecordLabel.setGeometry(new QRect(100, 30, 71, 21));
        QFont font2 = new QFont();
        font2.setPointSize(11);
        bestRecordLabel.setFont(font2);
        bestRecordLabel.setStyleSheet("background: grey;\n"+
"border: 1px solid grey;\n"+
"color: orange;\n"+
"border-radius: 8px;\n"+
"");
        moneyPackFrame = new QFrame(clickerAppForm);
        moneyPackFrame.setObjectName("moneyPackFrame");
        moneyPackFrame.setGeometry(new QRect(90, 270, 331, 571));
        moneyPackFrame.setStyleSheet("background: darkgreen;");
        moneyPackFrame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        moneyPackFrame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        firstUpperBillPushButton = new QPushButton(clickerAppForm);
        firstUpperBillPushButton.setObjectName("firstUpperBillPushButton");
        firstUpperBillPushButton.setGeometry(new QRect(90, 270, 271, 571));
        QFont font4 = new QFont();
        font4.setPointSize(80);
        firstUpperBillPushButton.setFont(font4);
        firstUpperBillPushButton.setStyleSheet("background: limegreen; color: darkgreen;");

        secondUpperBillPushButton = new QPushButton(clickerAppForm);
        secondUpperBillPushButton.setObjectName("secondUpperBillPushButton");
        secondUpperBillPushButton.setGeometry(new QRect(90, -430, 271, 571));
        QFont font5 = new QFont();
        font5.setPointSize(80);
        secondUpperBillPushButton.setFont(font5);
        secondUpperBillPushButton.setStyleSheet("background: limegreen; color: darkgreen");

        headerFrame = new QFrame(clickerAppForm);
        headerFrame.setObjectName("headerFrame");
        headerFrame.setGeometry(new QRect(0, 0, 461, 141));
        headerFrame.setStyleSheet("background: navy;");
        headerFrame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        headerFrame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        counterLabel = new QLabel(headerFrame);
        counterLabel.setObjectName("counterLabel");
        counterLabel.setGeometry(new QRect(190, 90, 61, 21));
        QFont font3 = new QFont();
        font3.setPointSize(14);
        counterLabel.setFont(font3);
        counterLabel.setStyleSheet("color: #fff");



        blindFrame = new QFrame(clickerAppForm);
        blindFrame.setObjectName("blindFrame");
        blindFrame.setGeometry(new QRect(461, 0, 461, 871));
        blindFrame.setMaximumSize(new QSize(461, 871));
        blindFrame.setStyleSheet("background: rgba(0, 0, 0, 230)");
        blindFrame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        blindFrame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        retranslateUi(clickerAppForm);

        clickerAppForm.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget clickerAppForm)
    {
        clickerAppForm.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "ClickerApplication", null));
        speedometerLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "$0.00", null));
        bestRecordLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "$0.00", null));
        counterLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "$0.00", null));
        firstUpperBillPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "1", null));
        secondUpperBillPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("clickerAppForm", "2", null));
    } // retranslateUi

}

