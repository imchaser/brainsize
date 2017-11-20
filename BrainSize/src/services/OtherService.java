package services;

import DAOs.BANGDIEMdao;

public class OtherService {
    private BANGDIEMdao bd = new BANGDIEMdao();
    
    public String rank(int top){
        return bd.getRank(top).getTen()+" - "+bd.getRank(top).getDiem();
    }
}
