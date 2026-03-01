package net.soukaina.pres;

import net.soukaina.dao.DaoImpl;
import net.soukaina.ext.DaoImplV2;
import net.soukaina.metier.MetierImpl;
// la couche presentation est ouvert a la modification
public class Pres1 {
    public static void main(String[] args){
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //injection des dépendances via le setter
        //metier.setDao(d);
        System.out.println("Res =" +metier.calcul());


    }
}
