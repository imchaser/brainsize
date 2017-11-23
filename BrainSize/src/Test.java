
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import presentations.StartGame;

public class Test {

    public static void main(String[] args) {
        String time = "";
        System.out.println();

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
