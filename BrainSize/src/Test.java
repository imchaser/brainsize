
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

        for (int i = 1; i <= 4; i++) {
            int a = Integer.parseInt(Math.round(Math.random() * 4)+"");
            System.out.println(a);
        }
    }
}
