package services;

import DAOs.BangDiemDAO;
import java.io.BufferedReader;
import java.io.FileReader;

public class OtherService {

    private BangDiemDAO bd = new BangDiemDAO();

    public String rank(int top) {
        return bd.getRank(top).getTen() + " - " + bd.getRank(top).getDiem() + " điểm.";
    }

    public String helpText(String filename){
        String help = "";
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while (true) {                
                String line = br.readLine();
                if(line == null){
                    break;
                } else{
                    help += line + "\n";
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return help;
    }
}
