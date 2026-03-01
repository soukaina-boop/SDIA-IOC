package net.soukaina.pres;

import net.soukaina.dao.IDao;
import net.soukaina.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String [] args) throws  Exception{
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d =(IDao) cDao.newInstance();// appel constrecteur snt parametre
        //on change dans le fichier ext

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =  (IMetier) cMetier .getConstructor(IDao.class).newInstance(d);
        System.out.println("Res =" +metier.calcul());

// Créer une application fermée à la modification et ouverte à l’extension en utilisant un framework.

    }
}
