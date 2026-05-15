package metier;

import dao.IDao;

public class MetierImpl implements Imetier{
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 25 ;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
