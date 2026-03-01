package net.soukaina.metier;

import net.soukaina.dao.IDao;

public class MetierImpl implements IMetier {
     private IDao dao ;// Couplage faible
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }
    /** initialiser le variable dao method1
     * pour injecter dans l'attrebutdao un objet d'une classe
     * qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    /**
     * déclrer un constrecteur method 2 (crie un objet de type metierimpl)
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }
}


