
import DAOs.CauHoiDAO;
import Entities.CauHoi;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import presentations.StartGame;
import services.PlayGameService;

public class Test {

    public static void main(String[] args) {
        CauHoiDAO ch = new CauHoiDAO();
        ArrayList<CauHoi> lst = ch.getListCH(1);
        System.out.println(lst.get(lst.size()-1).getIDCH());

    }

    public String run(int time) {
        String displayTime="";
        int minute = time / 60;
        int Second = time - minute * 60;
        displayTime = minute + ":" + Second;
        if (Second < 10) {
            displayTime = minute + ":0" + Second;
        }

        return displayTime;

    }
}
