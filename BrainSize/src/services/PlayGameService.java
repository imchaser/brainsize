package services;

import DAOs.CAUHOIdao;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PlayGameService {

    private CAUHOIdao ch = new CAUHOIdao();
    private ArrayList<CAUHOIdao> listCH = null;

    public int getIDCH(int stt, Vector listID) {
        int a = 0;
        int min = 1;
        Random rd = new Random();
        if (stt <= 5) {
            listCH = ch.getListCH(1);
        } else if (stt > 5 && stt <= 10) {
            listCH = ch.getListCH(2);
        } else if (stt > 10 && stt <= 15) {
            listCH = ch.getListCH(3);
        }
        min = listCH.get(0).getIDCH();
        if (!listID.contains(a)) {
            do {
                a = rd.ints(min, listCH.size() + 1).limit(1).findFirst().getAsInt();
            } while (listID.contains(a));
            listID.add(a);
        }
        return a;
    }

    public String getDA(int id, int i) {
        String da = "";
        switch (i) {
            case 1:
                da = ch.getCH(id).getDapAn1();
                break;
            case 2:
                da = ch.getCH(id).getDapAn2();
                break;
            case 3:
                da = ch.getCH(id).getDapAn3();
                break;
            case 4:
                da = ch.getCH(id).getDapAn4();
                break;
            default:
                break;
        }
        return da;
    }

    public boolean ktKQ(int id, String kq) {
        if (ch.getCH(id).getKetQua().equals(kq)) {
            return true;
        } else {
            return false;
        }
    }

    public class Timing extends Thread {

        JLabel lbltime;
        JFrame play;
        JFrame over;
        private int i = 61;
        private int j = 0;

        public void setI(int i) {
            this.i = i;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public Timing(JLabel lbltime, JFrame play, JFrame over) {
            this.lbltime = lbltime;
            this.play = play;
            this.over = over;
        }

        public void run() {
            while (i > 0) {
                i--;
                int minute = i / 60;
                int Second = i - minute * 60;
                String time = minute + ":" + Second;
                if (Second < 10) {
                    time = minute + ":0" + Second;
                }
                lbltime.setText(time);
                if (lbltime.getText().equals("0:00")) {
                    JOptionPane.showMessageDialog(null, "Game over!");
                    over.setVisible(true);
                    play.dispose();
                }
                try {
                    j++;
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
        }

        public void reSet() {
            this.setI(61);
            this.setJ(0);
        }
    }
}
