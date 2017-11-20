
import DAOs.CAUHOIdao;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import services.PlayGameService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Duong
 */
public class Test {

    private static CAUHOIdao ch = new CAUHOIdao();
    private static ArrayList<CAUHOIdao> listCH = null;
    private static PlayGameService sv = new PlayGameService();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=1;i<=5;i++){
        System.out.println(sv.getIDCH(i,v));
            System.out.println(v.size());
        }
 
    }

}
