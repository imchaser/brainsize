package services;

import DAOs.BANGDIEMdao;
import java.io.BufferedReader;
import java.io.FileReader;

public class OtherService {

    private BANGDIEMdao bd = new BANGDIEMdao();

    public String rank(int top) {
        return bd.getRank(top).getTen() + " - " + bd.getRank(top).getDiem();
    }

    public String helpText(String filename){
        String help = null;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while (true) {                
                String line = br.readLine();
                if(line == null){
                    break;
                } else{
                    help = line;
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return help;
    }
}
