package bod.dynamic;

import bod.Globals;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class BestRecord{
    private String val;

    public void setFirstRecord(File file){
        try{
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            val = "$0.00";
            br.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        Globals.ui.bestRecordLabel.setText(val);
    }

    public BestRecord(){
        File file = new File(System.getProperty("user.home") + File.separator + "clickerRecord.txt");
        try {
            if(!file.createNewFile()){
                setFirstRecord(file);
            }
        }catch(IOException e){
            e.printStackTrace();
        }


        try {
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            val = br.readLine();
            br.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        Globals.ui.bestRecordLabel.setText(val);
    }
}

