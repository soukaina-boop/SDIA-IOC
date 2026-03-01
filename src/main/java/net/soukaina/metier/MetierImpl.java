package net.soukaina.metier;

import net.soukaina.dao.IDao;

public class MetierImpl implements IMetier {
     private IDao dao ;// Couplage faible

    /**
     déclrer un constrecteur method 2 (crier un objet de type metierimpl)
     pour injecter dans l'attrebut dao un objet d'une classe
     qui implemente l'interface IDao au moment de la crition de l'objet  plus rapid
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double Res = t * 12 *Math.PI/2 *Math.cos(t);
        return Res;
    }

    /** initialiser le variable dao method1
     * pour injecter dans l'attrebut dao un objet d'une classe
     * qui implemente l'interface IDao pres la criation dde l'objet
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }


}


