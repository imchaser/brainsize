package services;

import DAOs.BangDiemDAO;
import DAOs.CauHoiDAO;
import Entities.BangDiem;
import Entities.CauHoi;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class PlayGameService {

    private CauHoiDAO ch = new CauHoiDAO();
    private ArrayList<CauHoi> listCH = null;
    private BangDiemDAO bd = new BangDiemDAO();

    //lấy ra ngẫu nhiên id câu hỏi
    public int getIDCH(int stt, Vector listID) {
        int id = 0;
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
        if (!listID.contains(id)) {
            do {
                id = rd.ints(min, listCH.size() + 1).limit(1).findFirst().getAsInt();
            } while (listID.contains(id));
            listID.add(id);
        }
        return id;
    }

    //lấy ra đáp án A,B,C,D để hiển thị theo câu hỏi có id tương ứng
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

//kiểm tra phương án chọn đúng hay sai
    public boolean ktKQ(int id, String kq) {
        return ch.getCH(id).getKetQua().equals(kq);
    }

//tính thời gian
    public String displayTime(int time) {
        int minute = time / 60;
        int Second = time - minute * 60;
        String display = minute + ":" + Second;
        if (Second < 10) {
            display = minute + ":0" + Second;
        }
        return display;
    }
   //trợ giúp 5050
    public  void sp5050(){
        
    }
//tinh điểm
    public int score(int stt, boolean nn, boolean dch){
        int diem=0;
        int x = stt-1;
        if(x<=5){
            diem=x*5;
        }else if(x>5 && x<=10){
            diem=(x-5)*10+25;
        }else{
            diem=(x-10)*15+75;
        }
        if(nn){
            diem = diem - 10;
        }
        if(dch){
            diem = diem - 5;
        }
        return diem;
    }
    public void saveScore(String name,int score){
        bd.saveScore(new BangDiem( name, score));
    }
}
