
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
        int i = 0;
        Vector v = new Vector();
        Random rd = new Random();
       do{
           i=rd.ints(1, 5).limit(1).findFirst().getAsInt();
           
       }while(v.contains(i));
 for(int a=0;i<v.size();a++){
     System.out.println(v.get(a));
 }
    }

}