package bod.dynamic;

import bod.Globals;
import com.trolltech.qt.core.QByteArray;
import com.trolltech.qt.core.QPropertyAnimation;
import com.trolltech.qt.core.QRect;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class Blind{
    public void closeBlind(){
        Globals.ui.blindFrame.setGeometry(new QRect(0, 0, 461, 871));

        QPropertyAnimation animation = new QPropertyAnimation(Globals.ui.blindFrame, new QByteArray("geometry"));
        animation.setDuration(500);
        animation.setStartValue(new QRect(461, 0, 461, 871));
        animation.setEndValue(new QRect(0, 0, 461, 871));

        animation.start();


        //compare current record and best record to write the best one to the file
        Double bestRecord = Double.parseDouble(Globals.ui.bestRecordLabel.text().replace("$", ""));
        Double currentRecord = Double.parseDouble(Globals.ui.counterLabel.text().replace("$", ""));
        if(currentRecord > bestRecord)
            bestRecord = currentRecord;
        //System.out.println("user.home: " + System.getProperty("user.home"));
        File file = new File(System.getProperty("user.home") + File.separator + "clickerRecord.txt");


        try(FileWriter fooWriter = new FileWriter(file, false)){
            //WRITE THE BEST RECORD TO FILE
            fooWriter.write("$" + bestRecord.toString());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
