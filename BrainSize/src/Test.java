
import DAOs.CAUHOIdao;
import java.util.ArrayList;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CAUHOIdao ch = new CAUHOIdao();
        ArrayList<CAUHOIdao> c = ch.getListCH(1);
        for(CAUHOIdao x: c){
            System.out.println(x.getCauHoi());
        }
    }
    
}
