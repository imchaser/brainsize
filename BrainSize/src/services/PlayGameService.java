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
    private int i = 0;

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
                id = rd.ints(min, listCH.get(listCH.size() - 1).getIDCH() + 1).limit(1).findFirst().getAsInt();
            } while (listID.contains(id));
            listID.add(id);
        }
        return id;
    }

    //lấy nội dung câu hỏi theo id
    public String getNDCH(int idCH) {
        return ch.getCH(idCH).getCauHoi();
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

    public String sp5050(int idCH, String dapAn) {
        String da = ch.getCH(idCH).getKetQua();
        if (!dapAn.equals(da) && i < 2) {
            dapAn = "";
            i++;
        }
        return dapAn;
    }
//tinh điểm

    public int score(int stt, boolean nn, boolean dch) {
        int diem = 0;
        int x = stt - 1;
        if (x <= 5) {
            diem = x * 5;
        } else if (x > 5 && x <= 10) {
            diem = (x - 5) * 10 + 25;
        } else {
            diem = (x - 10) * 15 + 75;
        }
        if (nn) {
            diem = diem - 10;
        }
        if (dch) {
            diem = diem - 5;
        }
        return diem;
    }

    //lưu tên người chơi và số điểm
    public void saveScore(String name, int score) {
        bd.saveScore(new BangDiem(name, score));
    }
    //lấy số để ramdom đáp án theo thứ tự ngẫu nhiên
    public Vector randomDA() {
        int da = 0;
        Vector listDA = new Vector();
        Random rd = new Random();
        for (int i = 1; i <= 4;) {
            da = rd.ints(1,5).limit(1).findFirst().getAsInt();
            if (!listDA.contains(da)) {
                listDA.add(da);
                i++;
            }
        }
        return listDA;
    }
}
